SELECT PRODUCT.PRODUCT_NAME, SALES.YEAR, SALES.PRICE
FROM PRODUCT
INNER JOIN SALES
ON PRODUCT.PRODUCT_ID = SALES.PRODUCT_ID
