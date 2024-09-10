--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BidRecommendationItemDTO' definition.
--


--
-- SELECT template for table `BidRecommendationItemDTO`
--
SELECT `bid`, `showPercent` FROM `BidRecommendationItemDTO` WHERE 1;

--
-- INSERT template for table `BidRecommendationItemDTO`
--
INSERT INTO `BidRecommendationItemDTO`(`bid`, `showPercent`) VALUES (?, ?);

--
-- UPDATE template for table `BidRecommendationItemDTO`
--
UPDATE `BidRecommendationItemDTO` SET `bid` = ?, `showPercent` = ? WHERE 1;

--
-- DELETE template for table `BidRecommendationItemDTO`
--
DELETE FROM `BidRecommendationItemDTO` WHERE 0;

