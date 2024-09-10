--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PromoPeriodDTO' definition.
--


--
-- SELECT template for table `PromoPeriodDTO`
--
SELECT `dateTimeFrom`, `dateTimeTo` FROM `PromoPeriodDTO` WHERE 1;

--
-- INSERT template for table `PromoPeriodDTO`
--
INSERT INTO `PromoPeriodDTO`(`dateTimeFrom`, `dateTimeTo`) VALUES (?, ?);

--
-- UPDATE template for table `PromoPeriodDTO`
--
UPDATE `PromoPeriodDTO` SET `dateTimeFrom` = ?, `dateTimeTo` = ? WHERE 1;

--
-- DELETE template for table `PromoPeriodDTO`
--
DELETE FROM `PromoPeriodDTO` WHERE 0;

