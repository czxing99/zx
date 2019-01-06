<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<h1>Welcome ${user}!</h1>
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
    ${p.name}
        ${p_index}
    </#list>
<#--<#list product as products>
    ${product.name}
</#list>-->
</body>
</html>

