--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferCardDTO' definition.
--


--
-- SELECT template for table `OfferCardDTO`
--
SELECT `offerId`, `mapping`, `parameterValues`, `cardStatus`, `contentRating`, `recommendations`, `errors`, `warnings` FROM `OfferCardDTO` WHERE 1;

--
-- INSERT template for table `OfferCardDTO`
--
INSERT INTO `OfferCardDTO`(`offerId`, `mapping`, `parameterValues`, `cardStatus`, `contentRating`, `recommendations`, `errors`, `warnings`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OfferCardDTO`
--
UPDATE `OfferCardDTO` SET `offerId` = ?, `mapping` = ?, `parameterValues` = ?, `cardStatus` = ?, `contentRating` = ?, `recommendations` = ?, `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `OfferCardDTO`
--
DELETE FROM `OfferCardDTO` WHERE 0;

