--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateReportResponse' definition.
--


--
-- SELECT template for table `GenerateReportResponse`
--
SELECT `status`, `result` FROM `GenerateReportResponse` WHERE 1;

--
-- INSERT template for table `GenerateReportResponse`
--
INSERT INTO `GenerateReportResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GenerateReportResponse`
--
UPDATE `GenerateReportResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GenerateReportResponse`
--
DELETE FROM `GenerateReportResponse` WHERE 0;

