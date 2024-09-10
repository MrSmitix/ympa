--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferRecommendationsRequest' definition.
--


--
-- SELECT template for table `GetOfferRecommendationsRequest`
--
SELECT `offerIds`, `cofinancePriceFilter`, `recommendedCofinancePriceFilter`, `competitivenessFilter` FROM `GetOfferRecommendationsRequest` WHERE 1;

--
-- INSERT template for table `GetOfferRecommendationsRequest`
--
INSERT INTO `GetOfferRecommendationsRequest`(`offerIds`, `cofinancePriceFilter`, `recommendedCofinancePriceFilter`, `competitivenessFilter`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetOfferRecommendationsRequest`
--
UPDATE `GetOfferRecommendationsRequest` SET `offerIds` = ?, `cofinancePriceFilter` = ?, `recommendedCofinancePriceFilter` = ?, `competitivenessFilter` = ? WHERE 1;

--
-- DELETE template for table `GetOfferRecommendationsRequest`
--
DELETE FROM `GetOfferRecommendationsRequest` WHERE 0;

