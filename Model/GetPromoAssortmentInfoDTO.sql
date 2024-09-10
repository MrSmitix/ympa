--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoAssortmentInfoDTO' definition.
--


--
-- SELECT template for table `GetPromoAssortmentInfoDTO`
--
SELECT `activeOffers`, `potentialOffers`, `processing` FROM `GetPromoAssortmentInfoDTO` WHERE 1;

--
-- INSERT template for table `GetPromoAssortmentInfoDTO`
--
INSERT INTO `GetPromoAssortmentInfoDTO`(`activeOffers`, `potentialOffers`, `processing`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetPromoAssortmentInfoDTO`
--
UPDATE `GetPromoAssortmentInfoDTO` SET `activeOffers` = ?, `potentialOffers` = ?, `processing` = ? WHERE 1;

--
-- DELETE template for table `GetPromoAssortmentInfoDTO`
--
DELETE FROM `GetPromoAssortmentInfoDTO` WHERE 0;

