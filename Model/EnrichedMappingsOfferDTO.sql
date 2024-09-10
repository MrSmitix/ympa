--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'EnrichedMappingsOfferDTO' definition.
--


--
-- SELECT template for table `EnrichedMappingsOfferDTO`
--
SELECT `name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`, `price`, `marketCategoryId`, `marketCategoryName`, `marketModelId`, `marketModelName`, `marketSku`, `marketSkuName` FROM `EnrichedMappingsOfferDTO` WHERE 1;

--
-- INSERT template for table `EnrichedMappingsOfferDTO`
--
INSERT INTO `EnrichedMappingsOfferDTO`(`name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`, `price`, `marketCategoryId`, `marketCategoryName`, `marketModelId`, `marketModelName`, `marketSku`, `marketSkuName`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EnrichedMappingsOfferDTO`
--
UPDATE `EnrichedMappingsOfferDTO` SET `name` = ?, `shopSku` = ?, `category` = ?, `vendor` = ?, `vendorCode` = ?, `description` = ?, `id` = ?, `feedId` = ?, `barcodes` = ?, `urls` = ?, `pictures` = ?, `manufacturer` = ?, `manufacturerCountries` = ?, `minShipment` = ?, `transportUnitSize` = ?, `quantumOfSupply` = ?, `deliveryDurationDays` = ?, `boxCount` = ?, `customsCommodityCodes` = ?, `weightDimensions` = ?, `supplyScheduleDays` = ?, `shelfLifeDays` = ?, `lifeTimeDays` = ?, `guaranteePeriodDays` = ?, `processingState` = ?, `availability` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `certificate` = ?, `price` = ?, `marketCategoryId` = ?, `marketCategoryName` = ?, `marketModelId` = ?, `marketModelName` = ?, `marketSku` = ?, `marketSkuName` = ? WHERE 1;

--
-- DELETE template for table `EnrichedMappingsOfferDTO`
--
DELETE FROM `EnrichedMappingsOfferDTO` WHERE 0;

