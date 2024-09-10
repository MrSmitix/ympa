--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceCompetitivenessThresholdsDTO' definition.
--


--
-- SELECT template for table `PriceCompetitivenessThresholdsDTO`
--
SELECT `optimalPrice`, `averagePrice` FROM `PriceCompetitivenessThresholdsDTO` WHERE 1;

--
-- INSERT template for table `PriceCompetitivenessThresholdsDTO`
--
INSERT INTO `PriceCompetitivenessThresholdsDTO`(`optimalPrice`, `averagePrice`) VALUES (?, ?);

--
-- UPDATE template for table `PriceCompetitivenessThresholdsDTO`
--
UPDATE `PriceCompetitivenessThresholdsDTO` SET `optimalPrice` = ?, `averagePrice` = ? WHERE 1;

--
-- DELETE template for table `PriceCompetitivenessThresholdsDTO`
--
DELETE FROM `PriceCompetitivenessThresholdsDTO` WHERE 0;

