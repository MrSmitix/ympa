--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQualityRatingDetailsResponse' definition.
--


--
-- SELECT template for table `GetQualityRatingDetailsResponse`
--
SELECT `status`, `result` FROM `GetQualityRatingDetailsResponse` WHERE 1;

--
-- INSERT template for table `GetQualityRatingDetailsResponse`
--
INSERT INTO `GetQualityRatingDetailsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetQualityRatingDetailsResponse`
--
UPDATE `GetQualityRatingDetailsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetQualityRatingDetailsResponse`
--
DELETE FROM `GetQualityRatingDetailsResponse` WHERE 0;

