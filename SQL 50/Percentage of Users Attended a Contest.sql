SELECT contest_id, ROUND((COUNT(register.user_id)/(SELECT COUNT(*) FROM users)*100),2) AS percentage
FROM users
JOIN register
ON register.user_id = users.user_id
GROUP BY contest_id
ORDER BY percentage desc, contest_id
