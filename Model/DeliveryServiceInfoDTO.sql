--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DeliveryServiceInfoDTO' definition.
--


--
-- SELECT template for table `DeliveryServiceInfoDTO`
--
SELECT `id`, `name` FROM `DeliveryServiceInfoDTO` WHERE 1;

--
-- INSERT template for table `DeliveryServiceInfoDTO`
--
INSERT INTO `DeliveryServiceInfoDTO`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `DeliveryServiceInfoDTO`
--
UPDATE `DeliveryServiceInfoDTO` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `DeliveryServiceInfoDTO`
--
DELETE FROM `DeliveryServiceInfoDTO` WHERE 0;

