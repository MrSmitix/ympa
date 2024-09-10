--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'MappingsOfferInfoDTO' definition.
--


--
-- SELECT template for table `MappingsOfferInfoDTO`
--
SELECT `name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate` FROM `MappingsOfferInfoDTO` WHERE 1;

--
-- INSERT template for table `MappingsOfferInfoDTO`
--
INSERT INTO `MappingsOfferInfoDTO`(`name`, `shopSku`, `category`, `vendor`, `vendorCode`, `description`, `id`, `feedId`, `barcodes`, `urls`, `pictures`, `manufacturer`, `manufacturerCountries`, `minShipment`, `transportUnitSize`, `quantumOfSupply`, `deliveryDurationDays`, `boxCount`, `customsCommodityCodes`, `weightDimensions`, `supplyScheduleDays`, `shelfLifeDays`, `lifeTimeDays`, `guaranteePeriodDays`, `processingState`, `availability`, `shelfLife`, `lifeTime`, `guaranteePeriod`, `certificate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MappingsOfferInfoDTO`
--
UPDATE `MappingsOfferInfoDTO` SET `name` = ?, `shopSku` = ?, `category` = ?, `vendor` = ?, `vendorCode` = ?, `description` = ?, `id` = ?, `feedId` = ?, `barcodes` = ?, `urls` = ?, `pictures` = ?, `manufacturer` = ?, `manufacturerCountries` = ?, `minShipment` = ?, `transportUnitSize` = ?, `quantumOfSupply` = ?, `deliveryDurationDays` = ?, `boxCount` = ?, `customsCommodityCodes` = ?, `weightDimensions` = ?, `supplyScheduleDays` = ?, `shelfLifeDays` = ?, `lifeTimeDays` = ?, `guaranteePeriodDays` = ?, `processingState` = ?, `availability` = ?, `shelfLife` = ?, `lifeTime` = ?, `guaranteePeriod` = ?, `certificate` = ? WHERE 1;

--
-- DELETE template for table `MappingsOfferInfoDTO`
--
DELETE FROM `MappingsOfferInfoDTO` WHERE 0;

