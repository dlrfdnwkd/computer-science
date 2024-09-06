SELECT 
    FLAVOR
FROM (
    SELECT 
        flavor, total_order 
    FROM 
        july
    UNION ALL
    SELECT 
        flavor, total_order 
    FROM 
        first_half
) AS total
GROUP BY 
    flavor
ORDER BY 
    SUM(total_order) DESC
LIMIT 3;