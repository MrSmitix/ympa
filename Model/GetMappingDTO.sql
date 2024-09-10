--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetMappingDTO' definition.
--


--
-- SELECT template for table `GetMappingDTO`
--
SELECT `marketSku`, `marketSkuName`, `marketModelId`, `marketModelName`, `marketCategoryId`, `marketCategoryName` FROM `GetMappingDTO` WHERE 1;

--
-- INSERT template for table `GetMappingDTO`
--
INSERT INTO `GetMappingDTO`(`marketSku`, `marketSkuName`, `marketModelId`, `marketModelName`, `marketCategoryId`, `marketCategoryName`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetMappingDTO`
--
UPDATE `GetMappingDTO` SET `marketSku` = ?, `marketSkuName` = ?, `marketModelId` = ?, `marketModelName` = ?, `marketCategoryId` = ?, `marketCategoryName` = ? WHERE 1;

--
-- DELETE template for table `GetMappingDTO`
--
DELETE FROM `GetMappingDTO` WHERE 0;

