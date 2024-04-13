SELECT
    f.category AS CATEGORY
    , f.price AS MAX_PRICE
    , f.product_name AS PRODUCT_NAME
FROM FOOD_PRODUCT f
JOIN (
    SELECT
        category
        , MAX(price) as price
    FROM food_product
    GROUP BY category
) m ON f.category = m.category AND f.price = m.price
WHERE
    f.category in (
        '과자'
        , '국'
        , '김치'
        , '식용유'
    )
ORDER BY f.price DESC;