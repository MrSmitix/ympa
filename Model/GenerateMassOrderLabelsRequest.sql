--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateMassOrderLabelsRequest' definition.
--


--
-- SELECT template for table `GenerateMassOrderLabelsRequest`
--
SELECT `businessId`, `orderIds` FROM `GenerateMassOrderLabelsRequest` WHERE 1;

--
-- INSERT template for table `GenerateMassOrderLabelsRequest`
--
INSERT INTO `GenerateMassOrderLabelsRequest`(`businessId`, `orderIds`) VALUES (?, ?);

--
-- UPDATE template for table `GenerateMassOrderLabelsRequest`
--
UPDATE `GenerateMassOrderLabelsRequest` SET `businessId` = ?, `orderIds` = ? WHERE 1;

--
-- DELETE template for table `GenerateMassOrderLabelsRequest`
--
DELETE FROM `GenerateMassOrderLabelsRequest` WHERE 0;

