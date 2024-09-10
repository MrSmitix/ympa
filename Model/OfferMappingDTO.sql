--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferMappingDTO' definition.
--


--
-- SELECT template for table `OfferMappingDTO`
--
SELECT `marketSku`, `modelId`, `categoryId` FROM `OfferMappingDTO` WHERE 1;

--
-- INSERT template for table `OfferMappingDTO`
--
INSERT INTO `OfferMappingDTO`(`marketSku`, `modelId`, `categoryId`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferMappingDTO`
--
UPDATE `OfferMappingDTO` SET `marketSku` = ?, `modelId` = ?, `categoryId` = ? WHERE 1;

--
-- DELETE template for table `OfferMappingDTO`
--
DELETE FROM `OfferMappingDTO` WHERE 0;

