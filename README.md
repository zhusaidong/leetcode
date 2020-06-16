# leetcode



## idea 插件

TempFilePath: `D:\java\IDEAProjects\leetcode\src\com\zhusaidong`

CodeFileName: `$!velocityTool.camelCaseName(${question.titleSlug})`

CodeTemplate: 

```
package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * ${question.content}
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/${question.titleSlug}/">${question.title}</a>
 */
public class $!velocityTool.camelCaseName(${question.titleSlug}){
	public static void main(String[] args){
		Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})()
				.new Solution();
		System.out.println(solution);
	}

    ${question.code}
}

```



