SELECT 
    p.* 
FROM 
    places p
JOIN 
    (SELECT 
         host_id 
     FROM 
         places 
     GROUP BY 
         host_id 
     HAVING 
         COUNT(host_id) >= 2
    ) h 
ON 
    p.host_id = h.host_id 
ORDER BY 
    p.id;