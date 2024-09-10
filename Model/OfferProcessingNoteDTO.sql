--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferProcessingNoteDTO' definition.
--


--
-- SELECT template for table `OfferProcessingNoteDTO`
--
SELECT `type`, `payload` FROM `OfferProcessingNoteDTO` WHERE 1;

--
-- INSERT template for table `OfferProcessingNoteDTO`
--
INSERT INTO `OfferProcessingNoteDTO`(`type`, `payload`) VALUES (?, ?);

--
-- UPDATE template for table `OfferProcessingNoteDTO`
--
UPDATE `OfferProcessingNoteDTO` SET `type` = ?, `payload` = ? WHERE 1;

--
-- DELETE template for table `OfferProcessingNoteDTO`
--
DELETE FROM `OfferProcessingNoteDTO` WHERE 0;

