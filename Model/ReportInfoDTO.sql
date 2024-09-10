--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ReportInfoDTO' definition.
--


--
-- SELECT template for table `ReportInfoDTO`
--
SELECT `status`, `subStatus`, `generationRequestedAt`, `generationFinishedAt`, `file`, `estimatedGenerationTime` FROM `ReportInfoDTO` WHERE 1;

--
-- INSERT template for table `ReportInfoDTO`
--
INSERT INTO `ReportInfoDTO`(`status`, `subStatus`, `generationRequestedAt`, `generationFinishedAt`, `file`, `estimatedGenerationTime`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ReportInfoDTO`
--
UPDATE `ReportInfoDTO` SET `status` = ?, `subStatus` = ?, `generationRequestedAt` = ?, `generationFinishedAt` = ?, `file` = ?, `estimatedGenerationTime` = ? WHERE 1;

--
-- DELETE template for table `ReportInfoDTO`
--
DELETE FROM `ReportInfoDTO` WHERE 0;

