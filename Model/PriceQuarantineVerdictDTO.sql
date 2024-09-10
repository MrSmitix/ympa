--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceQuarantineVerdictDTO' definition.
--


--
-- SELECT template for table `PriceQuarantineVerdictDTO`
--
SELECT `type`, `params` FROM `PriceQuarantineVerdictDTO` WHERE 1;

--
-- INSERT template for table `PriceQuarantineVerdictDTO`
--
INSERT INTO `PriceQuarantineVerdictDTO`(`type`, `params`) VALUES (?, ?);

--
-- UPDATE template for table `PriceQuarantineVerdictDTO`
--
UPDATE `PriceQuarantineVerdictDTO` SET `type` = ?, `params` = ? WHERE 1;

--
-- DELETE template for table `PriceQuarantineVerdictDTO`
--
DELETE FROM `PriceQuarantineVerdictDTO` WHERE 0;

