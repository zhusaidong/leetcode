# leetcode



## idea 插件

TempFilePath: `D:\java\IDEAProjects\leetcode\src\main\com\zhusaidong`

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
	/*
	package com.zhusaidong.leetcode.editor.cn;

    import org.junit.*;

	public class $!velocityTool.camelCaseName(${question.titleSlug})Test{
	@Test
	public void testSolution(){
			$!velocityTool.camelCaseName(${question.titleSlug}) .Solution solution = 
			new $!velocityTool.camelCaseName(${question.titleSlug}) .Solution();
			
			//Assert
			
		}
	}
	
	*/
	static
	${question.code}
}

```



