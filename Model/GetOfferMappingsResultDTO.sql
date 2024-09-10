--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferMappingsResultDTO' definition.
--


--
-- SELECT template for table `GetOfferMappingsResultDTO`
--
SELECT `paging`, `offerMappings` FROM `GetOfferMappingsResultDTO` WHERE 1;

--
-- INSERT template for table `GetOfferMappingsResultDTO`
--
INSERT INTO `GetOfferMappingsResultDTO`(`paging`, `offerMappings`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferMappingsResultDTO`
--
UPDATE `GetOfferMappingsResultDTO` SET `paging` = ?, `offerMappings` = ? WHERE 1;

--
-- DELETE template for table `GetOfferMappingsResultDTO`
--
DELETE FROM `GetOfferMappingsResultDTO` WHERE 0;

