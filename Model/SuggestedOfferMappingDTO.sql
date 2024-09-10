--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestedOfferMappingDTO' definition.
--


--
-- SELECT template for table `SuggestedOfferMappingDTO`
--
SELECT `offer`, `mapping` FROM `SuggestedOfferMappingDTO` WHERE 1;

--
-- INSERT template for table `SuggestedOfferMappingDTO`
--
INSERT INTO `SuggestedOfferMappingDTO`(`offer`, `mapping`) VALUES (?, ?);

--
-- UPDATE template for table `SuggestedOfferMappingDTO`
--
UPDATE `SuggestedOfferMappingDTO` SET `offer` = ?, `mapping` = ? WHERE 1;

--
-- DELETE template for table `SuggestedOfferMappingDTO`
--
DELETE FROM `SuggestedOfferMappingDTO` WHERE 0;

