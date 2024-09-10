--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoOffersResultDTO' definition.
--


--
-- SELECT template for table `GetPromoOffersResultDTO`
--
SELECT `offers`, `paging` FROM `GetPromoOffersResultDTO` WHERE 1;

--
-- INSERT template for table `GetPromoOffersResultDTO`
--
INSERT INTO `GetPromoOffersResultDTO`(`offers`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromoOffersResultDTO`
--
UPDATE `GetPromoOffersResultDTO` SET `offers` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GetPromoOffersResultDTO`
--
DELETE FROM `GetPromoOffersResultDTO` WHERE 0;

