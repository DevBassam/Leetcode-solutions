SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE activity_date BETWEEN '2019-6-28' AND '2019-7-28'
GROUP BY activity_date
HAVING COUNT(user_id) <> 0
ORDER BY activity_date
