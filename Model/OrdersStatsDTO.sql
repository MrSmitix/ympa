--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsDTO' definition.
--


--
-- SELECT template for table `OrdersStatsDTO`
--
SELECT `orders`, `paging` FROM `OrdersStatsDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsDTO`
--
INSERT INTO `OrdersStatsDTO`(`orders`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `OrdersStatsDTO`
--
UPDATE `OrdersStatsDTO` SET `orders` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsDTO`
--
DELETE FROM `OrdersStatsDTO` WHERE 0;

