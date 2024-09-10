--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteOffersFromArchiveRequest' definition.
--


--
-- SELECT template for table `DeleteOffersFromArchiveRequest`
--
SELECT `offerIds` FROM `DeleteOffersFromArchiveRequest` WHERE 1;

--
-- INSERT template for table `DeleteOffersFromArchiveRequest`
--
INSERT INTO `DeleteOffersFromArchiveRequest`(`offerIds`) VALUES (?);

--
-- UPDATE template for table `DeleteOffersFromArchiveRequest`
--
UPDATE `DeleteOffersFromArchiveRequest` SET `offerIds` = ? WHERE 1;

--
-- DELETE template for table `DeleteOffersFromArchiveRequest`
--
DELETE FROM `DeleteOffersFromArchiveRequest` WHERE 0;

