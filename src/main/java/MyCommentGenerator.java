import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @author:ben.gu
 * @Date:2018/5/24 上午11:24
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    @Override public void addFieldComment(Field field, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
        // 添加字段注释.格式 /****/

        StringBuffer sb = new StringBuffer();
        field.addJavaDocLine("/**");
        if (introspectedColumn.getRemarks() != null) {
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
        }
        field.addJavaDocLine(" * ");
        field.addJavaDocLine(" */");

    }
}
