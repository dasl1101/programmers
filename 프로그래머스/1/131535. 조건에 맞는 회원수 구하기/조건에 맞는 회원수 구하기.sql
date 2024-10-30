-- 코드를 입력하세요
SELECT count(distinct USER_ID) from USER_INFO 
where AGE BETWEEN 20 AND 29 
and YEAR(JOINED) = 2021;