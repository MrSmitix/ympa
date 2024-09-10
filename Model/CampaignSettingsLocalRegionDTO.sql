--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignSettingsLocalRegionDTO' definition.
--


--
-- SELECT template for table `CampaignSettingsLocalRegionDTO`
--
SELECT `id`, `name`, `type`, `deliveryOptionsSource`, `delivery` FROM `CampaignSettingsLocalRegionDTO` WHERE 1;

--
-- INSERT template for table `CampaignSettingsLocalRegionDTO`
--
INSERT INTO `CampaignSettingsLocalRegionDTO`(`id`, `name`, `type`, `deliveryOptionsSource`, `delivery`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignSettingsLocalRegionDTO`
--
UPDATE `CampaignSettingsLocalRegionDTO` SET `id` = ?, `name` = ?, `type` = ?, `deliveryOptionsSource` = ?, `delivery` = ? WHERE 1;

--
-- DELETE template for table `CampaignSettingsLocalRegionDTO`
--
DELETE FROM `CampaignSettingsLocalRegionDTO` WHERE 0;

