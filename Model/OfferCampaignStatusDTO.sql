--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferCampaignStatusDTO' definition.
--


--
-- SELECT template for table `OfferCampaignStatusDTO`
--
SELECT `campaignId`, `status` FROM `OfferCampaignStatusDTO` WHERE 1;

--
-- INSERT template for table `OfferCampaignStatusDTO`
--
INSERT INTO `OfferCampaignStatusDTO`(`campaignId`, `status`) VALUES (?, ?);

--
-- UPDATE template for table `OfferCampaignStatusDTO`
--
UPDATE `OfferCampaignStatusDTO` SET `campaignId` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `OfferCampaignStatusDTO`
--
DELETE FROM `OfferCampaignStatusDTO` WHERE 0;

