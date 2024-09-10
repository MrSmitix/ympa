--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ConfirmShipmentRequest' definition.
--


--
-- SELECT template for table `ConfirmShipmentRequest`
--
SELECT `externalShipmentId` FROM `ConfirmShipmentRequest` WHERE 1;

--
-- INSERT template for table `ConfirmShipmentRequest`
--
INSERT INTO `ConfirmShipmentRequest`(`externalShipmentId`) VALUES (?);

--
-- UPDATE template for table `ConfirmShipmentRequest`
--
UPDATE `ConfirmShipmentRequest` SET `externalShipmentId` = ? WHERE 1;

--
-- DELETE template for table `ConfirmShipmentRequest`
--
DELETE FROM `ConfirmShipmentRequest` WHERE 0;

