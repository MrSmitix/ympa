--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignQualityRatingDTO' definition.
--


--
-- SELECT template for table `CampaignQualityRatingDTO`
--
SELECT `campaignId`, `ratings` FROM `CampaignQualityRatingDTO` WHERE 1;

--
-- INSERT template for table `CampaignQualityRatingDTO`
--
INSERT INTO `CampaignQualityRatingDTO`(`campaignId`, `ratings`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignQualityRatingDTO`
--
UPDATE `CampaignQualityRatingDTO` SET `campaignId` = ?, `ratings` = ? WHERE 1;

--
-- DELETE template for table `CampaignQualityRatingDTO`
--
DELETE FROM `CampaignQualityRatingDTO` WHERE 0;

