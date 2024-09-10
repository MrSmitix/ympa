--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceRecommendationItemDTO' definition.
--


--
-- SELECT template for table `PriceRecommendationItemDTO`
--
SELECT `campaignId`, `price` FROM `PriceRecommendationItemDTO` WHERE 1;

--
-- INSERT template for table `PriceRecommendationItemDTO`
--
INSERT INTO `PriceRecommendationItemDTO`(`campaignId`, `price`) VALUES (?, ?);

--
-- UPDATE template for table `PriceRecommendationItemDTO`
--
UPDATE `PriceRecommendationItemDTO` SET `campaignId` = ?, `price` = ? WHERE 1;

--
-- DELETE template for table `PriceRecommendationItemDTO`
--
DELETE FROM `PriceRecommendationItemDTO` WHERE 0;

