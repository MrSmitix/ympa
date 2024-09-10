--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemInstanceModificationDTO' definition.
--


--
-- SELECT template for table `OrderItemInstanceModificationDTO`
--
SELECT `id`, `instances` FROM `OrderItemInstanceModificationDTO` WHERE 1;

--
-- INSERT template for table `OrderItemInstanceModificationDTO`
--
INSERT INTO `OrderItemInstanceModificationDTO`(`id`, `instances`) VALUES (?, ?);

--
-- UPDATE template for table `OrderItemInstanceModificationDTO`
--
UPDATE `OrderItemInstanceModificationDTO` SET `id` = ?, `instances` = ? WHERE 1;

--
-- DELETE template for table `OrderItemInstanceModificationDTO`
--
DELETE FROM `OrderItemInstanceModificationDTO` WHERE 0;

