--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QualityRatingDetailsDTO' definition.
--


--
-- SELECT template for table `QualityRatingDetailsDTO`
--
SELECT `affectedOrders` FROM `QualityRatingDetailsDTO` WHERE 1;

--
-- INSERT template for table `QualityRatingDetailsDTO`
--
INSERT INTO `QualityRatingDetailsDTO`(`affectedOrders`) VALUES (?);

--
-- UPDATE template for table `QualityRatingDetailsDTO`
--
UPDATE `QualityRatingDetailsDTO` SET `affectedOrders` = ? WHERE 1;

--
-- DELETE template for table `QualityRatingDetailsDTO`
--
DELETE FROM `QualityRatingDetailsDTO` WHERE 0;

