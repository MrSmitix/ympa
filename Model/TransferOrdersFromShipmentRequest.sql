--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'TransferOrdersFromShipmentRequest' definition.
--


--
-- SELECT template for table `TransferOrdersFromShipmentRequest`
--
SELECT `orderIds` FROM `TransferOrdersFromShipmentRequest` WHERE 1;

--
-- INSERT template for table `TransferOrdersFromShipmentRequest`
--
INSERT INTO `TransferOrdersFromShipmentRequest`(`orderIds`) VALUES (?);

--
-- UPDATE template for table `TransferOrdersFromShipmentRequest`
--
UPDATE `TransferOrdersFromShipmentRequest` SET `orderIds` = ? WHERE 1;

--
-- DELETE template for table `TransferOrdersFromShipmentRequest`
--
DELETE FROM `TransferOrdersFromShipmentRequest` WHERE 0;

