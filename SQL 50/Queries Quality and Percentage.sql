WITH get_quality AS(
SELECT query_name, ROUND(SUM(rating/position)/Count(*),2) quality
FROM queries
GROUP BY query_name),

get_poor_query_percentage AS(
SELECT query_name, ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / COUNT(*) * 100,2) poor_query_percentage
FROM queries
GROUP BY query_name)

SELECT get_quality.query_name, quality, poor_query_percentage
FROM get_quality
INNER JOIN get_poor_query_percentage
ON get_poor_query_percentage.query_name = get_quality.query_name
