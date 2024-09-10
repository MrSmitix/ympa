--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateUnitedNettingReportRequest' definition.
--


--
-- SELECT template for table `GenerateUnitedNettingReportRequest`
--
SELECT `businessId`, `dateTimeFrom`, `dateTimeTo`, `dateFrom`, `dateTo`, `bankOrderId`, `bankOrderDateTime`, `placementPrograms`, `inns`, `campaignIds` FROM `GenerateUnitedNettingReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateUnitedNettingReportRequest`
--
INSERT INTO `GenerateUnitedNettingReportRequest`(`businessId`, `dateTimeFrom`, `dateTimeTo`, `dateFrom`, `dateTo`, `bankOrderId`, `bankOrderDateTime`, `placementPrograms`, `inns`, `campaignIds`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerateUnitedNettingReportRequest`
--
UPDATE `GenerateUnitedNettingReportRequest` SET `businessId` = ?, `dateTimeFrom` = ?, `dateTimeTo` = ?, `dateFrom` = ?, `dateTo` = ?, `bankOrderId` = ?, `bankOrderDateTime` = ?, `placementPrograms` = ?, `inns` = ?, `campaignIds` = ? WHERE 1;

--
-- DELETE template for table `GenerateUnitedNettingReportRequest`
--
DELETE FROM `GenerateUnitedNettingReportRequest` WHERE 0;

