SELECT
    f.factory_id
    , f.factory_name
    , f.address
FROM food_factory f
WHERE address LIKE '강원도%'
ORDER BY f.factory_id;
