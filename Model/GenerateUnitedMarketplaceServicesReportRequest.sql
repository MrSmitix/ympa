--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateUnitedMarketplaceServicesReportRequest' definition.
--


--
-- SELECT template for table `GenerateUnitedMarketplaceServicesReportRequest`
--
SELECT `businessId`, `dateTimeFrom`, `dateTimeTo`, `dateFrom`, `dateTo`, `yearFrom`, `monthFrom`, `yearTo`, `monthTo`, `placementPrograms`, `inns`, `campaignIds` FROM `GenerateUnitedMarketplaceServicesReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateUnitedMarketplaceServicesReportRequest`
--
INSERT INTO `GenerateUnitedMarketplaceServicesReportRequest`(`businessId`, `dateTimeFrom`, `dateTimeTo`, `dateFrom`, `dateTo`, `yearFrom`, `monthFrom`, `yearTo`, `monthTo`, `placementPrograms`, `inns`, `campaignIds`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerateUnitedMarketplaceServicesReportRequest`
--
UPDATE `GenerateUnitedMarketplaceServicesReportRequest` SET `businessId` = ?, `dateTimeFrom` = ?, `dateTimeTo` = ?, `dateFrom` = ?, `dateTo` = ?, `yearFrom` = ?, `monthFrom` = ?, `yearTo` = ?, `monthTo` = ?, `placementPrograms` = ?, `inns` = ?, `campaignIds` = ? WHERE 1;

--
-- DELETE template for table `GenerateUnitedMarketplaceServicesReportRequest`
--
DELETE FROM `GenerateUnitedMarketplaceServicesReportRequest` WHERE 0;

