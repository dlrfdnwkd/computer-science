SELECT 
    DATE_FORMAT(datetime, '%H') AS hour, 
    COUNT(*) AS count 
FROM 
    animal_outs 
GROUP BY 
    hour 
HAVING 
    hour >= 9 AND hour < 20 
ORDER BY 
    hour;