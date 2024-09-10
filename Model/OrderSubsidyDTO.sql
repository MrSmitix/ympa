--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderSubsidyDTO' definition.
--


--
-- SELECT template for table `OrderSubsidyDTO`
--
SELECT `type`, `amount` FROM `OrderSubsidyDTO` WHERE 1;

--
-- INSERT template for table `OrderSubsidyDTO`
--
INSERT INTO `OrderSubsidyDTO`(`type`, `amount`) VALUES (?, ?);

--
-- UPDATE template for table `OrderSubsidyDTO`
--
UPDATE `OrderSubsidyDTO` SET `type` = ?, `amount` = ? WHERE 1;

--
-- DELETE template for table `OrderSubsidyDTO`
--
DELETE FROM `OrderSubsidyDTO` WHERE 0;

