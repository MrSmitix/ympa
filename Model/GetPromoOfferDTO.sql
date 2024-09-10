--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromoOfferDTO' definition.
--


--
-- SELECT template for table `GetPromoOfferDTO`
--
SELECT `offerId`, `status`, `params`, `autoParticipatingDetails` FROM `GetPromoOfferDTO` WHERE 1;

--
-- INSERT template for table `GetPromoOfferDTO`
--
INSERT INTO `GetPromoOfferDTO`(`offerId`, `status`, `params`, `autoParticipatingDetails`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetPromoOfferDTO`
--
UPDATE `GetPromoOfferDTO` SET `offerId` = ?, `status` = ?, `params` = ?, `autoParticipatingDetails` = ? WHERE 1;

--
-- DELETE template for table `GetPromoOfferDTO`
--
DELETE FROM `GetPromoOfferDTO` WHERE 0;

