--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SetOrderDeliveryDateRequest' definition.
--


--
-- SELECT template for table `SetOrderDeliveryDateRequest`
--
SELECT `dates`, `reason` FROM `SetOrderDeliveryDateRequest` WHERE 1;

--
-- INSERT template for table `SetOrderDeliveryDateRequest`
--
INSERT INTO `SetOrderDeliveryDateRequest`(`dates`, `reason`) VALUES (?, ?);

--
-- UPDATE template for table `SetOrderDeliveryDateRequest`
--
UPDATE `SetOrderDeliveryDateRequest` SET `dates` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `SetOrderDeliveryDateRequest`
--
DELETE FROM `SetOrderDeliveryDateRequest` WHERE 0;

