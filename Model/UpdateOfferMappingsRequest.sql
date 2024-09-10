--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferMappingsRequest' definition.
--


--
-- SELECT template for table `UpdateOfferMappingsRequest`
--
SELECT `offerMappings`, `onlyPartnerMediaContent` FROM `UpdateOfferMappingsRequest` WHERE 1;

--
-- INSERT template for table `UpdateOfferMappingsRequest`
--
INSERT INTO `UpdateOfferMappingsRequest`(`offerMappings`, `onlyPartnerMediaContent`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOfferMappingsRequest`
--
UPDATE `UpdateOfferMappingsRequest` SET `offerMappings` = ?, `onlyPartnerMediaContent` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferMappingsRequest`
--
DELETE FROM `UpdateOfferMappingsRequest` WHERE 0;

