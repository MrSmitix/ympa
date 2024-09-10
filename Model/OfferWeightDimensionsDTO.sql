--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferWeightDimensionsDTO' definition.
--


--
-- SELECT template for table `OfferWeightDimensionsDTO`
--
SELECT `length`, `width`, `height`, `weight` FROM `OfferWeightDimensionsDTO` WHERE 1;

--
-- INSERT template for table `OfferWeightDimensionsDTO`
--
INSERT INTO `OfferWeightDimensionsDTO`(`length`, `width`, `height`, `weight`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OfferWeightDimensionsDTO`
--
UPDATE `OfferWeightDimensionsDTO` SET `length` = ?, `width` = ?, `height` = ?, `weight` = ? WHERE 1;

--
-- DELETE template for table `OfferWeightDimensionsDTO`
--
DELETE FROM `OfferWeightDimensionsDTO` WHERE 0;

