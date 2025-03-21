SELECT
    ugu.user_id,
    ugu.nickname,
    SUM(ugb.price) AS total_sales
FROM used_goods_user AS ugu
JOIN used_goods_board AS ugb ON ugb.writer_id = ugu.user_id AND ugb.status LIKE 'DONE'
GROUP BY ugu.user_id
HAVING total_sales >= 700000
ORDER BY total_sales;