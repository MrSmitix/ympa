--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ModelOfferDTO' definition.
--


--
-- SELECT template for table `ModelOfferDTO`
--
SELECT `discount`, `name`, `pos`, `preDiscountPrice`, `price`, `regionId`, `shippingCost`, `shopName`, `shopRating`, `inStock` FROM `ModelOfferDTO` WHERE 1;

--
-- INSERT template for table `ModelOfferDTO`
--
INSERT INTO `ModelOfferDTO`(`discount`, `name`, `pos`, `preDiscountPrice`, `price`, `regionId`, `shippingCost`, `shopName`, `shopRating`, `inStock`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ModelOfferDTO`
--
UPDATE `ModelOfferDTO` SET `discount` = ?, `name` = ?, `pos` = ?, `preDiscountPrice` = ?, `price` = ?, `regionId` = ?, `shippingCost` = ?, `shopName` = ?, `shopRating` = ?, `inStock` = ? WHERE 1;

--
-- DELETE template for table `ModelOfferDTO`
--
DELETE FROM `ModelOfferDTO` WHERE 0;

