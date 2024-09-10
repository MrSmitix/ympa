--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetSuggestedOfferMappingsResponse' definition.
--


--
-- SELECT template for table `GetSuggestedOfferMappingsResponse`
--
SELECT `status`, `result` FROM `GetSuggestedOfferMappingsResponse` WHERE 1;

--
-- INSERT template for table `GetSuggestedOfferMappingsResponse`
--
INSERT INTO `GetSuggestedOfferMappingsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetSuggestedOfferMappingsResponse`
--
UPDATE `GetSuggestedOfferMappingsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetSuggestedOfferMappingsResponse`
--
DELETE FROM `GetSuggestedOfferMappingsResponse` WHERE 0;

