--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferParamDTO' definition.
--


--
-- SELECT template for table `OfferParamDTO`
--
SELECT `name`, `value` FROM `OfferParamDTO` WHERE 1;

--
-- INSERT template for table `OfferParamDTO`
--
INSERT INTO `OfferParamDTO`(`name`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `OfferParamDTO`
--
UPDATE `OfferParamDTO` SET `name` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `OfferParamDTO`
--
DELETE FROM `OfferParamDTO` WHERE 0;

