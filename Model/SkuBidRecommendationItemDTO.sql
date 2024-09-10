--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SkuBidRecommendationItemDTO' definition.
--


--
-- SELECT template for table `SkuBidRecommendationItemDTO`
--
SELECT `sku`, `bid`, `bidRecommendations`, `priceRecommendations` FROM `SkuBidRecommendationItemDTO` WHERE 1;

--
-- INSERT template for table `SkuBidRecommendationItemDTO`
--
INSERT INTO `SkuBidRecommendationItemDTO`(`sku`, `bid`, `bidRecommendations`, `priceRecommendations`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SkuBidRecommendationItemDTO`
--
UPDATE `SkuBidRecommendationItemDTO` SET `sku` = ?, `bid` = ?, `bidRecommendations` = ?, `priceRecommendations` = ? WHERE 1;

--
-- DELETE template for table `SkuBidRecommendationItemDTO`
--
DELETE FROM `SkuBidRecommendationItemDTO` WHERE 0;

