--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetGoodsStatsRequest' definition.
--


--
-- SELECT template for table `GetGoodsStatsRequest`
--
SELECT `shopSkus` FROM `GetGoodsStatsRequest` WHERE 1;

--
-- INSERT template for table `GetGoodsStatsRequest`
--
INSERT INTO `GetGoodsStatsRequest`(`shopSkus`) VALUES (?);

--
-- UPDATE template for table `GetGoodsStatsRequest`
--
UPDATE `GetGoodsStatsRequest` SET `shopSkus` = ? WHERE 1;

--
-- DELETE template for table `GetGoodsStatsRequest`
--
DELETE FROM `GetGoodsStatsRequest` WHERE 0;

