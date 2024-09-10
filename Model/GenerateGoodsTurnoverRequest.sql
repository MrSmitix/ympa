--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GenerateGoodsTurnoverRequest' definition.
--


--
-- SELECT template for table `GenerateGoodsTurnoverRequest`
--
SELECT `campaignId`, `date` FROM `GenerateGoodsTurnoverRequest` WHERE 1;

--
-- INSERT template for table `GenerateGoodsTurnoverRequest`
--
INSERT INTO `GenerateGoodsTurnoverRequest`(`campaignId`, `date`) VALUES (?, ?);

--
-- UPDATE template for table `GenerateGoodsTurnoverRequest`
--
UPDATE `GenerateGoodsTurnoverRequest` SET `campaignId` = ?, `date` = ? WHERE 1;

--
-- DELETE template for table `GenerateGoodsTurnoverRequest`
--
DELETE FROM `GenerateGoodsTurnoverRequest` WHERE 0;

