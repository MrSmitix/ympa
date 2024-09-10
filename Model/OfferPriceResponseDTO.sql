--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferPriceResponseDTO' definition.
--


--
-- SELECT template for table `OfferPriceResponseDTO`
--
SELECT `id`, `price`, `marketSku`, `updatedAt` FROM `OfferPriceResponseDTO` WHERE 1;

--
-- INSERT template for table `OfferPriceResponseDTO`
--
INSERT INTO `OfferPriceResponseDTO`(`id`, `price`, `marketSku`, `updatedAt`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OfferPriceResponseDTO`
--
UPDATE `OfferPriceResponseDTO` SET `id` = ?, `price` = ?, `marketSku` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `OfferPriceResponseDTO`
--
DELETE FROM `OfferPriceResponseDTO` WHERE 0;

