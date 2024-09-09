SELECT 
    CONCAT('/home/grep/src/', f.board_id, '/', f.file_id, f.file_name, f.file_ext) AS file_path
FROM 
    used_goods_file f
JOIN (
    SELECT board_id
    FROM used_goods_board
    ORDER BY views DESC 
    LIMIT 1
) b ON f.board_id = b.board_id
ORDER BY 
    f.file_id DESC;