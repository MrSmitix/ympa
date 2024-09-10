--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderCourierDTO' definition.
--


--
-- SELECT template for table `OrderCourierDTO`
--
SELECT `fullName`, `phone`, `phoneExtension`, `vehicleNumber`, `vehicleDescription` FROM `OrderCourierDTO` WHERE 1;

--
-- INSERT template for table `OrderCourierDTO`
--
INSERT INTO `OrderCourierDTO`(`fullName`, `phone`, `phoneExtension`, `vehicleNumber`, `vehicleDescription`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderCourierDTO`
--
UPDATE `OrderCourierDTO` SET `fullName` = ?, `phone` = ?, `phoneExtension` = ?, `vehicleNumber` = ?, `vehicleDescription` = ? WHERE 1;

--
-- DELETE template for table `OrderCourierDTO`
--
DELETE FROM `OrderCourierDTO` WHERE 0;

