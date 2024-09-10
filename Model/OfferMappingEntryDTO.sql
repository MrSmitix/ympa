--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferMappingEntryDTO' definition.
--


--
-- SELECT template for table `OfferMappingEntryDTO`
--
SELECT `mapping`, `awaitingModerationMapping`, `rejectedMapping`, `offer` FROM `OfferMappingEntryDTO` WHERE 1;

--
-- INSERT template for table `OfferMappingEntryDTO`
--
INSERT INTO `OfferMappingEntryDTO`(`mapping`, `awaitingModerationMapping`, `rejectedMapping`, `offer`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OfferMappingEntryDTO`
--
UPDATE `OfferMappingEntryDTO` SET `mapping` = ?, `awaitingModerationMapping` = ?, `rejectedMapping` = ?, `offer` = ? WHERE 1;

--
-- DELETE template for table `OfferMappingEntryDTO`
--
DELETE FROM `OfferMappingEntryDTO` WHERE 0;

