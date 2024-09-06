SELECT
    r.food_type,
    r.rest_id,
    r.rest_name,
    r.favorites
FROM 
    rest_info AS r
INNER JOIN (
    SELECT
        food_type,
        MAX(favorites) AS max_favorites
    FROM 
        rest_info
    GROUP BY 
        food_type
) AS mr 
ON 
    r.food_type = mr.food_type 
    AND r.favorites = mr.max_favorites
ORDER BY 
    r.food_type DESC;