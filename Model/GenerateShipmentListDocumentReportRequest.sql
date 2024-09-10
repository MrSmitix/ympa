--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateShipmentListDocumentReportRequest' definition.
--


--
-- SELECT template for table `GenerateShipmentListDocumentReportRequest`
--
SELECT `campaignId`, `shipmentId`, `orderIds` FROM `GenerateShipmentListDocumentReportRequest` WHERE 1;

--
-- INSERT template for table `GenerateShipmentListDocumentReportRequest`
--
INSERT INTO `GenerateShipmentListDocumentReportRequest`(`campaignId`, `shipmentId`, `orderIds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GenerateShipmentListDocumentReportRequest`
--
UPDATE `GenerateShipmentListDocumentReportRequest` SET `campaignId` = ?, `shipmentId` = ?, `orderIds` = ? WHERE 1;

--
-- DELETE template for table `GenerateShipmentListDocumentReportRequest`
--
DELETE FROM `GenerateShipmentListDocumentReportRequest` WHERE 0;

