--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetWarehouseStocksResponse' definition.
--


--
-- SELECT template for table `GetWarehouseStocksResponse`
--
SELECT `status`, `result` FROM `GetWarehouseStocksResponse` WHERE 1;

--
-- INSERT template for table `GetWarehouseStocksResponse`
--
INSERT INTO `GetWarehouseStocksResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetWarehouseStocksResponse`
--
UPDATE `GetWarehouseStocksResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetWarehouseStocksResponse`
--
DELETE FROM `GetWarehouseStocksResponse` WHERE 0;

