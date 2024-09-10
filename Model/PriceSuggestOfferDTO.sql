--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceSuggestOfferDTO' definition.
--


--
-- SELECT template for table `PriceSuggestOfferDTO`
--
SELECT `marketSku`, `offerId`, `priceSuggestion` FROM `PriceSuggestOfferDTO` WHERE 1;

--
-- INSERT template for table `PriceSuggestOfferDTO`
--
INSERT INTO `PriceSuggestOfferDTO`(`marketSku`, `offerId`, `priceSuggestion`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PriceSuggestOfferDTO`
--
UPDATE `PriceSuggestOfferDTO` SET `marketSku` = ?, `offerId` = ?, `priceSuggestion` = ? WHERE 1;

--
-- DELETE template for table `PriceSuggestOfferDTO`
--
DELETE FROM `PriceSuggestOfferDTO` WHERE 0;

