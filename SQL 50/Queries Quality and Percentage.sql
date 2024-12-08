SELECT query_name,
        ROUND(SUM(rating/position)/Count(*),2) quality,
        ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / COUNT(*) * 100,2) poor_query_percentage
FROM queries
WHERE query_name IS NOT NULL
GROUP BY query_name
