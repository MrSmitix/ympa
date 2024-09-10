--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'QuarantineOfferDTO' definition.
--


--
-- SELECT template for table `QuarantineOfferDTO`
--
SELECT `offerId`, `currentPrice`, `lastValidPrice`, `verdicts` FROM `QuarantineOfferDTO` WHERE 1;

--
-- INSERT template for table `QuarantineOfferDTO`
--
INSERT INTO `QuarantineOfferDTO`(`offerId`, `currentPrice`, `lastValidPrice`, `verdicts`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `QuarantineOfferDTO`
--
UPDATE `QuarantineOfferDTO` SET `offerId` = ?, `currentPrice` = ?, `lastValidPrice` = ?, `verdicts` = ? WHERE 1;

--
-- DELETE template for table `QuarantineOfferDTO`
--
DELETE FROM `QuarantineOfferDTO` WHERE 0;

