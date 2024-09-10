--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferPriceDTO' definition.
--


--
-- SELECT template for table `OfferPriceDTO`
--
SELECT `offerId`, `price` FROM `OfferPriceDTO` WHERE 1;

--
-- INSERT template for table `OfferPriceDTO`
--
INSERT INTO `OfferPriceDTO`(`offerId`, `price`) VALUES (?, ?);

--
-- UPDATE template for table `OfferPriceDTO`
--
UPDATE `OfferPriceDTO` SET `offerId` = ?, `price` = ? WHERE 1;

--
-- DELETE template for table `OfferPriceDTO`
--
DELETE FROM `OfferPriceDTO` WHERE 0;

