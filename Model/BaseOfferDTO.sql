--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BaseOfferDTO' definition.
--


--
-- SELECT template for table `BaseOfferDTO`
--
SELECT `offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params` FROM `BaseOfferDTO` WHERE 1;

--
-- INSERT template for table `BaseOfferDTO`
--
INSERT INTO `BaseOfferDTO`(`offerId`, `name`, `marketCategoryId`, `category`, `pictures`, `videos`, `manuals`, `vendor`, `barcodes`, `description`, `manufacturerCountries`, `weightDimensions`, `vendorCode`, `tags`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `customsCommodityCode`, `certificates`, `boxCount`, `condition`, `type`, `downloadable`, `adult`, `age`, `params`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BaseOfferDTO`
--
UPDATE `BaseOfferDTO` SET `offerId` = ?, `name` = ?, `marketCategoryId` = ?, `category` = ?, `pictures` = ?, `videos` = ?, `manuals` = ?, `vendor` = ?, `barcodes` = ?, `description` = ?, `manufacturerCountries` = ?, `weightDimensions` = ?, `vendorCode` = ?, `tags` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `customsCommodityCode` = ?, `certificates` = ?, `boxCount` = ?, `condition` = ?, `type` = ?, `downloadable` = ?, `adult` = ?, `age` = ?, `params` = ? WHERE 1;

--
-- DELETE template for table `BaseOfferDTO`
--
DELETE FROM `BaseOfferDTO` WHERE 0;

