--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferRecommendationsResultDTO' definition.
--


--
-- SELECT template for table `OfferRecommendationsResultDTO`
--
SELECT `paging`, `offerRecommendations` FROM `OfferRecommendationsResultDTO` WHERE 1;

--
-- INSERT template for table `OfferRecommendationsResultDTO`
--
INSERT INTO `OfferRecommendationsResultDTO`(`paging`, `offerRecommendations`) VALUES (?, ?);

--
-- UPDATE template for table `OfferRecommendationsResultDTO`
--
UPDATE `OfferRecommendationsResultDTO` SET `paging` = ?, `offerRecommendations` = ? WHERE 1;

--
-- DELETE template for table `OfferRecommendationsResultDTO`
--
DELETE FROM `OfferRecommendationsResultDTO` WHERE 0;

