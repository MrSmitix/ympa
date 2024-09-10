--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetCampaignsResponse' definition.
--


--
-- SELECT template for table `GetCampaignsResponse`
--
SELECT `campaigns`, `pager` FROM `GetCampaignsResponse` WHERE 1;

--
-- INSERT template for table `GetCampaignsResponse`
--
INSERT INTO `GetCampaignsResponse`(`campaigns`, `pager`) VALUES (?, ?);

--
-- UPDATE template for table `GetCampaignsResponse`
--
UPDATE `GetCampaignsResponse` SET `campaigns` = ?, `pager` = ? WHERE 1;

--
-- DELETE template for table `GetCampaignsResponse`
--
DELETE FROM `GetCampaignsResponse` WHERE 0;

