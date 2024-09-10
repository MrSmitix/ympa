--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ShipmentInfoDTO' definition.
--


--
-- SELECT template for table `ShipmentInfoDTO`
--
SELECT `id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount`, `status`, `statusDescription`, `statusUpdateTime` FROM `ShipmentInfoDTO` WHERE 1;

--
-- INSERT template for table `ShipmentInfoDTO`
--
INSERT INTO `ShipmentInfoDTO`(`id`, `planIntervalFrom`, `planIntervalTo`, `shipmentType`, `warehouse`, `warehouseTo`, `externalId`, `deliveryService`, `palletsCount`, `orderIds`, `draftCount`, `plannedCount`, `factCount`, `status`, `statusDescription`, `statusUpdateTime`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ShipmentInfoDTO`
--
UPDATE `ShipmentInfoDTO` SET `id` = ?, `planIntervalFrom` = ?, `planIntervalTo` = ?, `shipmentType` = ?, `warehouse` = ?, `warehouseTo` = ?, `externalId` = ?, `deliveryService` = ?, `palletsCount` = ?, `orderIds` = ?, `draftCount` = ?, `plannedCount` = ?, `factCount` = ?, `status` = ?, `statusDescription` = ?, `statusUpdateTime` = ? WHERE 1;

--
-- DELETE template for table `ShipmentInfoDTO`
--
DELETE FROM `ShipmentInfoDTO` WHERE 0;

