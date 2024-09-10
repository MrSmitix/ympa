--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferPriceByOfferIdsListResponseDTO' definition.
--


--
-- SELECT template for table `OfferPriceByOfferIdsListResponseDTO`
--
SELECT `offers`, `paging` FROM `OfferPriceByOfferIdsListResponseDTO` WHERE 1;

--
-- INSERT template for table `OfferPriceByOfferIdsListResponseDTO`
--
INSERT INTO `OfferPriceByOfferIdsListResponseDTO`(`offers`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `OfferPriceByOfferIdsListResponseDTO`
--
UPDATE `OfferPriceByOfferIdsListResponseDTO` SET `offers` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `OfferPriceByOfferIdsListResponseDTO`
--
DELETE FROM `OfferPriceByOfferIdsListResponseDTO` WHERE 0;

