--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetHiddenOffersResultDTO' definition.
--


--
-- SELECT template for table `GetHiddenOffersResultDTO`
--
SELECT `paging`, `hiddenOffers` FROM `GetHiddenOffersResultDTO` WHERE 1;

--
-- INSERT template for table `GetHiddenOffersResultDTO`
--
INSERT INTO `GetHiddenOffersResultDTO`(`paging`, `hiddenOffers`) VALUES (?, ?);

--
-- UPDATE template for table `GetHiddenOffersResultDTO`
--
UPDATE `GetHiddenOffersResultDTO` SET `paging` = ?, `hiddenOffers` = ? WHERE 1;

--
-- DELETE template for table `GetHiddenOffersResultDTO`
--
DELETE FROM `GetHiddenOffersResultDTO` WHERE 0;

