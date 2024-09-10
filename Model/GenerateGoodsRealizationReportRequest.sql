--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateGoodsRealizationReportRequest' definition.
--


--
-- SELECT template for table `GenerateGoodsRealizationReportRequest`
--
SELECT `campaignId`, `year`, `month` FROM `GenerateGoodsRealizationReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateGoodsRealizationReportRequest`
--
INSERT INTO `GenerateGoodsRealizationReportRequest`(`campaignId`, `year`, `month`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GenerateGoodsRealizationReportRequest`
--
UPDATE `GenerateGoodsRealizationReportRequest` SET `campaignId` = ?, `year` = ?, `month` = ? WHERE 1;

--
-- DELETE template for table `GenerateGoodsRealizationReportRequest`
--
DELETE FROM `GenerateGoodsRealizationReportRequest` WHERE 0;

