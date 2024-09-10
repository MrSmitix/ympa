--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBidsRecommendationsRequest' definition.
--


--
-- SELECT template for table `GetBidsRecommendationsRequest`
--
SELECT `skus` FROM `GetBidsRecommendationsRequest` WHERE 1;

--
-- INSERT template for table `GetBidsRecommendationsRequest`
--
INSERT INTO `GetBidsRecommendationsRequest`(`skus`) VALUES (?);

--
-- UPDATE template for table `GetBidsRecommendationsRequest`
--
UPDATE `GetBidsRecommendationsRequest` SET `skus` = ? WHERE 1;

--
-- DELETE template for table `GetBidsRecommendationsRequest`
--
DELETE FROM `GetBidsRecommendationsRequest` WHERE 0;

