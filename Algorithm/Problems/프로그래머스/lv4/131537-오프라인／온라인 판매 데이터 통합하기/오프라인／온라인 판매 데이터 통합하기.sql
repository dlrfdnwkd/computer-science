SELECT 
    DATE_FORMAT(os.sales_date, '%Y-%m-%d') AS sales_date,
    os.product_id,
    os.user_id,
    os.sales_amount
FROM 
    online_sale AS os
WHERE 
    os.sales_date BETWEEN '2022-03-01' AND '2022-03-31'

UNION ALL

SELECT 
    DATE_FORMAT(ofs.sales_date, '%Y-%m-%d') AS sales_date,
    ofs.product_id,
    NULL AS user_id,
    ofs.sales_amount
FROM 
    offline_sale AS ofs
WHERE 
    ofs.sales_date BETWEEN '2022-03-01' AND '2022-03-31'

ORDER BY 
    sales_date, 
    product_id, 
    user_id;