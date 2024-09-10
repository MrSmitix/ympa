--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderDeliveryDatesDTO' definition.
--


--
-- SELECT template for table `OrderDeliveryDatesDTO`
--
SELECT `fromDate`, `toDate`, `fromTime`, `toTime`, `realDeliveryDate` FROM `OrderDeliveryDatesDTO` WHERE 1;

--
-- INSERT template for table `OrderDeliveryDatesDTO`
--
INSERT INTO `OrderDeliveryDatesDTO`(`fromDate`, `toDate`, `fromTime`, `toTime`, `realDeliveryDate`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderDeliveryDatesDTO`
--
UPDATE `OrderDeliveryDatesDTO` SET `fromDate` = ?, `toDate` = ?, `fromTime` = ?, `toTime` = ?, `realDeliveryDate` = ? WHERE 1;

--
-- DELETE template for table `OrderDeliveryDatesDTO`
--
DELETE FROM `OrderDeliveryDatesDTO` WHERE 0;

