--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCampaignOffersRequest' definition.
--


--
-- SELECT template for table `GetCampaignOffersRequest`
--
SELECT `offerIds`, `statuses`, `categoryIds`, `vendorNames`, `tags` FROM `GetCampaignOffersRequest` WHERE 1;

--
-- INSERT template for table `GetCampaignOffersRequest`
--
INSERT INTO `GetCampaignOffersRequest`(`offerIds`, `statuses`, `categoryIds`, `vendorNames`, `tags`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetCampaignOffersRequest`
--
UPDATE `GetCampaignOffersRequest` SET `offerIds` = ?, `statuses` = ?, `categoryIds` = ?, `vendorNames` = ?, `tags` = ? WHERE 1;

--
-- DELETE template for table `GetCampaignOffersRequest`
--
DELETE FROM `GetCampaignOffersRequest` WHERE 0;

