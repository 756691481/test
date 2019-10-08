



<json:array name="items" var="item" items="${result.rows}">
    <json:object>
        <json:property name="id" value="${item.id}"/>
        <json:property name="firstname" value="${item.first}"/>
        <json:property name="lastname" value="${item.last}"/>
        <json:property name="age" value="${item.age}"/>
    </json:object>
</json:array>

</body>
</html>