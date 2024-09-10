--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QualityRatingDTO' definition.
--


--
-- SELECT template for table `QualityRatingDTO`
--
SELECT `rating`, `calculationDate`, `components` FROM `QualityRatingDTO` WHERE 1;

--
-- INSERT template for table `QualityRatingDTO`
--
INSERT INTO `QualityRatingDTO`(`rating`, `calculationDate`, `components`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QualityRatingDTO`
--
UPDATE `QualityRatingDTO` SET `rating` = ?, `calculationDate` = ?, `components` = ? WHERE 1;

--
-- DELETE template for table `QualityRatingDTO`
--
DELETE FROM `QualityRatingDTO` WHERE 0;

