--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOrderItemRequest' definition.
--


--
-- SELECT template for table `UpdateOrderItemRequest`
--
SELECT `items`, `reason` FROM `UpdateOrderItemRequest` WHERE 1;

--
-- INSERT template for table `UpdateOrderItemRequest`
--
INSERT INTO `UpdateOrderItemRequest`(`items`, `reason`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOrderItemRequest`
--
UPDATE `UpdateOrderItemRequest` SET `items` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `UpdateOrderItemRequest`
--
DELETE FROM `UpdateOrderItemRequest` WHERE 0;

