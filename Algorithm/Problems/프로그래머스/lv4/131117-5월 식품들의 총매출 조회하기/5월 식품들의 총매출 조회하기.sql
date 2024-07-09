SELECT
    p.product_id,
    p.product_name,
    SUM(f.amount) * p.price AS "total_sales"
FROM
    food_order f
JOIN 
    food_product p ON f.product_id = p.product_id
WHERE 
    YEAR(f.produce_date) = 2022
    AND MONTH(f.produce_date) = 5
GROUP BY 
    p.product_id
ORDER BY 
    total_sales DESC,
    p.product_id;