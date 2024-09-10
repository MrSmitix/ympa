--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferForRecommendationDTO' definition.
--


--
-- SELECT template for table `OfferForRecommendationDTO`
--
SELECT `offerId`, `price`, `cofinancePrice`, `competitiveness`, `shows` FROM `OfferForRecommendationDTO` WHERE 1;

--
-- INSERT template for table `OfferForRecommendationDTO`
--
INSERT INTO `OfferForRecommendationDTO`(`offerId`, `price`, `cofinancePrice`, `competitiveness`, `shows`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OfferForRecommendationDTO`
--
UPDATE `OfferForRecommendationDTO` SET `offerId` = ?, `price` = ?, `cofinancePrice` = ?, `competitiveness` = ?, `shows` = ? WHERE 1;

--
-- DELETE template for table `OfferForRecommendationDTO`
--
DELETE FROM `OfferForRecommendationDTO` WHERE 0;

