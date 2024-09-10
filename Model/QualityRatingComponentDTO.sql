--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QualityRatingComponentDTO' definition.
--


--
-- SELECT template for table `QualityRatingComponentDTO`
--
SELECT `value`, `componentType` FROM `QualityRatingComponentDTO` WHERE 1;

--
-- INSERT template for table `QualityRatingComponentDTO`
--
INSERT INTO `QualityRatingComponentDTO`(`value`, `componentType`) VALUES (?, ?);

--
-- UPDATE template for table `QualityRatingComponentDTO`
--
UPDATE `QualityRatingComponentDTO` SET `value` = ?, `componentType` = ? WHERE 1;

--
-- DELETE template for table `QualityRatingComponentDTO`
--
DELETE FROM `QualityRatingComponentDTO` WHERE 0;

