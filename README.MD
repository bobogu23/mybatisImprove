此jar包可以给mybatis DO对象生成数据库对应的注释。
使用方式

1.mybatis-generator 插件添加依赖

			<plugin>
				<groupId>org.mybatis.generator</groupId>
				<artifactId>mybatis-generator-maven-plugin</artifactId>
				<version>1.3.5</version>
				<configuration>
					<!--允许移动生成的文件 -->
					<verbose>true</verbose>
					<!--允许覆盖生成的文件 -->
					<overwrite>true</overwrite>
				</configuration>
				<!-- 插件所依赖的包 -->
				<dependencies>
					<dependency>
						<groupId>org.mbatis.improve</groupId>
						<artifactId>commentGenerator</artifactId>
						<version>1.0-SNAPSHOT</version>
					</dependency>
				</dependencies>
			</plugin>

2.generatorConfig.xml 设置生成注释的自定义类

    <commentGenerator type="MyCommentGenerator">
     <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
     <property name="suppressAllComments" value="true" />
    </commentGenerator>