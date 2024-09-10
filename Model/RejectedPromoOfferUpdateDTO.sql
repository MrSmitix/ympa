--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'RejectedPromoOfferUpdateDTO' definition.
--


--
-- SELECT template for table `RejectedPromoOfferUpdateDTO`
--
SELECT `offerId`, `reason` FROM `RejectedPromoOfferUpdateDTO` WHERE 1;

--
-- INSERT template for table `RejectedPromoOfferUpdateDTO`
--
INSERT INTO `RejectedPromoOfferUpdateDTO`(`offerId`, `reason`) VALUES (?, ?);

--
-- UPDATE template for table `RejectedPromoOfferUpdateDTO`
--
UPDATE `RejectedPromoOfferUpdateDTO` SET `offerId` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `RejectedPromoOfferUpdateDTO`
--
DELETE FROM `RejectedPromoOfferUpdateDTO` WHERE 0;

