--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletWorkingScheduleDTO' definition.
--


--
-- SELECT template for table `OutletWorkingScheduleDTO`
--
SELECT `workInHoliday`, `scheduleItems` FROM `OutletWorkingScheduleDTO` WHERE 1;

--
-- INSERT template for table `OutletWorkingScheduleDTO`
--
INSERT INTO `OutletWorkingScheduleDTO`(`workInHoliday`, `scheduleItems`) VALUES (?, ?);

--
-- UPDATE template for table `OutletWorkingScheduleDTO`
--
UPDATE `OutletWorkingScheduleDTO` SET `workInHoliday` = ?, `scheduleItems` = ? WHERE 1;

--
-- DELETE template for table `OutletWorkingScheduleDTO`
--
DELETE FROM `OutletWorkingScheduleDTO` WHERE 0;

