--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetSuggestedOfferMappingEntriesResponse' definition.
--


--
-- SELECT template for table `GetSuggestedOfferMappingEntriesResponse`
--
SELECT `status`, `result` FROM `GetSuggestedOfferMappingEntriesResponse` WHERE 1;

--
-- INSERT template for table `GetSuggestedOfferMappingEntriesResponse`
--
INSERT INTO `GetSuggestedOfferMappingEntriesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetSuggestedOfferMappingEntriesResponse`
--
UPDATE `GetSuggestedOfferMappingEntriesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetSuggestedOfferMappingEntriesResponse`
--
DELETE FROM `GetSuggestedOfferMappingEntriesResponse` WHERE 0;

