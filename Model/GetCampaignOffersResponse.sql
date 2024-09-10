--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCampaignOffersResponse' definition.
--


--
-- SELECT template for table `GetCampaignOffersResponse`
--
SELECT `status`, `result` FROM `GetCampaignOffersResponse` WHERE 1;

--
-- INSERT template for table `GetCampaignOffersResponse`
--
INSERT INTO `GetCampaignOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetCampaignOffersResponse`
--
UPDATE `GetCampaignOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetCampaignOffersResponse`
--
DELETE FROM `GetCampaignOffersResponse` WHERE 0;

