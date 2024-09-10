--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetSuggestedOfferMappingsRequest' definition.
--


--
-- SELECT template for table `GetSuggestedOfferMappingsRequest`
--
SELECT `offers` FROM `GetSuggestedOfferMappingsRequest` WHERE 1;

--
-- INSERT template for table `GetSuggestedOfferMappingsRequest`
--
INSERT INTO `GetSuggestedOfferMappingsRequest`(`offers`) VALUES (?);

--
-- UPDATE template for table `GetSuggestedOfferMappingsRequest`
--
UPDATE `GetSuggestedOfferMappingsRequest` SET `offers` = ? WHERE 1;

--
-- DELETE template for table `GetSuggestedOfferMappingsRequest`
--
DELETE FROM `GetSuggestedOfferMappingsRequest` WHERE 0;

