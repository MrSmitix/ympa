--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateUnitedOrdersRequest' definition.
--


--
-- SELECT template for table `GenerateUnitedOrdersRequest`
--
SELECT `businessId`, `dateFrom`, `dateTo`, `campaignIds`, `promoId` FROM `GenerateUnitedOrdersRequest` WHERE 1;

--
-- INSERT template for table `GenerateUnitedOrdersRequest`
--
INSERT INTO `GenerateUnitedOrdersRequest`(`businessId`, `dateFrom`, `dateTo`, `campaignIds`, `promoId`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerateUnitedOrdersRequest`
--
UPDATE `GenerateUnitedOrdersRequest` SET `businessId` = ?, `dateFrom` = ?, `dateTo` = ?, `campaignIds` = ?, `promoId` = ? WHERE 1;

--
-- DELETE template for table `GenerateUnitedOrdersRequest`
--
DELETE FROM `GenerateUnitedOrdersRequest` WHERE 0;

