WITH cte AS
(SELECT user_id FROM user_actions
where EXTRACT(month from event_date)='6'
and EXTRACT(YEAR FROM event_date)='2022'
INTERSECT
SELECT user_id FROM user_actions
where EXTRACT(MONTH FROM event_date)='7'
and EXTRACT(YEAR FROM event_date)='2022')
select '7' AS month,count(user_id) as monthly_active_users
FROM cte
;