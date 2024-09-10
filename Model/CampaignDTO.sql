--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignDTO' definition.
--


--
-- SELECT template for table `CampaignDTO`
--
SELECT `domain`, `id`, `clientId`, `business`, `placementType` FROM `CampaignDTO` WHERE 1;

--
-- INSERT template for table `CampaignDTO`
--
INSERT INTO `CampaignDTO`(`domain`, `id`, `clientId`, `business`, `placementType`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignDTO`
--
UPDATE `CampaignDTO` SET `domain` = ?, `id` = ?, `clientId` = ?, `business` = ?, `placementType` = ? WHERE 1;

--
-- DELETE template for table `CampaignDTO`
--
DELETE FROM `CampaignDTO` WHERE 0;

