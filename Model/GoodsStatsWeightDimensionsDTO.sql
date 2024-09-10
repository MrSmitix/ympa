--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsStatsWeightDimensionsDTO' definition.
--


--
-- SELECT template for table `GoodsStatsWeightDimensionsDTO`
--
SELECT `length`, `width`, `height`, `weight` FROM `GoodsStatsWeightDimensionsDTO` WHERE 1;

--
-- INSERT template for table `GoodsStatsWeightDimensionsDTO`
--
INSERT INTO `GoodsStatsWeightDimensionsDTO`(`length`, `width`, `height`, `weight`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GoodsStatsWeightDimensionsDTO`
--
UPDATE `GoodsStatsWeightDimensionsDTO` SET `length` = ?, `width` = ?, `height` = ?, `weight` = ? WHERE 1;

--
-- DELETE template for table `GoodsStatsWeightDimensionsDTO`
--
DELETE FROM `GoodsStatsWeightDimensionsDTO` WHERE 0;

