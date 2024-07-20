SELECT
    ri.rest_id,
    ri.rest_name,
    ri.food_type,
    ri.favorites,
    ri.address,
    ROUND(AVG(rr.review_score), 2) AS score
FROM rest_info ri
JOIN rest_review rr ON ri.rest_id = rr.rest_id
WHERE LEFT(ri.address, 2) = '서울'
GROUP BY ri.rest_id
ORDER BY score DESC, ri.favorites DESC;