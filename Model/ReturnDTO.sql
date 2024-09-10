--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ReturnDTO' definition.
--


--
-- SELECT template for table `ReturnDTO`
--
SELECT `id`, `orderId`, `creationDate`, `updateDate`, `refundStatus`, `logisticPickupPoint`, `shipmentRecipientType`, `shipmentStatus`, `refundAmount`, `items`, `returnType`, `fastReturn` FROM `ReturnDTO` WHERE 1;

--
-- INSERT template for table `ReturnDTO`
--
INSERT INTO `ReturnDTO`(`id`, `orderId`, `creationDate`, `updateDate`, `refundStatus`, `logisticPickupPoint`, `shipmentRecipientType`, `shipmentStatus`, `refundAmount`, `items`, `returnType`, `fastReturn`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ReturnDTO`
--
UPDATE `ReturnDTO` SET `id` = ?, `orderId` = ?, `creationDate` = ?, `updateDate` = ?, `refundStatus` = ?, `logisticPickupPoint` = ?, `shipmentRecipientType` = ?, `shipmentStatus` = ?, `refundAmount` = ?, `items` = ?, `returnType` = ?, `fastReturn` = ? WHERE 1;

--
-- DELETE template for table `ReturnDTO`
--
DELETE FROM `ReturnDTO` WHERE 0;

