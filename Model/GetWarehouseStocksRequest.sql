--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetWarehouseStocksRequest' definition.
--


--
-- SELECT template for table `GetWarehouseStocksRequest`
--
SELECT `withTurnover`, `archived`, `offerIds` FROM `GetWarehouseStocksRequest` WHERE 1;

--
-- INSERT template for table `GetWarehouseStocksRequest`
--
INSERT INTO `GetWarehouseStocksRequest`(`withTurnover`, `archived`, `offerIds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetWarehouseStocksRequest`
--
UPDATE `GetWarehouseStocksRequest` SET `withTurnover` = ?, `archived` = ?, `offerIds` = ? WHERE 1;

--
-- DELETE template for table `GetWarehouseStocksRequest`
--
DELETE FROM `GetWarehouseStocksRequest` WHERE 0;

