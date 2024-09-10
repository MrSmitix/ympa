--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PromoOfferParamsDTO' definition.
--


--
-- SELECT template for table `PromoOfferParamsDTO`
--
SELECT `discountParams`, `promocodeParams` FROM `PromoOfferParamsDTO` WHERE 1;

--
-- INSERT template for table `PromoOfferParamsDTO`
--
INSERT INTO `PromoOfferParamsDTO`(`discountParams`, `promocodeParams`) VALUES (?, ?);

--
-- UPDATE template for table `PromoOfferParamsDTO`
--
UPDATE `PromoOfferParamsDTO` SET `discountParams` = ?, `promocodeParams` = ? WHERE 1;

--
-- DELETE template for table `PromoOfferParamsDTO`
--
DELETE FROM `PromoOfferParamsDTO` WHERE 0;

