--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsPriceDTO' definition.
--


--
-- SELECT template for table `OrdersStatsPriceDTO`
--
SELECT `type`, `costPerItem`, `total` FROM `OrdersStatsPriceDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsPriceDTO`
--
INSERT INTO `OrdersStatsPriceDTO`(`type`, `costPerItem`, `total`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OrdersStatsPriceDTO`
--
UPDATE `OrdersStatsPriceDTO` SET `type` = ?, `costPerItem` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsPriceDTO`
--
DELETE FROM `OrdersStatsPriceDTO` WHERE 0;

