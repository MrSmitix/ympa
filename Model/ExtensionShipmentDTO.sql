--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ExtensionShipmentDTO' definition.
--


--
-- SELECT template for table `ExtensionShipmentDTO`
--
SELECT `currentStatus`, `availableActions` FROM `ExtensionShipmentDTO` WHERE 1;

--
-- INSERT template for table `ExtensionShipmentDTO`
--
INSERT INTO `ExtensionShipmentDTO`(`currentStatus`, `availableActions`) VALUES (?, ?);

--
-- UPDATE template for table `ExtensionShipmentDTO`
--
UPDATE `ExtensionShipmentDTO` SET `currentStatus` = ?, `availableActions` = ? WHERE 1;

--
-- DELETE template for table `ExtensionShipmentDTO`
--
DELETE FROM `ExtensionShipmentDTO` WHERE 0;

