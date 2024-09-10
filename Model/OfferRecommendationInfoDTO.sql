--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferRecommendationInfoDTO' definition.
--


--
-- SELECT template for table `OfferRecommendationInfoDTO`
--
SELECT `offerId`, `recommendedCofinancePrice`, `competitivenessThresholds` FROM `OfferRecommendationInfoDTO` WHERE 1;

--
-- INSERT template for table `OfferRecommendationInfoDTO`
--
INSERT INTO `OfferRecommendationInfoDTO`(`offerId`, `recommendedCofinancePrice`, `competitivenessThresholds`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferRecommendationInfoDTO`
--
UPDATE `OfferRecommendationInfoDTO` SET `offerId` = ?, `recommendedCofinancePrice` = ?, `competitivenessThresholds` = ? WHERE 1;

--
-- DELETE template for table `OfferRecommendationInfoDTO`
--
DELETE FROM `OfferRecommendationInfoDTO` WHERE 0;

