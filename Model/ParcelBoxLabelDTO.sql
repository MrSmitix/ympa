--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ParcelBoxLabelDTO' definition.
--


--
-- SELECT template for table `ParcelBoxLabelDTO`
--
SELECT `url`, `supplierName`, `deliveryServiceName`, `orderId`, `orderNum`, `recipientName`, `boxId`, `fulfilmentId`, `place`, `weight`, `deliveryServiceId`, `deliveryAddress`, `shipmentDate` FROM `ParcelBoxLabelDTO` WHERE 1;

--
-- INSERT template for table `ParcelBoxLabelDTO`
--
INSERT INTO `ParcelBoxLabelDTO`(`url`, `supplierName`, `deliveryServiceName`, `orderId`, `orderNum`, `recipientName`, `boxId`, `fulfilmentId`, `place`, `weight`, `deliveryServiceId`, `deliveryAddress`, `shipmentDate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ParcelBoxLabelDTO`
--
UPDATE `ParcelBoxLabelDTO` SET `url` = ?, `supplierName` = ?, `deliveryServiceName` = ?, `orderId` = ?, `orderNum` = ?, `recipientName` = ?, `boxId` = ?, `fulfilmentId` = ?, `place` = ?, `weight` = ?, `deliveryServiceId` = ?, `deliveryAddress` = ?, `shipmentDate` = ? WHERE 1;

--
-- DELETE template for table `ParcelBoxLabelDTO`
--
DELETE FROM `ParcelBoxLabelDTO` WHERE 0;

