--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQualityRatingRequest' definition.
--


--
-- SELECT template for table `GetQualityRatingRequest`
--
SELECT `dateFrom`, `dateTo`, `campaignIds` FROM `GetQualityRatingRequest` WHERE 1;

--
-- INSERT template for table `GetQualityRatingRequest`
--
INSERT INTO `GetQualityRatingRequest`(`dateFrom`, `dateTo`, `campaignIds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetQualityRatingRequest`
--
UPDATE `GetQualityRatingRequest` SET `dateFrom` = ?, `dateTo` = ?, `campaignIds` = ? WHERE 1;

--
-- DELETE template for table `GetQualityRatingRequest`
--
DELETE FROM `GetQualityRatingRequest` WHERE 0;

