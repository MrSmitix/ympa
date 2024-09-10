--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferDTO' definition.
--


--
-- SELECT template for table `OfferDTO`
--
SELECT `price`, `feedId`, `id`, `shopCategoryId`, `marketCategoryId`, `preDiscountPrice`, `discount`, `cutPrice`, `url`, `modelId`, `name`, `currency`, `bid`, `cbid`, `fee`, `blocked` FROM `OfferDTO` WHERE 1;

--
-- INSERT template for table `OfferDTO`
--
INSERT INTO `OfferDTO`(`price`, `feedId`, `id`, `shopCategoryId`, `marketCategoryId`, `preDiscountPrice`, `discount`, `cutPrice`, `url`, `modelId`, `name`, `currency`, `bid`, `cbid`, `fee`, `blocked`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OfferDTO`
--
UPDATE `OfferDTO` SET `price` = ?, `feedId` = ?, `id` = ?, `shopCategoryId` = ?, `marketCategoryId` = ?, `preDiscountPrice` = ?, `discount` = ?, `cutPrice` = ?, `url` = ?, `modelId` = ?, `name` = ?, `currency` = ?, `bid` = ?, `cbid` = ?, `fee` = ?, `blocked` = ? WHERE 1;

--
-- DELETE template for table `OfferDTO`
--
DELETE FROM `OfferDTO` WHERE 0;

