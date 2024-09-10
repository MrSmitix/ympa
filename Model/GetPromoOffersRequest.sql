--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoOffersRequest' definition.
--


--
-- SELECT template for table `GetPromoOffersRequest`
--
SELECT `promoId`, `statusType` FROM `GetPromoOffersRequest` WHERE 1;

--
-- INSERT template for table `GetPromoOffersRequest`
--
INSERT INTO `GetPromoOffersRequest`(`promoId`, `statusType`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoOffersRequest`
--
UPDATE `GetPromoOffersRequest` SET `promoId` = ?, `statusType` = ? WHERE 1;

--
-- DELETE template for table `GetPromoOffersRequest`
--
DELETE FROM `GetPromoOffersRequest` WHERE 0;

