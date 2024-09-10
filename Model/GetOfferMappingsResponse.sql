--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferMappingsResponse' definition.
--


--
-- SELECT template for table `GetOfferMappingsResponse`
--
SELECT `status`, `result` FROM `GetOfferMappingsResponse` WHERE 1;

--
-- INSERT template for table `GetOfferMappingsResponse`
--
INSERT INTO `GetOfferMappingsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferMappingsResponse`
--
UPDATE `GetOfferMappingsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOfferMappingsResponse`
--
DELETE FROM `GetOfferMappingsResponse` WHERE 0;

