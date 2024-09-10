--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteCampaignOffersRequest' definition.
--


--
-- SELECT template for table `DeleteCampaignOffersRequest`
--
SELECT `offerIds` FROM `DeleteCampaignOffersRequest` WHERE 1;

--
-- INSERT template for table `DeleteCampaignOffersRequest`
--
INSERT INTO `DeleteCampaignOffersRequest`(`offerIds`) VALUES (?);

--
-- UPDATE template for table `DeleteCampaignOffersRequest`
--
UPDATE `DeleteCampaignOffersRequest` SET `offerIds` = ? WHERE 1;

--
-- DELETE template for table `DeleteCampaignOffersRequest`
--
DELETE FROM `DeleteCampaignOffersRequest` WHERE 0;

