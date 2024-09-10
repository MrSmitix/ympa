--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOrderStatusDTO' definition.
--


--
-- SELECT template for table `UpdateOrderStatusDTO`
--
SELECT `id`, `status`, `substatus`, `updateStatus`, `errorDetails` FROM `UpdateOrderStatusDTO` WHERE 1;

--
-- INSERT template for table `UpdateOrderStatusDTO`
--
INSERT INTO `UpdateOrderStatusDTO`(`id`, `status`, `substatus`, `updateStatus`, `errorDetails`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `UpdateOrderStatusDTO`
--
UPDATE `UpdateOrderStatusDTO` SET `id` = ?, `status` = ?, `substatus` = ?, `updateStatus` = ?, `errorDetails` = ? WHERE 1;

--
-- DELETE template for table `UpdateOrderStatusDTO`
--
DELETE FROM `UpdateOrderStatusDTO` WHERE 0;

