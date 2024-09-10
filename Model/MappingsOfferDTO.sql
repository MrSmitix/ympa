--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'MappingsOfferDTO' definition.
--


--
-- SELECT template for table `MappingsOfferDTO`
--
SELECT `name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`, `price` FROM `MappingsOfferDTO` WHERE 1;

--
-- INSERT template for table `MappingsOfferDTO`
--
INSERT INTO `MappingsOfferDTO`(`name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`, `price`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MappingsOfferDTO`
--
UPDATE `MappingsOfferDTO` SET `name` = ?, `shopSku` = ?, `category` = ?, `vendor` = ?, `vendorCode` = ?, `description` = ?, `id` = ?, `feedId` = ?, `barcodes` = ?, `urls` = ?, `pictures` = ?, `manufacturer` = ?, `manufacturerCountries` = ?, `minShipment` = ?, `transportUnitSize` = ?, `quantumOfSupply` = ?, `deliveryDurationDays` = ?, `boxCount` = ?, `customsCommodityCodes` = ?, `weightDimensions` = ?, `supplyScheduleDays` = ?, `shelfLifeDays` = ?, `lifeTimeDays` = ?, `guaranteePeriodDays` = ?, `processingState` = ?, `availability` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `certificate` = ?, `price` = ? WHERE 1;

--
-- DELETE template for table `MappingsOfferDTO`
--
DELETE FROM `MappingsOfferDTO` WHERE 0;

