--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseGroupDTO' definition.
--


--
-- SELECT template for table `WarehouseGroupDTO`
--
SELECT `name`, `mainWarehouse`, `warehouses` FROM `WarehouseGroupDTO` WHERE 1;

--
-- INSERT template for table `WarehouseGroupDTO`
--
INSERT INTO `WarehouseGroupDTO`(`name`, `mainWarehouse`, `warehouses`) VALUES (?, ?, ?);

--
-- UPDATE template for table `WarehouseGroupDTO`
--
UPDATE `WarehouseGroupDTO` SET `name` = ?, `mainWarehouse` = ?, `warehouses` = ? WHERE 1;

--
-- DELETE template for table `WarehouseGroupDTO`
--
DELETE FROM `WarehouseGroupDTO` WHERE 0;

