--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferDTO' definition.
--


--
-- SELECT template for table `UpdateOfferDTO`
--
SELECT `offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params`, `parameterValues`, `basicPrice`, `purchasePrice`, `additionalExpenses`, `cofinancePrice` FROM `UpdateOfferDTO` WHERE 1;

--
-- INSERT template for table `UpdateOfferDTO`
--
INSERT INTO `UpdateOfferDTO`(`offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params`, `parameterValues`, `basicPrice`, `purchasePrice`, `additionalExpenses`, `cofinancePrice`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UpdateOfferDTO`
--
UPDATE `UpdateOfferDTO` SET `offerId` = ?, `name` = ?, `marketCategoryId` = ?, `category` = ?, `pictures` = ?, `videos` = ?, `manuals` = ?, `vendor` = ?, `barcodes` = ?, `description` = ?, `manufacturerCountries` = ?, `weightDimensions` = ?, `vendorCode` = ?, `tags` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `customsCommodityCode` = ?, `certificates` = ?, `boxCount` = ?, `condition` = ?, `type` = ?, `downloadable` = ?, `adult` = ?, `age` = ?, `params` = ?, `parameterValues` = ?, `basicPrice` = ?, `purchasePrice` = ?, `additionalExpenses` = ?, `cofinancePrice` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferDTO`
--
DELETE FROM `UpdateOfferDTO` WHERE 0;

