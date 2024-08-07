SELECT
    p.product_code,
    p.price * SUM(o.sales_amount) AS sales
FROM
    product p
JOIN
    offline_sale o ON p.product_id = o.product_id
GROUP BY
    p.product_code
ORDER BY
    sales DESC, p.product_code;