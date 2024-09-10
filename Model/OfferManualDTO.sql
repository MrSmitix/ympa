--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferManualDTO' definition.
--


--
-- SELECT template for table `OfferManualDTO`
--
SELECT `url`, `title` FROM `OfferManualDTO` WHERE 1;

--
-- INSERT template for table `OfferManualDTO`
--
INSERT INTO `OfferManualDTO`(`url`, `title`) VALUES (?, ?);

--
-- UPDATE template for table `OfferManualDTO`
--
UPDATE `OfferManualDTO` SET `url` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `OfferManualDTO`
--
DELETE FROM `OfferManualDTO` WHERE 0;

