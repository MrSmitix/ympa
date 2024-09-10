--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetWarehouseStocksDTO' definition.
--


--
-- SELECT template for table `GetWarehouseStocksDTO`
--
SELECT `paging`, `warehouses` FROM `GetWarehouseStocksDTO` WHERE 1;

--
-- INSERT template for table `GetWarehouseStocksDTO`
--
INSERT INTO `GetWarehouseStocksDTO`(`paging`, `warehouses`) VALUES (?, ?);

--
-- UPDATE template for table `GetWarehouseStocksDTO`
--
UPDATE `GetWarehouseStocksDTO` SET `paging` = ?, `warehouses` = ? WHERE 1;

--
-- DELETE template for table `GetWarehouseStocksDTO`
--
DELETE FROM `GetWarehouseStocksDTO` WHERE 0;

