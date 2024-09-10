--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemSubsidyDTO' definition.
--


--
-- SELECT template for table `OrderItemSubsidyDTO`
--
SELECT `type`, `amount` FROM `OrderItemSubsidyDTO` WHERE 1;

--
-- INSERT template for table `OrderItemSubsidyDTO`
--
INSERT INTO `OrderItemSubsidyDTO`(`type`, `amount`) VALUES (?, ?);

--
-- UPDATE template for table `OrderItemSubsidyDTO`
--
UPDATE `OrderItemSubsidyDTO` SET `type` = ?, `amount` = ? WHERE 1;

--
-- DELETE template for table `OrderItemSubsidyDTO`
--
DELETE FROM `OrderItemSubsidyDTO` WHERE 0;

