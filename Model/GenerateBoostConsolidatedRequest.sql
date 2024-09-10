--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateBoostConsolidatedRequest' definition.
--


--
-- SELECT template for table `GenerateBoostConsolidatedRequest`
--
SELECT `businessId`, `dateFrom`, `dateTo` FROM `GenerateBoostConsolidatedRequest` WHERE 1;

--
-- INSERT template for table `GenerateBoostConsolidatedRequest`
--
INSERT INTO `GenerateBoostConsolidatedRequest`(`businessId`, `dateFrom`, `dateTo`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GenerateBoostConsolidatedRequest`
--
UPDATE `GenerateBoostConsolidatedRequest` SET `businessId` = ?, `dateFrom` = ?, `dateTo` = ? WHERE 1;

--
-- DELETE template for table `GenerateBoostConsolidatedRequest`
--
DELETE FROM `GenerateBoostConsolidatedRequest` WHERE 0;

