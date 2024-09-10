--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQuarantineOffersResultDTO' definition.
--


--
-- SELECT template for table `GetQuarantineOffersResultDTO`
--
SELECT `paging`, `offers` FROM `GetQuarantineOffersResultDTO` WHERE 1;

--
-- INSERT template for table `GetQuarantineOffersResultDTO`
--
INSERT INTO `GetQuarantineOffersResultDTO`(`paging`, `offers`) VALUES (?, ?);

--
-- UPDATE template for table `GetQuarantineOffersResultDTO`
--
UPDATE `GetQuarantineOffersResultDTO` SET `paging` = ?, `offers` = ? WHERE 1;

--
-- DELETE template for table `GetQuarantineOffersResultDTO`
--
DELETE FROM `GetQuarantineOffersResultDTO` WHERE 0;

