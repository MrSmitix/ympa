--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeletePromoOffersRequest' definition.
--


--
-- SELECT template for table `DeletePromoOffersRequest`
--
SELECT `promoId`, `deleteAllOffers`, `offerIds` FROM `DeletePromoOffersRequest` WHERE 1;

--
-- INSERT template for table `DeletePromoOffersRequest`
--
INSERT INTO `DeletePromoOffersRequest`(`promoId`, `deleteAllOffers`, `offerIds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeletePromoOffersRequest`
--
UPDATE `DeletePromoOffersRequest` SET `promoId` = ?, `deleteAllOffers` = ?, `offerIds` = ? WHERE 1;

--
-- DELETE template for table `DeletePromoOffersRequest`
--
DELETE FROM `DeletePromoOffersRequest` WHERE 0;

