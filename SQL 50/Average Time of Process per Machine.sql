SELECT a1.machine_id, ROUND(AVG(ABS(a2.timestamp - a1.timestamp)),3) AS processing_time
FROM Activity AS a1
INNER JOIN Activity AS a2
ON a1.machine_id = a2.machine_id
AND a1.process_id = a2.process_id
AND a1.activity_type != a2.activity_type
GROUP BY a1.machine_id
