--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsDetailsDTO' definition.
--


--
-- SELECT template for table `OrdersStatsDetailsDTO`
--
SELECT `itemStatus`, `itemCount`, `updateDate`, `stockType` FROM `OrdersStatsDetailsDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsDetailsDTO`
--
INSERT INTO `OrdersStatsDetailsDTO`(`itemStatus`, `itemCount`, `updateDate`, `stockType`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OrdersStatsDetailsDTO`
--
UPDATE `OrdersStatsDetailsDTO` SET `itemStatus` = ?, `itemCount` = ?, `updateDate` = ?, `stockType` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsDetailsDTO`
--
DELETE FROM `OrdersStatsDetailsDTO` WHERE 0;

