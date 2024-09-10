--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletWorkingScheduleItemDTO' definition.
--


--
-- SELECT template for table `OutletWorkingScheduleItemDTO`
--
SELECT `startDay`, `endDay`, `startTime`, `endTime` FROM `OutletWorkingScheduleItemDTO` WHERE 1;

--
-- INSERT template for table `OutletWorkingScheduleItemDTO`
--
INSERT INTO `OutletWorkingScheduleItemDTO`(`startDay`, `endDay`, `startTime`, `endTime`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OutletWorkingScheduleItemDTO`
--
UPDATE `OutletWorkingScheduleItemDTO` SET `startDay` = ?, `endDay` = ?, `startTime` = ?, `endTime` = ? WHERE 1;

--
-- DELETE template for table `OutletWorkingScheduleItemDTO`
--
DELETE FROM `OutletWorkingScheduleItemDTO` WHERE 0;

