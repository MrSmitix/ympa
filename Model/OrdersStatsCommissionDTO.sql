--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsCommissionDTO' definition.
--


--
-- SELECT template for table `OrdersStatsCommissionDTO`
--
SELECT `type`, `actual` FROM `OrdersStatsCommissionDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsCommissionDTO`
--
INSERT INTO `OrdersStatsCommissionDTO`(`type`, `actual`) VALUES (?, ?);

--
-- UPDATE template for table `OrdersStatsCommissionDTO`
--
UPDATE `OrdersStatsCommissionDTO` SET `type` = ?, `actual` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsCommissionDTO`
--
DELETE FROM `OrdersStatsCommissionDTO` WHERE 0;

