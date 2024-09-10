--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestedOfferDTO' definition.
--


--
-- SELECT template for table `SuggestedOfferDTO`
--
SELECT `offerId`, `name`, `category`, `vendor`, `barcodes`, `description`, `vendorCode`, `basicPrice` FROM `SuggestedOfferDTO` WHERE 1;

--
-- INSERT template for table `SuggestedOfferDTO`
--
INSERT INTO `SuggestedOfferDTO`(`offerId`, `name`, `category`, `vendor`, `barcodes`, `description`, `vendorCode`, `basicPrice`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SuggestedOfferDTO`
--
UPDATE `SuggestedOfferDTO` SET `offerId` = ?, `name` = ?, `category` = ?, `vendor` = ?, `barcodes` = ?, `description` = ?, `vendorCode` = ?, `basicPrice` = ? WHERE 1;

--
-- DELETE template for table `SuggestedOfferDTO`
--
DELETE FROM `SuggestedOfferDTO` WHERE 0;

