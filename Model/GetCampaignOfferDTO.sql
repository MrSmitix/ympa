--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCampaignOfferDTO' definition.
--


--
-- SELECT template for table `GetCampaignOfferDTO`
--
SELECT `offerId`, `quantum`, `available`, `basicPrice`, `campaignPrice`, `status`, `errors`, `warnings` FROM `GetCampaignOfferDTO` WHERE 1;

--
-- INSERT template for table `GetCampaignOfferDTO`
--
INSERT INTO `GetCampaignOfferDTO`(`offerId`, `quantum`, `available`, `basicPrice`, `campaignPrice`, `status`, `errors`, `warnings`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetCampaignOfferDTO`
--
UPDATE `GetCampaignOfferDTO` SET `offerId` = ?, `quantum` = ?, `available` = ?, `basicPrice` = ?, `campaignPrice` = ?, `status` = ?, `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `GetCampaignOfferDTO`
--
DELETE FROM `GetCampaignOfferDTO` WHERE 0;

