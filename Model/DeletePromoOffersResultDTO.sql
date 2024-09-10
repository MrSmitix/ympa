--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeletePromoOffersResultDTO' definition.
--


--
-- SELECT template for table `DeletePromoOffersResultDTO`
--
SELECT `rejectedOffers` FROM `DeletePromoOffersResultDTO` WHERE 1;

--
-- INSERT template for table `DeletePromoOffersResultDTO`
--
INSERT INTO `DeletePromoOffersResultDTO`(`rejectedOffers`) VALUES (?);

--
-- UPDATE template for table `DeletePromoOffersResultDTO`
--
UPDATE `DeletePromoOffersResultDTO` SET `rejectedOffers` = ? WHERE 1;

--
-- DELETE template for table `DeletePromoOffersResultDTO`
--
DELETE FROM `DeletePromoOffersResultDTO` WHERE 0;

