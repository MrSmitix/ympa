--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ShipmentDTO' definition.
--


--
-- SELECT template for table `ShipmentDTO`
--
SELECT `id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount`, `currentStatus`, `availableActions` FROM `ShipmentDTO` WHERE 1;

--
-- INSERT template for table `ShipmentDTO`
--
INSERT INTO `ShipmentDTO`(`id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount`, `currentStatus`, `availableActions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ShipmentDTO`
--
UPDATE `ShipmentDTO` SET `id` = ?, `planIntervalFrom` = ?, `planIntervalTo` = ?, `shipmentType` = ?, `warehouse` = ?, `warehouseTo` = ?, `externalId` = ?, `deliveryService` = ?, `palletsCount` = ?, `orderIds` = ?, `draftCount` = ?, `plannedCount` = ?, `factCount` = ?, `currentStatus` = ?, `availableActions` = ? WHERE 1;

--
-- DELETE template for table `ShipmentDTO`
--
DELETE FROM `ShipmentDTO` WHERE 0;

