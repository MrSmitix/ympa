--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersShipmentInfoDTO' definition.
--


--
-- SELECT template for table `OrdersShipmentInfoDTO`
--
SELECT `orderIdsWithLabels`, `orderIdsWithoutLabels` FROM `OrdersShipmentInfoDTO` WHERE 1;

--
-- INSERT template for table `OrdersShipmentInfoDTO`
--
INSERT INTO `OrdersShipmentInfoDTO`(`orderIdsWithLabels`, `orderIdsWithoutLabels`) VALUES (?, ?);

--
-- UPDATE template for table `OrdersShipmentInfoDTO`
--
UPDATE `OrdersShipmentInfoDTO` SET `orderIdsWithLabels` = ?, `orderIdsWithoutLabels` = ? WHERE 1;

--
-- DELETE template for table `OrdersShipmentInfoDTO`
--
DELETE FROM `OrdersShipmentInfoDTO` WHERE 0;

