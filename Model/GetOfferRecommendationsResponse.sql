--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferRecommendationsResponse' definition.
--


--
-- SELECT template for table `GetOfferRecommendationsResponse`
--
SELECT `status`, `result` FROM `GetOfferRecommendationsResponse` WHERE 1;

--
-- INSERT template for table `GetOfferRecommendationsResponse`
--
INSERT INTO `GetOfferRecommendationsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferRecommendationsResponse`
--
UPDATE `GetOfferRecommendationsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOfferRecommendationsResponse`
--
DELETE FROM `GetOfferRecommendationsResponse` WHERE 0;

