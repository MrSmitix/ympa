--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateShowsSalesReportRequest' definition.
--


--
-- SELECT template for table `GenerateShowsSalesReportRequest`
--
SELECT `businessId`, `campaignId`, `dateFrom`, `dateTo`, `grouping` FROM `GenerateShowsSalesReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateShowsSalesReportRequest`
--
INSERT INTO `GenerateShowsSalesReportRequest`(`businessId`, `campaignId`, `dateFrom`, `dateTo`, `grouping`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerateShowsSalesReportRequest`
--
UPDATE `GenerateShowsSalesReportRequest` SET `businessId` = ?, `campaignId` = ?, `dateFrom` = ?, `dateTo` = ?, `grouping` = ? WHERE 1;

--
-- DELETE template for table `GenerateShowsSalesReportRequest`
--
DELETE FROM `GenerateShowsSalesReportRequest` WHERE 0;

