--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferRecommendationDTO' definition.
--


--
-- SELECT template for table `OfferRecommendationDTO`
--
SELECT `offer`, `recommendation` FROM `OfferRecommendationDTO` WHERE 1;

--
-- INSERT template for table `OfferRecommendationDTO`
--
INSERT INTO `OfferRecommendationDTO`(`offer`, `recommendation`) VALUES (?, ?);

--
-- UPDATE template for table `OfferRecommendationDTO`
--
UPDATE `OfferRecommendationDTO` SET `offer` = ?, `recommendation` = ? WHERE 1;

--
-- DELETE template for table `OfferRecommendationDTO`
--
DELETE FROM `OfferRecommendationDTO` WHERE 0;

