--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateMappingsOfferDTO' definition.
--


--
-- SELECT template for table `UpdateMappingsOfferDTO`
--
SELECT `name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate` FROM `UpdateMappingsOfferDTO` WHERE 1;

--
-- INSERT template for table `UpdateMappingsOfferDTO`
--
INSERT INTO `UpdateMappingsOfferDTO`(`name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UpdateMappingsOfferDTO`
--
UPDATE `UpdateMappingsOfferDTO` SET `name` = ?, `shopSku` = ?, `category` = ?, `vendor` = ?, `vendorCode` = ?, `description` = ?, `id` = ?, `feedId` = ?, `barcodes` = ?, `urls` = ?, `pictures` = ?, `manufacturer` = ?, `manufacturerCountries` = ?, `minShipment` = ?, `transportUnitSize` = ?, `quantumOfSupply` = ?, `deliveryDurationDays` = ?, `boxCount` = ?, `customsCommodityCodes` = ?, `weightDimensions` = ?, `supplyScheduleDays` = ?, `shelfLifeDays` = ?, `lifeTimeDays` = ?, `guaranteePeriodDays` = ?, `processingState` = ?, `availability` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `certificate` = ? WHERE 1;

--
-- DELETE template for table `UpdateMappingsOfferDTO`
--
DELETE FROM `UpdateMappingsOfferDTO` WHERE 0;

