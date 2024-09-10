--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PromoOfferDiscountParamsDTO' definition.
--


--
-- SELECT template for table `PromoOfferDiscountParamsDTO`
--
SELECT `price`, `promoPrice`, `maxPromoPrice` FROM `PromoOfferDiscountParamsDTO` WHERE 1;

--
-- INSERT template for table `PromoOfferDiscountParamsDTO`
--
INSERT INTO `PromoOfferDiscountParamsDTO`(`price`, `promoPrice`, `maxPromoPrice`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PromoOfferDiscountParamsDTO`
--
UPDATE `PromoOfferDiscountParamsDTO` SET `price` = ?, `promoPrice` = ?, `maxPromoPrice` = ? WHERE 1;

--
-- DELETE template for table `PromoOfferDiscountParamsDTO`
--
DELETE FROM `PromoOfferDiscountParamsDTO` WHERE 0;

