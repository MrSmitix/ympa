--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferMappingEntriesDTO' definition.
--


--
-- SELECT template for table `OfferMappingEntriesDTO`
--
SELECT `paging`, `offerMappingEntries` FROM `OfferMappingEntriesDTO` WHERE 1;

--
-- INSERT template for table `OfferMappingEntriesDTO`
--
INSERT INTO `OfferMappingEntriesDTO`(`paging`, `offerMappingEntries`) VALUES (?, ?);

--
-- UPDATE template for table `OfferMappingEntriesDTO`
--
UPDATE `OfferMappingEntriesDTO` SET `paging` = ?, `offerMappingEntries` = ? WHERE 1;

--
-- DELETE template for table `OfferMappingEntriesDTO`
--
DELETE FROM `OfferMappingEntriesDTO` WHERE 0;

