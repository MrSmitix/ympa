--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferConditionDTO' definition.
--


--
-- SELECT template for table `OfferConditionDTO`
--
SELECT `type`, `quality`, `reason` FROM `OfferConditionDTO` WHERE 1;

--
-- INSERT template for table `OfferConditionDTO`
--
INSERT INTO `OfferConditionDTO`(`type`, `quality`, `reason`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferConditionDTO`
--
UPDATE `OfferConditionDTO` SET `type` = ?, `quality` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `OfferConditionDTO`
--
DELETE FROM `OfferConditionDTO` WHERE 0;

