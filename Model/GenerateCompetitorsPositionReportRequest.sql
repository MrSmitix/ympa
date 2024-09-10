--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateCompetitorsPositionReportRequest' definition.
--


--
-- SELECT template for table `GenerateCompetitorsPositionReportRequest`
--
SELECT `businessId`, `categoryId`, `dateFrom`, `dateTo` FROM `GenerateCompetitorsPositionReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateCompetitorsPositionReportRequest`
--
INSERT INTO `GenerateCompetitorsPositionReportRequest`(`businessId`, `categoryId`, `dateFrom`, `dateTo`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GenerateCompetitorsPositionReportRequest`
--
UPDATE `GenerateCompetitorsPositionReportRequest` SET `businessId` = ?, `categoryId` = ?, `dateFrom` = ?, `dateTo` = ? WHERE 1;

--
-- DELETE template for table `GenerateCompetitorsPositionReportRequest`
--
DELETE FROM `GenerateCompetitorsPositionReportRequest` WHERE 0;

