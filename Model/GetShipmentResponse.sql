--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetShipmentResponse' definition.
--


--
-- SELECT template for table `GetShipmentResponse`
--
SELECT `status`, `result` FROM `GetShipmentResponse` WHERE 1;

--
-- INSERT template for table `GetShipmentResponse`
--
INSERT INTO `GetShipmentResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetShipmentResponse`
--
UPDATE `GetShipmentResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetShipmentResponse`
--
DELETE FROM `GetShipmentResponse` WHERE 0;

