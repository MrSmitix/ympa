--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderStatusChangeDTO' definition.
--


--
-- SELECT template for table `OrderStatusChangeDTO`
--
SELECT `status`, `substatus`, `delivery` FROM `OrderStatusChangeDTO` WHERE 1;

--
-- INSERT template for table `OrderStatusChangeDTO`
--
INSERT INTO `OrderStatusChangeDTO`(`status`, `substatus`, `delivery`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OrderStatusChangeDTO`
--
UPDATE `OrderStatusChangeDTO` SET `status` = ?, `substatus` = ?, `delivery` = ? WHERE 1;

--
-- DELETE template for table `OrderStatusChangeDTO`
--
DELETE FROM `OrderStatusChangeDTO` WHERE 0;

