SELECT name,
 CASE
  WHEN imdb_rating > 8 THEN 'Fantastic'
  WHEN imdb_rating > 6 THEN 'Poorly Received'
  ELSE 'Avoid at All Costs'
 END AS 'Review'
FROM movies;

SELECT *
FROM nomnom;
SELECT distinct neighborhood
FROM nomnom;
SELECT DISTINCT cuisine
FROM nomnom;
SELECT *
FROM nomnom
WHERE cuisine = 'Chinese';
SELECT *
FROM nomnom
WHERE reviews >= 4;
SELECT *
FROM nomnom
WHERE cuisine = 'Italian'
AND price = '$$$';
SELECT *
FROM nomnom
WHERE name LIKE '%meatball%';
SELECT *
FROM nomnom
WHERE neighborhood = 'Midtown'
   OR neighborhood = 'Downtown'
   OR neighborhood = 'Chinatown';
SELECT *
FROM nomnom
WHERE health IS NULL;
SELECT *
FROM nomnom
ORDER BY review DESC
LIMIT 10;
SELECT name,
 CASE
  WHEN review > 4.5 THEN 'Extraordinary'
  WHEN review > 4 THEN 'Excellent'
  WHEN review > 3 THEN 'Good'
  WHEN review > 2 THEN 'Fair'
  ELSE 'Poor'
 END AS 'Review'
FROM nomnom;