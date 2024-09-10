--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePromoOfferDTO' definition.
--


--
-- SELECT template for table `UpdatePromoOfferDTO`
--
SELECT `offerId`, `params` FROM `UpdatePromoOfferDTO` WHERE 1;

--
-- INSERT template for table `UpdatePromoOfferDTO`
--
INSERT INTO `UpdatePromoOfferDTO`(`offerId`, `params`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePromoOfferDTO`
--
UPDATE `UpdatePromoOfferDTO` SET `offerId` = ?, `params` = ? WHERE 1;

--
-- DELETE template for table `UpdatePromoOfferDTO`
--
DELETE FROM `UpdatePromoOfferDTO` WHERE 0;

