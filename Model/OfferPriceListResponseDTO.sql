--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferPriceListResponseDTO' definition.
--


--
-- SELECT template for table `OfferPriceListResponseDTO`
--
SELECT `offers`, `paging`, `total` FROM `OfferPriceListResponseDTO` WHERE 1;

--
-- INSERT template for table `OfferPriceListResponseDTO`
--
INSERT INTO `OfferPriceListResponseDTO`(`offers`, `paging`, `total`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferPriceListResponseDTO`
--
UPDATE `OfferPriceListResponseDTO` SET `offers` = ?, `paging` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `OfferPriceListResponseDTO`
--
DELETE FROM `OfferPriceListResponseDTO` WHERE 0;

