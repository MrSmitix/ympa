--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GeneratePricesReportRequest' definition.
--


--
-- SELECT template for table `GeneratePricesReportRequest`
--
SELECT `businessId`, `campaignId`, `categoryIds`, `creationDateFrom`, `creationDateTo` FROM `GeneratePricesReportRequest` WHERE 1;

--
-- INSERT template for table `GeneratePricesReportRequest`
--
INSERT INTO `GeneratePricesReportRequest`(`businessId`, `campaignId`, `categoryIds`, `creationDateFrom`, `creationDateTo`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GeneratePricesReportRequest`
--
UPDATE `GeneratePricesReportRequest` SET `businessId` = ?, `campaignId` = ?, `categoryIds` = ?, `creationDateFrom` = ?, `creationDateTo` = ? WHERE 1;

--
-- DELETE template for table `GeneratePricesReportRequest`
--
DELETE FROM `GeneratePricesReportRequest` WHERE 0;

