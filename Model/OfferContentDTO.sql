--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferContentDTO' definition.
--


--
-- SELECT template for table `OfferContentDTO`
--
SELECT `offerId`, `categoryId`, `parameterValues` FROM `OfferContentDTO` WHERE 1;

--
-- INSERT template for table `OfferContentDTO`
--
INSERT INTO `OfferContentDTO`(`offerId`, `categoryId`, `parameterValues`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferContentDTO`
--
UPDATE `OfferContentDTO` SET `offerId` = ?, `categoryId` = ?, `parameterValues` = ? WHERE 1;

--
-- DELETE template for table `OfferContentDTO`
--
DELETE FROM `OfferContentDTO` WHERE 0;

