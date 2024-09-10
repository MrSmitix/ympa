--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SetOrderShipmentBoxesResponse' definition.
--


--
-- SELECT template for table `SetOrderShipmentBoxesResponse`
--
SELECT `status`, `result` FROM `SetOrderShipmentBoxesResponse` WHERE 1;

--
-- INSERT template for table `SetOrderShipmentBoxesResponse`
--
INSERT INTO `SetOrderShipmentBoxesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `SetOrderShipmentBoxesResponse`
--
UPDATE `SetOrderShipmentBoxesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `SetOrderShipmentBoxesResponse`
--
DELETE FROM `SetOrderShipmentBoxesResponse` WHERE 0;

