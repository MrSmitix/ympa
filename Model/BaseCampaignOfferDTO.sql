--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BaseCampaignOfferDTO' definition.
--


--
-- SELECT template for table `BaseCampaignOfferDTO`
--
SELECT `offerId`, `quantum`, `available` FROM `BaseCampaignOfferDTO` WHERE 1;

--
-- INSERT template for table `BaseCampaignOfferDTO`
--
INSERT INTO `BaseCampaignOfferDTO`(`offerId`, `quantum`, `available`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BaseCampaignOfferDTO`
--
UPDATE `BaseCampaignOfferDTO` SET `offerId` = ?, `quantum` = ?, `available` = ? WHERE 1;

--
-- DELETE template for table `BaseCampaignOfferDTO`
--
DELETE FROM `BaseCampaignOfferDTO` WHERE 0;

