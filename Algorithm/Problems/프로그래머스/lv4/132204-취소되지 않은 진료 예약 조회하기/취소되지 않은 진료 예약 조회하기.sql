SELECT 
    a.APNT_NO,
    p.PT_NAME,
    a.PT_NO,
    a.MCDP_CD,
    d.DR_NAME,
    a.APNT_YMD
FROM 
    appointment AS a
LEFT JOIN 
    patient AS p ON a.pt_no = p.pt_no
LEFT JOIN 
    doctor AS d ON a.mddr_id = d.dr_id
WHERE 
    DATE(a.apnt_ymd) = '2022-04-13'
    AND a.mcdp_cd = 'CS'
    AND a.apnt_cncl_yn = 'N'
ORDER BY 
    a.apnt_ymd;