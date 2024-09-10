--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemInstanceDTO' definition.
--


--
-- SELECT template for table `OrderItemInstanceDTO`
--
SELECT `cis`, `cisFull`, `uin`, `rnpt`, `gtd` FROM `OrderItemInstanceDTO` WHERE 1;

--
-- INSERT template for table `OrderItemInstanceDTO`
--
INSERT INTO `OrderItemInstanceDTO`(`cis`, `cisFull`, `uin`, `rnpt`, `gtd`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderItemInstanceDTO`
--
UPDATE `OrderItemInstanceDTO` SET `cis` = ?, `cisFull` = ?, `uin` = ?, `rnpt` = ?, `gtd` = ? WHERE 1;

--
-- DELETE template for table `OrderItemInstanceDTO`
--
DELETE FROM `OrderItemInstanceDTO` WHERE 0;

