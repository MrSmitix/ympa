--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FullOutletLicenseDTO' definition.
--


--
-- SELECT template for table `FullOutletLicenseDTO`
--
SELECT `id`, `outletId`, `licenseType`, `number`, `dateOfIssue`, `dateOfExpiry`, `checkStatus`, `checkComment` FROM `FullOutletLicenseDTO` WHERE 1;

--
-- INSERT template for table `FullOutletLicenseDTO`
--
INSERT INTO `FullOutletLicenseDTO`(`id`, `outletId`, `licenseType`, `number`, `dateOfIssue`, `dateOfExpiry`, `checkStatus`, `checkComment`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FullOutletLicenseDTO`
--
UPDATE `FullOutletLicenseDTO` SET `id` = ?, `outletId` = ?, `licenseType` = ?, `number` = ?, `dateOfIssue` = ?, `dateOfExpiry` = ?, `checkStatus` = ?, `checkComment` = ? WHERE 1;

--
-- DELETE template for table `FullOutletLicenseDTO`
--
DELETE FROM `FullOutletLicenseDTO` WHERE 0;

