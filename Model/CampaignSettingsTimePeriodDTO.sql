--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignSettingsTimePeriodDTO' definition.
--


--
-- SELECT template for table `CampaignSettingsTimePeriodDTO`
--
SELECT `fromDate`, `toDate` FROM `CampaignSettingsTimePeriodDTO` WHERE 1;

--
-- INSERT template for table `CampaignSettingsTimePeriodDTO`
--
INSERT INTO `CampaignSettingsTimePeriodDTO`(`fromDate`, `toDate`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignSettingsTimePeriodDTO`
--
UPDATE `CampaignSettingsTimePeriodDTO` SET `fromDate` = ?, `toDate` = ? WHERE 1;

--
-- DELETE template for table `CampaignSettingsTimePeriodDTO`
--
DELETE FROM `CampaignSettingsTimePeriodDTO` WHERE 0;

