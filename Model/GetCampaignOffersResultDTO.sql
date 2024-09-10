--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCampaignOffersResultDTO' definition.
--


--
-- SELECT template for table `GetCampaignOffersResultDTO`
--
SELECT `paging`, `offers` FROM `GetCampaignOffersResultDTO` WHERE 1;

--
-- INSERT template for table `GetCampaignOffersResultDTO`
--
INSERT INTO `GetCampaignOffersResultDTO`(`paging`, `offers`) VALUES (?, ?);

--
-- UPDATE template for table `GetCampaignOffersResultDTO`
--
UPDATE `GetCampaignOffersResultDTO` SET `paging` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `GetCampaignOffersResultDTO`
--
DELETE FROM `GetCampaignOffersResultDTO` WHERE 0;

