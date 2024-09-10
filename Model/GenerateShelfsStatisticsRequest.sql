--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateShelfsStatisticsRequest' definition.
--


--
-- SELECT template for table `GenerateShelfsStatisticsRequest`
--
SELECT `businessId`, `dateFrom`, `dateTo`, `attributionType` FROM `GenerateShelfsStatisticsRequest` WHERE 1;

--
-- INSERT template for table `GenerateShelfsStatisticsRequest`
--
INSERT INTO `GenerateShelfsStatisticsRequest`(`businessId`, `dateFrom`, `dateTo`, `attributionType`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GenerateShelfsStatisticsRequest`
--
UPDATE `GenerateShelfsStatisticsRequest` SET `businessId` = ?, `dateFrom` = ?, `dateTo` = ?, `attributionType` = ? WHERE 1;

--
-- DELETE template for table `GenerateShelfsStatisticsRequest`
--
DELETE FROM `GenerateShelfsStatisticsRequest` WHERE 0;

