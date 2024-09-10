--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQualityRatingResponse' definition.
--


--
-- SELECT template for table `GetQualityRatingResponse`
--
SELECT `status`, `result` FROM `GetQualityRatingResponse` WHERE 1;

--
-- INSERT template for table `GetQualityRatingResponse`
--
INSERT INTO `GetQualityRatingResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetQualityRatingResponse`
--
UPDATE `GetQualityRatingResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetQualityRatingResponse`
--
DELETE FROM `GetQualityRatingResponse` WHERE 0;

