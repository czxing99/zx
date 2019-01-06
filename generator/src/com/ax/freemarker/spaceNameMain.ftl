<#import "spaceName.ftl" as my> <#-- the hash called "my" will be the "gate" -->
<@my.copyright date="1999-2002"/>
${my.mail}

<#assign x = "something">
<#--${indexOf("met", x)}
${indexOf("foo", x)}-->
====
${indexOf("foo", x).m1.a}
===
<#--
/lib/yourcompany.com/your_library.ftl-->
<#--去空格处理-->
<#compress>
  <#assign users = [{"name":"Joe",        "hidden":false},
  {"name":"James Bond", "hidden":true},
  {"name":"Julia",      "hidden":false}]>
List of users:
  <#list users as user>

    <#if !user.hidden>

  - ${user.name}
    </#if>
  </#list>

That's all.
  </#compress>
