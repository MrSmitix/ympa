--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferCardRecommendationDTO' definition.
--


--
-- SELECT template for table `OfferCardRecommendationDTO`
--
SELECT `type`, `percent` FROM `OfferCardRecommendationDTO` WHERE 1;

--
-- INSERT template for table `OfferCardRecommendationDTO`
--
INSERT INTO `OfferCardRecommendationDTO`(`type`, `percent`) VALUES (?, ?);

--
-- UPDATE template for table `OfferCardRecommendationDTO`
--
UPDATE `OfferCardRecommendationDTO` SET `type` = ?, `percent` = ? WHERE 1;

--
-- DELETE template for table `OfferCardRecommendationDTO`
--
DELETE FROM `OfferCardRecommendationDTO` WHERE 0;

