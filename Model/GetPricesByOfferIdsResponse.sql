--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPricesByOfferIdsResponse' definition.
--


--
-- SELECT template for table `GetPricesByOfferIdsResponse`
--
SELECT `status`, `result` FROM `GetPricesByOfferIdsResponse` WHERE 1;

--
-- INSERT template for table `GetPricesByOfferIdsResponse`
--
INSERT INTO `GetPricesByOfferIdsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetPricesByOfferIdsResponse`
--
UPDATE `GetPricesByOfferIdsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetPricesByOfferIdsResponse`
--
DELETE FROM `GetPricesByOfferIdsResponse` WHERE 0;

