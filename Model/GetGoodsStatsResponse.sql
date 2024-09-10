--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetGoodsStatsResponse' definition.
--


--
-- SELECT template for table `GetGoodsStatsResponse`
--
SELECT `status`, `result` FROM `GetGoodsStatsResponse` WHERE 1;

--
-- INSERT template for table `GetGoodsStatsResponse`
--
INSERT INTO `GetGoodsStatsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetGoodsStatsResponse`
--
UPDATE `GetGoodsStatsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetGoodsStatsResponse`
--
DELETE FROM `GetGoodsStatsResponse` WHERE 0;

