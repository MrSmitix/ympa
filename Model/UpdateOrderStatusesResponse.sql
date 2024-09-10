--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOrderStatusesResponse' definition.
--


--
-- SELECT template for table `UpdateOrderStatusesResponse`
--
SELECT `status`, `result` FROM `UpdateOrderStatusesResponse` WHERE 1;

--
-- INSERT template for table `UpdateOrderStatusesResponse`
--
INSERT INTO `UpdateOrderStatusesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOrderStatusesResponse`
--
UPDATE `UpdateOrderStatusesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `UpdateOrderStatusesResponse`
--
DELETE FROM `UpdateOrderStatusesResponse` WHERE 0;

