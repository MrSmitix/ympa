--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QualityRatingAffectedOrderDTO' definition.
--


--
-- SELECT template for table `QualityRatingAffectedOrderDTO`
--
SELECT `orderId`, `description`, `componentType` FROM `QualityRatingAffectedOrderDTO` WHERE 1;

--
-- INSERT template for table `QualityRatingAffectedOrderDTO`
--
INSERT INTO `QualityRatingAffectedOrderDTO`(`orderId`, `description`, `componentType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QualityRatingAffectedOrderDTO`
--
UPDATE `QualityRatingAffectedOrderDTO` SET `orderId` = ?, `description` = ?, `componentType` = ? WHERE 1;

--
-- DELETE template for table `QualityRatingAffectedOrderDTO`
--
DELETE FROM `QualityRatingAffectedOrderDTO` WHERE 0;

