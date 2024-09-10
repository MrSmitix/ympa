--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseOffersDTO' definition.
--


--
-- SELECT template for table `WarehouseOffersDTO`
--
SELECT `warehouseId`, `offers` FROM `WarehouseOffersDTO` WHERE 1;

--
-- INSERT template for table `WarehouseOffersDTO`
--
INSERT INTO `WarehouseOffersDTO`(`warehouseId`, `offers`) VALUES (?, ?);

--
-- UPDATE template for table `WarehouseOffersDTO`
--
UPDATE `WarehouseOffersDTO` SET `warehouseId` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `WarehouseOffersDTO`
--
DELETE FROM `WarehouseOffersDTO` WHERE 0;

