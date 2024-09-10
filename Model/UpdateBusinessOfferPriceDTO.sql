--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateBusinessOfferPriceDTO' definition.
--


--
-- SELECT template for table `UpdateBusinessOfferPriceDTO`
--
SELECT `offerId`, `price` FROM `UpdateBusinessOfferPriceDTO` WHERE 1;

--
-- INSERT template for table `UpdateBusinessOfferPriceDTO`
--
INSERT INTO `UpdateBusinessOfferPriceDTO`(`offerId`, `price`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateBusinessOfferPriceDTO`
--
UPDATE `UpdateBusinessOfferPriceDTO` SET `offerId` = ?, `price` = ? WHERE 1;

--
-- DELETE template for table `UpdateBusinessOfferPriceDTO`
--
DELETE FROM `UpdateBusinessOfferPriceDTO` WHERE 0;

