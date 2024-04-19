SELECT
    f.warehouse_id
    , f.warehouse_name
    , f.address
    , IFNULL(f.freezer_yn, 'N') as freezer_yn
FROM food_warehouse f
WHERE f.address LIKE '경기도%'
ORDER BY f.warehouse_id;
