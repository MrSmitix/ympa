--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBidsRecommendationsResponse' definition.
--


--
-- SELECT template for table `GetBidsRecommendationsResponse`
--
SELECT `status`, `result` FROM `GetBidsRecommendationsResponse` WHERE 1;

--
-- INSERT template for table `GetBidsRecommendationsResponse`
--
INSERT INTO `GetBidsRecommendationsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetBidsRecommendationsResponse`
--
UPDATE `GetBidsRecommendationsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetBidsRecommendationsResponse`
--
DELETE FROM `GetBidsRecommendationsResponse` WHERE 0;

