SET @total = 0;

SELECT
    @total := COUNT(DISTINCT user_id)
FROM
    user_info
WHERE
    YEAR(joined) = 2021;

SELECT
    YEAR(o.sales_date) AS year,
    MONTH(o.sales_date) AS month,
    COUNT(DISTINCT o.user_id) AS purchased_users,
    ROUND(COUNT(DISTINCT o.user_id) / @total, 1) AS puchased_ratio
FROM
    online_sale o
JOIN user_info u ON o.user_id = u.user_id AND YEAR(u.joined) = 2021
GROUP BY
    year,
    month
ORDER BY
    year,
    month;