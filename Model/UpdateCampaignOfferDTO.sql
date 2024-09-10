--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateCampaignOfferDTO' definition.
--


--
-- SELECT template for table `UpdateCampaignOfferDTO`
--
SELECT `offerId`, `quantum`, `available`, `vat` FROM `UpdateCampaignOfferDTO` WHERE 1;

--
-- INSERT template for table `UpdateCampaignOfferDTO`
--
INSERT INTO `UpdateCampaignOfferDTO`(`offerId`, `quantum`, `available`, `vat`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `UpdateCampaignOfferDTO`
--
UPDATE `UpdateCampaignOfferDTO` SET `offerId` = ?, `quantum` = ?, `available` = ?, `vat` = ? WHERE 1;

--
-- DELETE template for table `UpdateCampaignOfferDTO`
--
DELETE FROM `UpdateCampaignOfferDTO` WHERE 0;

