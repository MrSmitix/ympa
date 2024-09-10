--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePromoOfferDiscountParamsDTO' definition.
--


--
-- SELECT template for table `UpdatePromoOfferDiscountParamsDTO`
--
SELECT `price`, `promoPrice` FROM `UpdatePromoOfferDiscountParamsDTO` WHERE 1;

--
-- INSERT template for table `UpdatePromoOfferDiscountParamsDTO`
--
INSERT INTO `UpdatePromoOfferDiscountParamsDTO`(`price`, `promoPrice`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePromoOfferDiscountParamsDTO`
--
UPDATE `UpdatePromoOfferDiscountParamsDTO` SET `price` = ?, `promoPrice` = ? WHERE 1;

--
-- DELETE template for table `UpdatePromoOfferDiscountParamsDTO`
--
DELETE FROM `UpdatePromoOfferDiscountParamsDTO` WHERE 0;

