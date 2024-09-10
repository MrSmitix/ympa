--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetShipmentOrdersInfoResponse' definition.
--


--
-- SELECT template for table `GetShipmentOrdersInfoResponse`
--
SELECT `status`, `result` FROM `GetShipmentOrdersInfoResponse` WHERE 1;

--
-- INSERT template for table `GetShipmentOrdersInfoResponse`
--
INSERT INTO `GetShipmentOrdersInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetShipmentOrdersInfoResponse`
--
UPDATE `GetShipmentOrdersInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetShipmentOrdersInfoResponse`
--
DELETE FROM `GetShipmentOrdersInfoResponse` WHERE 0;

