--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOrdersStatsResponse' definition.
--


--
-- SELECT template for table `GetOrdersStatsResponse`
--
SELECT `status`, `result` FROM `GetOrdersStatsResponse` WHERE 1;

--
-- INSERT template for table `GetOrdersStatsResponse`
--
INSERT INTO `GetOrdersStatsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOrdersStatsResponse`
--
UPDATE `GetOrdersStatsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOrdersStatsResponse`
--
DELETE FROM `GetOrdersStatsResponse` WHERE 0;

