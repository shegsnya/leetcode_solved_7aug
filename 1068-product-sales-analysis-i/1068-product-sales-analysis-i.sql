# Write your MySQL query statement below
select product_name,year,price
 from product as a
 inner join sales as b
on b.product_id=a.product_id;