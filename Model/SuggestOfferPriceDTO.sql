--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestOfferPriceDTO' definition.
--


--
-- SELECT template for table `SuggestOfferPriceDTO`
--
SELECT `offerId`, `marketSku` FROM `SuggestOfferPriceDTO` WHERE 1;

--
-- INSERT template for table `SuggestOfferPriceDTO`
--
INSERT INTO `SuggestOfferPriceDTO`(`offerId`, `marketSku`) VALUES (?, ?);

--
-- UPDATE template for table `SuggestOfferPriceDTO`
--
UPDATE `SuggestOfferPriceDTO` SET `offerId` = ?, `marketSku` = ? WHERE 1;

--
-- DELETE template for table `SuggestOfferPriceDTO`
--
DELETE FROM `SuggestOfferPriceDTO` WHERE 0;

