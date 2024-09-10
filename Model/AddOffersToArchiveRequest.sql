--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AddOffersToArchiveRequest' definition.
--


--
-- SELECT template for table `AddOffersToArchiveRequest`
--
SELECT `offerIds` FROM `AddOffersToArchiveRequest` WHERE 1;

--
-- INSERT template for table `AddOffersToArchiveRequest`
--
INSERT INTO `AddOffersToArchiveRequest`(`offerIds`) VALUES (?);

--
-- UPDATE template for table `AddOffersToArchiveRequest`
--
UPDATE `AddOffersToArchiveRequest` SET `offerIds` = ? WHERE 1;

--
-- DELETE template for table `AddOffersToArchiveRequest`
--
DELETE FROM `AddOffersToArchiveRequest` WHERE 0;

