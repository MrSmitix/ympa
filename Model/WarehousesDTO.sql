--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehousesDTO' definition.
--


--
-- SELECT template for table `WarehousesDTO`
--
SELECT `warehouses`, `warehouseGroups` FROM `WarehousesDTO` WHERE 1;

--
-- INSERT template for table `WarehousesDTO`
--
INSERT INTO `WarehousesDTO`(`warehouses`, `warehouseGroups`) VALUES (?, ?);

--
-- UPDATE template for table `WarehousesDTO`
--
UPDATE `WarehousesDTO` SET `warehouses` = ?, `warehouseGroups` = ? WHERE 1;

--
-- DELETE template for table `WarehousesDTO`
--
DELETE FROM `WarehousesDTO` WHERE 0;

