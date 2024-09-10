--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferErrorDTO' definition.
--


--
-- SELECT template for table `OfferErrorDTO`
--
SELECT `message`, `comment` FROM `OfferErrorDTO` WHERE 1;

--
-- INSERT template for table `OfferErrorDTO`
--
INSERT INTO `OfferErrorDTO`(`message`, `comment`) VALUES (?, ?);

--
-- UPDATE template for table `OfferErrorDTO`
--
UPDATE `OfferErrorDTO` SET `message` = ?, `comment` = ? WHERE 1;

--
-- DELETE template for table `OfferErrorDTO`
--
DELETE FROM `OfferErrorDTO` WHERE 0;

