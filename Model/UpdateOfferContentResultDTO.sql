--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferContentResultDTO' definition.
--


--
-- SELECT template for table `UpdateOfferContentResultDTO`
--
SELECT `offerId`, `errors`, `warnings` FROM `UpdateOfferContentResultDTO` WHERE 1;

--
-- INSERT template for table `UpdateOfferContentResultDTO`
--
INSERT INTO `UpdateOfferContentResultDTO`(`offerId`, `errors`, `warnings`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateOfferContentResultDTO`
--
UPDATE `UpdateOfferContentResultDTO` SET `offerId` = ?, `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferContentResultDTO`
--
DELETE FROM `UpdateOfferContentResultDTO` WHERE 0;

