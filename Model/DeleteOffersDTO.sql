--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeleteOffersDTO' definition.
--


--
-- SELECT template for table `DeleteOffersDTO`
--
SELECT `notDeletedOfferIds` FROM `DeleteOffersDTO` WHERE 1;

--
-- INSERT template for table `DeleteOffersDTO`
--
INSERT INTO `DeleteOffersDTO`(`notDeletedOfferIds`) VALUES (?);

--
-- UPDATE template for table `DeleteOffersDTO`
--
UPDATE `DeleteOffersDTO` SET `notDeletedOfferIds` = ? WHERE 1;

--
-- DELETE template for table `DeleteOffersDTO`
--
DELETE FROM `DeleteOffersDTO` WHERE 0;

