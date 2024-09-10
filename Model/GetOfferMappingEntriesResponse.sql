--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferMappingEntriesResponse' definition.
--


--
-- SELECT template for table `GetOfferMappingEntriesResponse`
--
SELECT `status`, `result` FROM `GetOfferMappingEntriesResponse` WHERE 1;

--
-- INSERT template for table `GetOfferMappingEntriesResponse`
--
INSERT INTO `GetOfferMappingEntriesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferMappingEntriesResponse`
--
UPDATE `GetOfferMappingEntriesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOfferMappingEntriesResponse`
--
DELETE FROM `GetOfferMappingEntriesResponse` WHERE 0;

