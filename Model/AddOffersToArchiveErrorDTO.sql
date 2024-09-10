--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AddOffersToArchiveErrorDTO' definition.
--


--
-- SELECT template for table `AddOffersToArchiveErrorDTO`
--
SELECT `offerId`, `error` FROM `AddOffersToArchiveErrorDTO` WHERE 1;

--
-- INSERT template for table `AddOffersToArchiveErrorDTO`
--
INSERT INTO `AddOffersToArchiveErrorDTO`(`offerId`, `error`) VALUES (?, ?);

--
-- UPDATE template for table `AddOffersToArchiveErrorDTO`
--
UPDATE `AddOffersToArchiveErrorDTO` SET `offerId` = ?, `error` = ? WHERE 1;

--
-- DELETE template for table `AddOffersToArchiveErrorDTO`
--
DELETE FROM `AddOffersToArchiveErrorDTO` WHERE 0;

