--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePromoOffersResultDTO' definition.
--


--
-- SELECT template for table `UpdatePromoOffersResultDTO`
--
SELECT `rejectedOffers`, `warningOffers` FROM `UpdatePromoOffersResultDTO` WHERE 1;

--
-- INSERT template for table `UpdatePromoOffersResultDTO`
--
INSERT INTO `UpdatePromoOffersResultDTO`(`rejectedOffers`, `warningOffers`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePromoOffersResultDTO`
--
UPDATE `UpdatePromoOffersResultDTO` SET `rejectedOffers` = ?, `warningOffers` = ? WHERE 1;

--
-- DELETE template for table `UpdatePromoOffersResultDTO`
--
DELETE FROM `UpdatePromoOffersResultDTO` WHERE 0;

