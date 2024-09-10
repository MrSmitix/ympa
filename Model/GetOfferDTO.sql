--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferDTO' definition.
--


--
-- SELECT template for table `GetOfferDTO`
--
SELECT `offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params`, `basicPrice`, `purchasePrice`, `additionalExpenses`, `cofinancePrice`, `cardStatus`, `campaigns`, `sellingPrograms`, `archived` FROM `GetOfferDTO` WHERE 1;

--
-- INSERT template for table `GetOfferDTO`
--
INSERT INTO `GetOfferDTO`(`offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params`, `basicPrice`, `purchasePrice`, `additionalExpenses`, `cofinancePrice`, `cardStatus`, `campaigns`, `sellingPrograms`, `archived`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetOfferDTO`
--
UPDATE `GetOfferDTO` SET `offerId` = ?, `name` = ?, `marketCategoryId` = ?, `category` = ?, `pictures` = ?, `videos` = ?, `manuals` = ?, `vendor` = ?, `barcodes` = ?, `description` = ?, `manufacturerCountries` = ?, `weightDimensions` = ?, `vendorCode` = ?, `tags` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `customsCommodityCode` = ?, `certificates` = ?, `boxCount` = ?, `condition` = ?, `type` = ?, `downloadable` = ?, `adult` = ?, `age` = ?, `params` = ?, `basicPrice` = ?, `purchasePrice` = ?, `additionalExpenses` = ?, `cofinancePrice` = ?, `cardStatus` = ?, `campaigns` = ?, `sellingPrograms` = ?, `archived` = ? WHERE 1;

--
-- DELETE template for table `GetOfferDTO`
--
DELETE FROM `GetOfferDTO` WHERE 0;

