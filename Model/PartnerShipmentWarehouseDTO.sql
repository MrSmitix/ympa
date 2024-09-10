--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PartnerShipmentWarehouseDTO' definition.
--


--
-- SELECT template for table `PartnerShipmentWarehouseDTO`
--
SELECT `id`, `name`, `address` FROM `PartnerShipmentWarehouseDTO` WHERE 1;

--
-- INSERT template for table `PartnerShipmentWarehouseDTO`
--
INSERT INTO `PartnerShipmentWarehouseDTO`(`id`, `name`, `address`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PartnerShipmentWarehouseDTO`
--
UPDATE `PartnerShipmentWarehouseDTO` SET `id` = ?, `name` = ?, `address` = ? WHERE 1;

--
-- DELETE template for table `PartnerShipmentWarehouseDTO`
--
DELETE FROM `PartnerShipmentWarehouseDTO` WHERE 0;

