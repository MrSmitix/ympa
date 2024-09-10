--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteOffersFromArchiveDTO' definition.
--


--
-- SELECT template for table `DeleteOffersFromArchiveDTO`
--
SELECT `notUnarchivedOfferIds` FROM `DeleteOffersFromArchiveDTO` WHERE 1;

--
-- INSERT template for table `DeleteOffersFromArchiveDTO`
--
INSERT INTO `DeleteOffersFromArchiveDTO`(`notUnarchivedOfferIds`) VALUES (?);

--
-- UPDATE template for table `DeleteOffersFromArchiveDTO`
--
UPDATE `DeleteOffersFromArchiveDTO` SET `notUnarchivedOfferIds` = ? WHERE 1;

--
-- DELETE template for table `DeleteOffersFromArchiveDTO`
--
DELETE FROM `DeleteOffersFromArchiveDTO` WHERE 0;

