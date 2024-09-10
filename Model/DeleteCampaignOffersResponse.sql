--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteCampaignOffersResponse' definition.
--


--
-- SELECT template for table `DeleteCampaignOffersResponse`
--
SELECT `status`, `result` FROM `DeleteCampaignOffersResponse` WHERE 1;

--
-- INSERT template for table `DeleteCampaignOffersResponse`
--
INSERT INTO `DeleteCampaignOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteCampaignOffersResponse`
--
UPDATE `DeleteCampaignOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `DeleteCampaignOffersResponse`
--
DELETE FROM `DeleteCampaignOffersResponse` WHERE 0;

