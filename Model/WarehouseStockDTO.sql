--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseStockDTO' definition.
--


--
-- SELECT template for table `WarehouseStockDTO`
--
SELECT `type`, `count` FROM `WarehouseStockDTO` WHERE 1;

--
-- INSERT template for table `WarehouseStockDTO`
--
INSERT INTO `WarehouseStockDTO`(`type`, `count`) VALUES (?, ?);

--
-- UPDATE template for table `WarehouseStockDTO`
--
UPDATE `WarehouseStockDTO` SET `type` = ?, `count` = ? WHERE 1;

--
-- DELETE template for table `WarehouseStockDTO`
--
DELETE FROM `WarehouseStockDTO` WHERE 0;

