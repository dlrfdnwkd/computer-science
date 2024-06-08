SELECT 
    LEFT(product_code, 2) AS category,
    COUNT(product_id) AS products
FROM 
    product
GROUP BY 
    LEFT(product_code, 2)
ORDER BY 
    category;