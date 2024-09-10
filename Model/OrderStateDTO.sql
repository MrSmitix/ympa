--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderStateDTO' definition.
--


--
-- SELECT template for table `OrderStateDTO`
--
SELECT `id`, `status`, `substatus` FROM `OrderStateDTO` WHERE 1;

--
-- INSERT template for table `OrderStateDTO`
--
INSERT INTO `OrderStateDTO`(`id`, `status`, `substatus`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OrderStateDTO`
--
UPDATE `OrderStateDTO` SET `id` = ?, `status` = ?, `substatus` = ? WHERE 1;

--
-- DELETE template for table `OrderStateDTO`
--
DELETE FROM `OrderStateDTO` WHERE 0;

