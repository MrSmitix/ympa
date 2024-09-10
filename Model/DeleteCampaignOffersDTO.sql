--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteCampaignOffersDTO' definition.
--


--
-- SELECT template for table `DeleteCampaignOffersDTO`
--
SELECT `notDeletedOfferIds` FROM `DeleteCampaignOffersDTO` WHERE 1;

--
-- INSERT template for table `DeleteCampaignOffersDTO`
--
INSERT INTO `DeleteCampaignOffersDTO`(`notDeletedOfferIds`) VALUES (?);

--
-- UPDATE template for table `DeleteCampaignOffersDTO`
--
UPDATE `DeleteCampaignOffersDTO` SET `notDeletedOfferIds` = ? WHERE 1;

--
-- DELETE template for table `DeleteCampaignOffersDTO`
--
DELETE FROM `DeleteCampaignOffersDTO` WHERE 0;

