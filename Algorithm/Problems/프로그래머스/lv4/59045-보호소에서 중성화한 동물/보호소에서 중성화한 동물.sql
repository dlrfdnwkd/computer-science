SELECT 
    outs.animal_id, 
    outs.animal_type, 
    outs.name 
FROM 
    animal_outs AS outs
INNER JOIN 
    animal_ins AS ins 
    ON outs.animal_id = ins.animal_id 
WHERE 
    SUBSTRING_INDEX(outs.sex_upon_outcome, ' ', 1) IN ('Spayed', 'Neutered') 
    AND SUBSTRING_INDEX(ins.sex_upon_intake, ' ', 1) = 'Intact';