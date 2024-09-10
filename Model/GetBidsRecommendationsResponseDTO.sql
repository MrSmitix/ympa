--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBidsRecommendationsResponseDTO' definition.
--


--
-- SELECT template for table `GetBidsRecommendationsResponseDTO`
--
SELECT `recommendations` FROM `GetBidsRecommendationsResponseDTO` WHERE 1;

--
-- INSERT template for table `GetBidsRecommendationsResponseDTO`
--
INSERT INTO `GetBidsRecommendationsResponseDTO`(`recommendations`) VALUES (?);

--
-- UPDATE template for table `GetBidsRecommendationsResponseDTO`
--
UPDATE `GetBidsRecommendationsResponseDTO` SET `recommendations` = ? WHERE 1;

--
-- DELETE template for table `GetBidsRecommendationsResponseDTO`
--
DELETE FROM `GetBidsRecommendationsResponseDTO` WHERE 0;

