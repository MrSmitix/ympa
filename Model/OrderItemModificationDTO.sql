--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemModificationDTO' definition.
--


--
-- SELECT template for table `OrderItemModificationDTO`
--
SELECT `id`, `count`, `instances` FROM `OrderItemModificationDTO` WHERE 1;

--
-- INSERT template for table `OrderItemModificationDTO`
--
INSERT INTO `OrderItemModificationDTO`(`id`, `count`, `instances`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OrderItemModificationDTO`
--
UPDATE `OrderItemModificationDTO` SET `id` = ?, `count` = ?, `instances` = ? WHERE 1;

--
-- DELETE template for table `OrderItemModificationDTO`
--
DELETE FROM `OrderItemModificationDTO` WHERE 0;

