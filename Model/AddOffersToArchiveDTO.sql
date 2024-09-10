--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AddOffersToArchiveDTO' definition.
--


--
-- SELECT template for table `AddOffersToArchiveDTO`
--
SELECT `notArchivedOffers` FROM `AddOffersToArchiveDTO` WHERE 1;

--
-- INSERT template for table `AddOffersToArchiveDTO`
--
INSERT INTO `AddOffersToArchiveDTO`(`notArchivedOffers`) VALUES (?);

--
-- UPDATE template for table `AddOffersToArchiveDTO`
--
UPDATE `AddOffersToArchiveDTO` SET `notArchivedOffers` = ? WHERE 1;

--
-- DELETE template for table `AddOffersToArchiveDTO`
--
DELETE FROM `AddOffersToArchiveDTO` WHERE 0;

