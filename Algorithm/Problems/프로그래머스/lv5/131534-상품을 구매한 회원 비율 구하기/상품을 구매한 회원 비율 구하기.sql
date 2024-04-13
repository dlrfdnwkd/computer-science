SET @total = 0;

SELECT
    @total := COUNT(DISTINCT user_id)
FROM
    user_info
WHERE
    DATE_FORMAT(joined, '%Y') = '2021';
    
SELECT
    DATE_FORMAT(o.sales_date, '%Y') AS YEAR
    , DATE_FORMAT(o.sales_date, '%m') AS MONTH
    , COUNT(DISTINCT o.user_id) AS PUCHASED_USERS
    , ROUND(COUNT(DISTINCT o.user_id) / @total, 1) AS PUCHASED_RATIO
FROM
    online_sale o
JOIN user_info u ON o.user_id = u.user_id AND DATE_FORMAT(joined, '%Y') = '2021'
GROUP BY 
    YEAR
    , MONTH
ORDER BY
    YEAR
    , MONTH;
    