userCol
===
```sql
id, name, age 
```

listByAge
===
```sql
select #{use("userCol")}
from user 
where age = #{age}
```