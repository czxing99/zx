<#macro sqlserverpo cs  hr >
package ${hr.baseUrl}.domain.${hr.model};
    <#assign aDateTime = .now>
    <#assign aDate = aDateTime?date>
    <#assign aTime = aDateTime?time>

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;
import java.util.Date;

/**
 * ${hr.memo}
 * @author ${hr.author} ${aDate?iso_utc}
 */

@AxTable(name = "${hr.tableName}")
public class ${hr.clazzName}  {

	private static final long serialVersionUID = -${hr.serUID}L;

    <#list cs as c>
        <#if c.name =="id">
	@AxId
    @AxColumn(name ="${c.name}", length = ${c.length})
    private ${c.type} ${c.name};
        <#elseif c.name !='ts'>
	@AxColumn(name ="${c.name}", length = ${c.length})
    private ${c.type} ${c.name};
        </#if>

    </#list>

    <#list cs as c>
        <#if c.name !='ts'>
    public ${c.type} get${c.name?cap_first}(){
        return ${c.name};
    }

    public void set${c.name?cap_first}(${c.type} ${c.name}){
        this.${c.name} = ${c.name};
    }
        </#if>
    </#list>
}
</#macro>