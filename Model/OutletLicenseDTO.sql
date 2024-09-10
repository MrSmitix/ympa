--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletLicenseDTO' definition.
--


--
-- SELECT template for table `OutletLicenseDTO`
--
SELECT `id`, `outletId`, `licenseType`, `number`, `dateOfIssue`, `dateOfExpiry` FROM `OutletLicenseDTO` WHERE 1;

--
-- INSERT template for table `OutletLicenseDTO`
--
INSERT INTO `OutletLicenseDTO`(`id`, `outletId`, `licenseType`, `number`, `dateOfIssue`, `dateOfExpiry`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OutletLicenseDTO`
--
UPDATE `OutletLicenseDTO` SET `id` = ?, `outletId` = ?, `licenseType` = ?, `number` = ?, `dateOfIssue` = ?, `dateOfExpiry` = ? WHERE 1;

--
-- DELETE template for table `OutletLicenseDTO`
--
DELETE FROM `OutletLicenseDTO` WHERE 0;

