--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateReportDTO' definition.
--


--
-- SELECT template for table `GenerateReportDTO`
--
SELECT `reportId`, `estimatedGenerationTime` FROM `GenerateReportDTO` WHERE 1;

--
-- INSERT template for table `GenerateReportDTO`
--
INSERT INTO `GenerateReportDTO`(`reportId`, `estimatedGenerationTime`) VALUES (?, ?);

--
-- UPDATE template for table `GenerateReportDTO`
--
UPDATE `GenerateReportDTO` SET `reportId` = ?, `estimatedGenerationTime` = ? WHERE 1;

--
-- DELETE template for table `GenerateReportDTO`
--
DELETE FROM `GenerateReportDTO` WHERE 0;

