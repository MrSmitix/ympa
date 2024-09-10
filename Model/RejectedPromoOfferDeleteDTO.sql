--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'RejectedPromoOfferDeleteDTO' definition.
--


--
-- SELECT template for table `RejectedPromoOfferDeleteDTO`
--
SELECT `offerId`, `reason` FROM `RejectedPromoOfferDeleteDTO` WHERE 1;

--
-- INSERT template for table `RejectedPromoOfferDeleteDTO`
--
INSERT INTO `RejectedPromoOfferDeleteDTO`(`offerId`, `reason`) VALUES (?, ?);

--
-- UPDATE template for table `RejectedPromoOfferDeleteDTO`
--
UPDATE `RejectedPromoOfferDeleteDTO` SET `offerId` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `RejectedPromoOfferDeleteDTO`
--
DELETE FROM `RejectedPromoOfferDeleteDTO` WHERE 0;

