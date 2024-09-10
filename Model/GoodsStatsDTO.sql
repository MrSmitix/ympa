--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsStatsDTO' definition.
--


--
-- SELECT template for table `GoodsStatsDTO`
--
SELECT `shopSkus` FROM `GoodsStatsDTO` WHERE 1;

--
-- INSERT template for table `GoodsStatsDTO`
--
INSERT INTO `GoodsStatsDTO`(`shopSkus`) VALUES (?);

--
-- UPDATE template for table `GoodsStatsDTO`
--
UPDATE `GoodsStatsDTO` SET `shopSkus` = ? WHERE 1;

--
-- DELETE template for table `GoodsStatsDTO`
--
DELETE FROM `GoodsStatsDTO` WHERE 0;

