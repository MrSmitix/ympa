--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateGoodsMovementReportRequest' definition.
--


--
-- SELECT template for table `GenerateGoodsMovementReportRequest`
--
SELECT `campaignId`, `dateFrom`, `dateTo`, `shopSku` FROM `GenerateGoodsMovementReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateGoodsMovementReportRequest`
--
INSERT INTO `GenerateGoodsMovementReportRequest`(`campaignId`, `dateFrom`, `dateTo`, `shopSku`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GenerateGoodsMovementReportRequest`
--
UPDATE `GenerateGoodsMovementReportRequest` SET `campaignId` = ?, `dateFrom` = ?, `dateTo` = ?, `shopSku` = ? WHERE 1;

--
-- DELETE template for table `GenerateGoodsMovementReportRequest`
--
DELETE FROM `GenerateGoodsMovementReportRequest` WHERE 0;

