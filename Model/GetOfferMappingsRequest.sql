--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferMappingsRequest' definition.
--


--
-- SELECT template for table `GetOfferMappingsRequest`
--
SELECT `offerIds`, `cardStatuses`, `categoryIds`, `vendorNames`, `tags`, `archived` FROM `GetOfferMappingsRequest` WHERE 1;

--
-- INSERT template for table `GetOfferMappingsRequest`
--
INSERT INTO `GetOfferMappingsRequest`(`offerIds`, `cardStatuses`, `categoryIds`, `vendorNames`, `tags`, `archived`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetOfferMappingsRequest`
--
UPDATE `GetOfferMappingsRequest` SET `offerIds` = ?, `cardStatuses` = ?, `categoryIds` = ?, `vendorNames` = ?, `tags` = ?, `archived` = ? WHERE 1;

--
-- DELETE template for table `GetOfferMappingsRequest`
--
DELETE FROM `GetOfferMappingsRequest` WHERE 0;

