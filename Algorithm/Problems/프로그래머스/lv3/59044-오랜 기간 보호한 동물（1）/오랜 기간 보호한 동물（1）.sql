SELECT 
    ins.name, 
    ins.datetime 
FROM 
    animal_ins ins
WHERE 
    NOT EXISTS (
        SELECT 1 
        FROM animal_outs outs 
        WHERE outs.animal_id = ins.animal_id
    )
ORDER BY 
    ins.datetime 
LIMIT 3;