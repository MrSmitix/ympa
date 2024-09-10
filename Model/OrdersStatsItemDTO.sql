--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsItemDTO' definition.
--


--
-- SELECT template for table `OrdersStatsItemDTO`
--
SELECT `offerName`, `marketSku`, `shopSku`, `count`, `prices`, `warehouse`, `details`, `cisList`, `initialCount`, `bidFee`, `cofinanceThreshold`, `cofinanceValue` FROM `OrdersStatsItemDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsItemDTO`
--
INSERT INTO `OrdersStatsItemDTO`(`offerName`, `marketSku`, `shopSku`, `count`, `prices`, `warehouse`, `details`, `cisList`, `initialCount`, `bidFee`, `cofinanceThreshold`, `cofinanceValue`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrdersStatsItemDTO`
--
UPDATE `OrdersStatsItemDTO` SET `offerName` = ?, `marketSku` = ?, `shopSku` = ?, `count` = ?, `prices` = ?, `warehouse` = ?, `details` = ?, `cisList` = ?, `initialCount` = ?, `bidFee` = ?, `cofinanceThreshold` = ?, `cofinanceValue` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsItemDTO`
--
DELETE FROM `OrdersStatsItemDTO` WHERE 0;

