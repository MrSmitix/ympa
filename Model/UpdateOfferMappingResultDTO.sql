--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferMappingResultDTO' definition.
--


--
-- SELECT template for table `UpdateOfferMappingResultDTO`
--
SELECT `offerId`, `errors`, `warnings` FROM `UpdateOfferMappingResultDTO` WHERE 1;

--
-- INSERT template for table `UpdateOfferMappingResultDTO`
--
INSERT INTO `UpdateOfferMappingResultDTO`(`offerId`, `errors`, `warnings`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateOfferMappingResultDTO`
--
UPDATE `UpdateOfferMappingResultDTO` SET `offerId` = ?, `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferMappingResultDTO`
--
DELETE FROM `UpdateOfferMappingResultDTO` WHERE 0;

