--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferProcessingStateDTO' definition.
--


--
-- SELECT template for table `OfferProcessingStateDTO`
--
SELECT `status`, `notes` FROM `OfferProcessingStateDTO` WHERE 1;

--
-- INSERT template for table `OfferProcessingStateDTO`
--
INSERT INTO `OfferProcessingStateDTO`(`status`, `notes`) VALUES (?, ?);

--
-- UPDATE template for table `OfferProcessingStateDTO`
--
UPDATE `OfferProcessingStateDTO` SET `status` = ?, `notes` = ? WHERE 1;

--
-- DELETE template for table `OfferProcessingStateDTO`
--
DELETE FROM `OfferProcessingStateDTO` WHERE 0;

