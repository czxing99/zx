<#macro greet1>
  <font size="+2">Hello Joe!</font> <#--宏 宏也可以传参进运类似于函数-->
</#macro>
<#macro greet person color>
  <font size="+2" color="${color}">Hello ${person}!</font>
</#macro>
<@greet1></@greet1>
<@greet1></@greet1><@greet1></@greet1>
<@greet1/>

<#macro border>
  <table border=4 cellspacing=0 cellpadding=4><tr><td>
    <#nested>
  </tr></td></table>
</#macro>
<#macro do_thrice>
    <#nested>
    <#nested>
    <#nested>
</#macro>
<@do_thrice>
  Anything.
</@do_thrice>

<#assign x = 5>
${(x/2)?int}
${1.1?int}
${1.999?int}
${-1.1?int}
${-1.999?int}
=====================
<@border>The bordered text</@border>
================2=
<@greet person="Fred" color="blacksss"/>
<#if mouse??>
  Mouse found
<#else>
  No mouse found
</#if>
Creating mouse...
<#assign mouse = "Jerry">
<#if mouse??>
  Mouse found
<#else>
  No mouse found
</#if>
<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<h1>Welcome ${user}!</h1> ${latestProduct.price /2+100}
<#--${avg(latestProduct.price,latestProduct.price1)}-->
<!-- 11 -->
<#list ["foo", "bar", "baz"] as x>
    ${x}
</#list>
<#assign s = "Hello ${user}!"> <#--赋值-->
${s}
${s[0]}
<#assign s1 = "ABCDEF">
${s1[2..3]}
${s1[2..<4]}
${s1[2..*3]}
${s1[2..*100]}
${s1[2..]}
<p>Our latest product:
    <a href="${latestProduct.url}">${latestProduct.name}</a>!
<#if user=="Big Joe"> Big Joe
    <#elseif user=="Big Joe1">
aaa
    <#else>
  user== "Big Joe" false
    </#if>
======Product============
${object.name}
${object.toString()}
${products?size}
    <#list products as p>
   set${p.name?cap_first }(int String a );
        ${p_index}
    <#--三元表达式 链式使用-->
       ${p.name?starts_with("a") ?string("a","b")}
    </#list>
<h1>Welcome ${user1!"visitor"}!</h1>
<#if user1??><h1>Welcome ${user}!</h1></#if>
<#--<#list product as products>
    ${product.name}
</#list>-->
</body>
</html>
====================================================
<#--<#include "test2.ftl">-->
==========================
<#--<#include "program12.html">-->

