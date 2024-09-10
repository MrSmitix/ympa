--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignSettingsDTO' definition.
--


--
-- SELECT template for table `CampaignSettingsDTO`
--
SELECT `countryRegion`, `shopName`, `showInContext`, `showInPremium`, `useOpenStat`, `localRegion` FROM `CampaignSettingsDTO` WHERE 1;

--
-- INSERT template for table `CampaignSettingsDTO`
--
INSERT INTO `CampaignSettingsDTO`(`countryRegion`, `shopName`, `showInContext`, `showInPremium`, `useOpenStat`, `localRegion`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignSettingsDTO`
--
UPDATE `CampaignSettingsDTO` SET `countryRegion` = ?, `shopName` = ?, `showInContext` = ?, `showInPremium` = ?, `useOpenStat` = ?, `localRegion` = ? WHERE 1;

--
-- DELETE template for table `CampaignSettingsDTO`
--
DELETE FROM `CampaignSettingsDTO` WHERE 0;

