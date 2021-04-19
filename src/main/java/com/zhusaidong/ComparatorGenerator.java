package com.zhusaidong;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhusaidong
 */
@SuppressWarnings({"unused", "unchecked"})
public abstract class ComparatorGenerator<T, R>{
    
    /**
     * 需要校验的方法
     *
     * @param args the args
     *
     * @return the list
     */
    protected abstract R methodsToBeValidated(List<Object> args);
    
    /**
     * 生成参数
     *
     * @return the list
     */
    protected abstract List<Object> inputDataGenerator();
    
    /**
     * 对数生成器
     *
     * @param args 参数
     *
     * @return the r
     */
    protected abstract R comparatorGenerator(List<Object> args);
    
    public boolean comparator(int times){
        for(int i = 0; i < times; i++){
            System.out.println("=================================time=" + (i + 1));
            List<Object> args = inputDataGenerator();
            
            R r = methodsToBeValidated(args);
            if(r != null && r.getClass().isArray()){
                System.out.println("need to be validated=" + Arrays.toString((int[])r));
            }
            
            R r1 = comparatorGenerator(args);
            if(r1 != null && r1.getClass().isArray()){
                System.out.println("right=" + Arrays.toString((int[])r1));
            }
            
            if(r == null){
                if(null != r1){
                    return false;
                }
            }else{
                if(r.getClass().isArray()){
                    int[] rr  = (int[])r;
                    int[] rr1 = (int[])r1;
                    for(int j = 0; j < rr.length; j++){
                        if(rr[j] != rr1[j]){
                            return false;
                        }
                    }
                }else{
                    if(!r.equals(r1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean comparator(){
        return comparator(1);
    }
    
    protected int[] generateArray(int len, int max){
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * max);
        }
        return arr;
    }
}
