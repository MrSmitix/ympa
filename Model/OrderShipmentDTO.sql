--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderShipmentDTO' definition.
--


--
-- SELECT template for table `OrderShipmentDTO`
--
SELECT `id`, `shipmentDate`, `shipmentTime`, `tracks`, `boxes` FROM `OrderShipmentDTO` WHERE 1;

--
-- INSERT template for table `OrderShipmentDTO`
--
INSERT INTO `OrderShipmentDTO`(`id`, `shipmentDate`, `shipmentTime`, `tracks`, `boxes`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderShipmentDTO`
--
UPDATE `OrderShipmentDTO` SET `id` = ?, `shipmentDate` = ?, `shipmentTime` = ?, `tracks` = ?, `boxes` = ? WHERE 1;

--
-- DELETE template for table `OrderShipmentDTO`
--
DELETE FROM `OrderShipmentDTO` WHERE 0;

