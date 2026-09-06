# Write your MySQL query statement below
select customer_id ,count(a.visit_id) 
as count_no_trans
from visits as a 
left join transactions as b 
on a.visit_id=b.visit_id 
where b.visit_id is null
group by a.customer_id
;  