--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ProvideOrderItemIdentifiersResponse' definition.
--


--
-- SELECT template for table `ProvideOrderItemIdentifiersResponse`
--
SELECT `status`, `result` FROM `ProvideOrderItemIdentifiersResponse` WHERE 1;

--
-- INSERT template for table `ProvideOrderItemIdentifiersResponse`
--
INSERT INTO `ProvideOrderItemIdentifiersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `ProvideOrderItemIdentifiersResponse`
--
UPDATE `ProvideOrderItemIdentifiersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `ProvideOrderItemIdentifiersResponse`
--
DELETE FROM `ProvideOrderItemIdentifiersResponse` WHERE 0;

