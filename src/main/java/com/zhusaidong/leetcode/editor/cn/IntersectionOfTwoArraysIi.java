package com.zhusaidong.leetcode.editor.cn;


import java.util.Arrays;

/**
 * //给定两个数组，编写一个函数来计算它们的交集。
 * //
 * // 示例 1：
 * // 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * //输出：[2,2]
 * <p>
 * // 示例 2:
 * // 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * //输出：[4,9]
 * //
 * // 说明：
 * // 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * // 我们可以不考虑输出结果的顺序。
 * //
 * // 进阶：
 * // 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * // 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * // 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * //
 * // Related Topics 排序 哈希表 双指针 二分查找
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/">两个数组的交集 II</a>
 */
public class IntersectionOfTwoArraysIi{
    static
            //leetcode submit region begin(Prohibit modification and deletion)
    class Solution{
        public int[] intersect(int[] nums1, int[] nums2){
            if(nums1.length == 0 || nums2.length == 0){
                return null;
            }
            
            if(nums1.length < nums2.length){
                int[] temp = nums2;
                nums2 = nums1;
                nums1 = temp;
            }
            //System.out.println(Arrays.toString(nums1));
            //System.out.println(Arrays.toString(nums2));
            
            boolean[] finds = new boolean[nums1.length];
            Arrays.fill(finds, false);
            
            int count = 0;
            for(int value : nums2){
                for(int j = 0; j < nums1.length; j++){
                    if(finds[j]){
                        continue;
                    }
                    //System.out.println("nums2[i]=" + value + ",nums1[j]=" + nums1[j]);
                    if(value == nums1[j]){
                        finds[j] = true;
                        count++;
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(finds));
            
            int[] num = new int[count];
            for(int i = 0; i < finds.length; i++){
                if(finds[i]){
                    num[num.length - count] = nums1[i];
                    count--;
                }
            }
            
            //System.out.println(Arrays.toString(num));
            
            return num;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
