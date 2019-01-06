<#--引入模板-->
<#include "po.ftl">

<#--执行模板-->
<#if  hrarg.type = "id">
<#if atype = "po">
        <@sqlserverpo cs=csarg hr=hrarg/>
</#if>
</#if>
