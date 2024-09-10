--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferMappingEntryDTO' definition.
--


--
-- SELECT template for table `UpdateOfferMappingEntryDTO`
--
SELECT `mapping`, `awaitingModerationMapping`, `rejectedMapping`, `offer` FROM `UpdateOfferMappingEntryDTO` WHERE 1;

--
-- INSERT template for table `UpdateOfferMappingEntryDTO`
--
INSERT INTO `UpdateOfferMappingEntryDTO`(`mapping`, `awaitingModerationMapping`, `rejectedMapping`, `offer`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `UpdateOfferMappingEntryDTO`
--
UPDATE `UpdateOfferMappingEntryDTO` SET `mapping` = ?, `awaitingModerationMapping` = ?, `rejectedMapping` = ?, `offer` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferMappingEntryDTO`
--
DELETE FROM `UpdateOfferMappingEntryDTO` WHERE 0;

