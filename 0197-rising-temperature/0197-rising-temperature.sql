select id as Id from (
select id, temperature, recorddate,
       lag(temperature) over(order by recorddate) as prev_temp,
       lag(recorddate) over(order by recorddate) as prev_Date
from weather) w
where temperature > prev_temp
and datediff(recorddate, prev_date) = 1;