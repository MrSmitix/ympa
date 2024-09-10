--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferMappingsResponse' definition.
--


--
-- SELECT template for table `UpdateOfferMappingsResponse`
--
SELECT `status`, `results` FROM `UpdateOfferMappingsResponse` WHERE 1;

--
-- INSERT template for table `UpdateOfferMappingsResponse`
--
INSERT INTO `UpdateOfferMappingsResponse`(`status`, `results`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOfferMappingsResponse`
--
UPDATE `UpdateOfferMappingsResponse` SET `status` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferMappingsResponse`
--
DELETE FROM `UpdateOfferMappingsResponse` WHERE 0;

