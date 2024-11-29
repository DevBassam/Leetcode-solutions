WITH price_unit AS(
    SELECT prices.product_id, SUM(units) AS ttl_units, SUM(unitssold.units*prices.price) AS ttl_price
    FROM prices
    LEFT JOIN unitssold
    ON prices.product_id = unitssold.product_id
    WHERE unitssold.purchase_date >= prices.start_date
    AND unitssold.purchase_date <= prices.end_date
    GROUP BY prices.product_id
)

SELECT DISTINCT prices.product_id, COALESCE(ROUND(ttl_price/ttl_units,2),0) AS average_price 
FROM prices
LEFT JOIN price_unit
ON prices.product_id = price_unit.product_id
