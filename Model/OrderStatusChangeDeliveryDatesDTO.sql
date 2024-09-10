--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderStatusChangeDeliveryDatesDTO' definition.
--


--
-- SELECT template for table `OrderStatusChangeDeliveryDatesDTO`
--
SELECT `realDeliveryDate` FROM `OrderStatusChangeDeliveryDatesDTO` WHERE 1;

--
-- INSERT template for table `OrderStatusChangeDeliveryDatesDTO`
--
INSERT INTO `OrderStatusChangeDeliveryDatesDTO`(`realDeliveryDate`) VALUES (?);

--
-- UPDATE template for table `OrderStatusChangeDeliveryDatesDTO`
--
UPDATE `OrderStatusChangeDeliveryDatesDTO` SET `realDeliveryDate` = ? WHERE 1;

--
-- DELETE template for table `OrderStatusChangeDeliveryDatesDTO`
--
DELETE FROM `OrderStatusChangeDeliveryDatesDTO` WHERE 0;

