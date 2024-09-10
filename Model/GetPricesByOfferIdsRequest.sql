--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPricesByOfferIdsRequest' definition.
--


--
-- SELECT template for table `GetPricesByOfferIdsRequest`
--
SELECT `offerIds` FROM `GetPricesByOfferIdsRequest` WHERE 1;

--
-- INSERT template for table `GetPricesByOfferIdsRequest`
--
INSERT INTO `GetPricesByOfferIdsRequest`(`offerIds`) VALUES (?);

--
-- UPDATE template for table `GetPricesByOfferIdsRequest`
--
UPDATE `GetPricesByOfferIdsRequest` SET `offerIds` = ? WHERE 1;

--
-- DELETE template for table `GetPricesByOfferIdsRequest`
--
DELETE FROM `GetPricesByOfferIdsRequest` WHERE 0;

