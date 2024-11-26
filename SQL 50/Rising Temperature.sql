WITH TemperatureComparison AS (
    SELECT
        id,
        temperature,
        LAG(temperature) OVER (ORDER BY recordDate) AS previous_temperature,
        recordDate - LAG(recordDate) OVER (ORDER BY recordDate) AS date_p
    FROM
        Weather
)
SELECT id FROM TemperatureComparison
WHERE temperature > previous_temperature AND date_p = 1
