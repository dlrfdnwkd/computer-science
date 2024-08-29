SET @hour_count = -1;

SELECT 
    hl.hour,
    IFNULL(hc.count, 0) AS count
FROM 
    (SELECT @hour_count := @hour_count + 1 AS hour FROM animal_outs LIMIT 24) AS hl
LEFT JOIN 
    (SELECT HOUR(datetime) AS hour, COUNT(*) AS count
     FROM animal_outs
     GROUP BY HOUR(datetime)
    ) AS hc 
ON hl.hour = hc.hour;