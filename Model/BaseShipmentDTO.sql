--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BaseShipmentDTO' definition.
--


--
-- SELECT template for table `BaseShipmentDTO`
--
SELECT `id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount` FROM `BaseShipmentDTO` WHERE 1;

--
-- INSERT template for table `BaseShipmentDTO`
--
INSERT INTO `BaseShipmentDTO`(`id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BaseShipmentDTO`
--
UPDATE `BaseShipmentDTO` SET `id` = ?, `planIntervalFrom` = ?, `planIntervalTo` = ?, `shipmentType` = ?, `warehouse` = ?, `warehouseTo` = ?, `externalId` = ?, `deliveryService` = ?, `palletsCount` = ?, `orderIds` = ?, `draftCount` = ?, `plannedCount` = ?, `factCount` = ? WHERE 1;

--
-- DELETE template for table `BaseShipmentDTO`
--
DELETE FROM `BaseShipmentDTO` WHERE 0;

