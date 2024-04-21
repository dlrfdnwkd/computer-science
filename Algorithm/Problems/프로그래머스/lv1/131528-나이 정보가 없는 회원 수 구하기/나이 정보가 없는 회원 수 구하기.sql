SELECT COUNT(u.user_id) AS users
FROM user_info u
WHERE u.age IS NULL;