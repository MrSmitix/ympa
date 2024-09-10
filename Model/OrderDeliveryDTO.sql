--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderDeliveryDTO' definition.
--


--
-- SELECT template for table `OrderDeliveryDTO`
--
SELECT `id`, `type`, `serviceName`, `price`, `deliveryPartnerType`, `courier`, `dates`, `region`, `address`, `vat`, `deliveryServiceId`, `liftType`, `liftPrice`, `outletCode`, `outletStorageLimitDate`, `dispatchType`, `tracks`, `shipments`, `estimated`, `eacType`, `eacCode` FROM `OrderDeliveryDTO` WHERE 1;

--
-- INSERT template for table `OrderDeliveryDTO`
--
INSERT INTO `OrderDeliveryDTO`(`id`, `type`, `serviceName`, `price`, `deliveryPartnerType`, `courier`, `dates`, `region`, `address`, `vat`, `deliveryServiceId`, `liftType`, `liftPrice`, `outletCode`, `outletStorageLimitDate`, `dispatchType`, `tracks`, `shipments`, `estimated`, `eacType`, `eacCode`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderDeliveryDTO`
--
UPDATE `OrderDeliveryDTO` SET `id` = ?, `type` = ?, `serviceName` = ?, `price` = ?, `deliveryPartnerType` = ?, `courier` = ?, `dates` = ?, `region` = ?, `address` = ?, `vat` = ?, `deliveryServiceId` = ?, `liftType` = ?, `liftPrice` = ?, `outletCode` = ?, `outletStorageLimitDate` = ?, `dispatchType` = ?, `tracks` = ?, `shipments` = ?, `estimated` = ?, `eacType` = ?, `eacCode` = ? WHERE 1;

--
-- DELETE template for table `OrderDeliveryDTO`
--
DELETE FROM `OrderDeliveryDTO` WHERE 0;

