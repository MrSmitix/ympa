--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferPriceByOfferIdsResponseDTO' definition.
--


--
-- SELECT template for table `OfferPriceByOfferIdsResponseDTO`
--
SELECT `offerId`, `price`, `updatedAt` FROM `OfferPriceByOfferIdsResponseDTO` WHERE 1;

--
-- INSERT template for table `OfferPriceByOfferIdsResponseDTO`
--
INSERT INTO `OfferPriceByOfferIdsResponseDTO`(`offerId`, `price`, `updatedAt`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferPriceByOfferIdsResponseDTO`
--
UPDATE `OfferPriceByOfferIdsResponseDTO` SET `offerId` = ?, `price` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `OfferPriceByOfferIdsResponseDTO`
--
DELETE FROM `OfferPriceByOfferIdsResponseDTO` WHERE 0;

