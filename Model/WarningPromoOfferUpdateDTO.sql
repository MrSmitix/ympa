--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarningPromoOfferUpdateDTO' definition.
--


--
-- SELECT template for table `WarningPromoOfferUpdateDTO`
--
SELECT `offerId`, `warnings` FROM `WarningPromoOfferUpdateDTO` WHERE 1;

--
-- INSERT template for table `WarningPromoOfferUpdateDTO`
--
INSERT INTO `WarningPromoOfferUpdateDTO`(`offerId`, `warnings`) VALUES (?, ?);

--
-- UPDATE template for table `WarningPromoOfferUpdateDTO`
--
UPDATE `WarningPromoOfferUpdateDTO` SET `offerId` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `WarningPromoOfferUpdateDTO`
--
DELETE FROM `WarningPromoOfferUpdateDTO` WHERE 0;

