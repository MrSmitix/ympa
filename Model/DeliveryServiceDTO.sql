--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeliveryServiceDTO' definition.
--


--
-- SELECT template for table `DeliveryServiceDTO`
--
SELECT `id`, `name` FROM `DeliveryServiceDTO` WHERE 1;

--
-- INSERT template for table `DeliveryServiceDTO`
--
INSERT INTO `DeliveryServiceDTO`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `DeliveryServiceDTO`
--
UPDATE `DeliveryServiceDTO` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `DeliveryServiceDTO`
--
DELETE FROM `DeliveryServiceDTO` WHERE 0;

