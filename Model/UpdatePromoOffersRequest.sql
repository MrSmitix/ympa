--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePromoOffersRequest' definition.
--


--
-- SELECT template for table `UpdatePromoOffersRequest`
--
SELECT `promoId`, `offers` FROM `UpdatePromoOffersRequest` WHERE 1;

--
-- INSERT template for table `UpdatePromoOffersRequest`
--
INSERT INTO `UpdatePromoOffersRequest`(`promoId`, `offers`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePromoOffersRequest`
--
UPDATE `UpdatePromoOffersRequest` SET `promoId` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `UpdatePromoOffersRequest`
--
DELETE FROM `UpdatePromoOffersRequest` WHERE 0;

