--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ShipmentStatusChangeDTO' definition.
--


--
-- SELECT template for table `ShipmentStatusChangeDTO`
--
SELECT `status`, `description`, `updateTime` FROM `ShipmentStatusChangeDTO` WHERE 1;

--
-- INSERT template for table `ShipmentStatusChangeDTO`
--
INSERT INTO `ShipmentStatusChangeDTO`(`status`, `description`, `updateTime`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ShipmentStatusChangeDTO`
--
UPDATE `ShipmentStatusChangeDTO` SET `status` = ?, `description` = ?, `updateTime` = ? WHERE 1;

--
-- DELETE template for table `ShipmentStatusChangeDTO`
--
DELETE FROM `ShipmentStatusChangeDTO` WHERE 0;

