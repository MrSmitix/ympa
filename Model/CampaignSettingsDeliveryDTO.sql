--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignSettingsDeliveryDTO' definition.
--


--
-- SELECT template for table `CampaignSettingsDeliveryDTO`
--
SELECT `schedule` FROM `CampaignSettingsDeliveryDTO` WHERE 1;

--
-- INSERT template for table `CampaignSettingsDeliveryDTO`
--
INSERT INTO `CampaignSettingsDeliveryDTO`(`schedule`) VALUES (?);

--
-- UPDATE template for table `CampaignSettingsDeliveryDTO`
--
UPDATE `CampaignSettingsDeliveryDTO` SET `schedule` = ? WHERE 1;

--
-- DELETE template for table `CampaignSettingsDeliveryDTO`
--
DELETE FROM `CampaignSettingsDeliveryDTO` WHERE 0;

