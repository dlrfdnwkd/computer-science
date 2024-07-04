SELECT 
    animal_type,
    COUNT(animal_type) AS count
FROM 
    animal_ins
GROUP BY 
    animal_type
ORDER BY 
    animal_type;