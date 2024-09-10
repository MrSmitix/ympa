--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferContentErrorDTO' definition.
--


--
-- SELECT template for table `OfferContentErrorDTO`
--
SELECT `type`, `parameterId`, `message` FROM `OfferContentErrorDTO` WHERE 1;

--
-- INSERT template for table `OfferContentErrorDTO`
--
INSERT INTO `OfferContentErrorDTO`(`type`, `parameterId`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferContentErrorDTO`
--
UPDATE `OfferContentErrorDTO` SET `type` = ?, `parameterId` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `OfferContentErrorDTO`
--
DELETE FROM `OfferContentErrorDTO` WHERE 0;

