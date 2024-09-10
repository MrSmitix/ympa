--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetReportInfoResponse' definition.
--


--
-- SELECT template for table `GetReportInfoResponse`
--
SELECT `status`, `result` FROM `GetReportInfoResponse` WHERE 1;

--
-- INSERT template for table `GetReportInfoResponse`
--
INSERT INTO `GetReportInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetReportInfoResponse`
--
UPDATE `GetReportInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetReportInfoResponse`
--
DELETE FROM `GetReportInfoResponse` WHERE 0;

