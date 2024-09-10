--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateStocksOnWarehousesReportRequest' definition.
--


--
-- SELECT template for table `GenerateStocksOnWarehousesReportRequest`
--
SELECT `campaignId`, `warehouseIds`, `reportDate`, `categoryIds`, `hasStocks` FROM `GenerateStocksOnWarehousesReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateStocksOnWarehousesReportRequest`
--
INSERT INTO `GenerateStocksOnWarehousesReportRequest`(`campaignId`, `warehouseIds`, `reportDate`, `categoryIds`, `hasStocks`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerateStocksOnWarehousesReportRequest`
--
UPDATE `GenerateStocksOnWarehousesReportRequest` SET `campaignId` = ?, `warehouseIds` = ?, `reportDate` = ?, `categoryIds` = ?, `hasStocks` = ? WHERE 1;

--
-- DELETE template for table `GenerateStocksOnWarehousesReportRequest`
--
DELETE FROM `GenerateStocksOnWarehousesReportRequest` WHERE 0;

