--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'LogisticPickupPointDTO' definition.
--


--
-- SELECT template for table `LogisticPickupPointDTO`
--
SELECT `id`, `name`, `address`, `instruction`, `type`, `logisticPartnerId` FROM `LogisticPickupPointDTO` WHERE 1;

--
-- INSERT template for table `LogisticPickupPointDTO`
--
INSERT INTO `LogisticPickupPointDTO`(`id`, `name`, `address`, `instruction`, `type`, `logisticPartnerId`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LogisticPickupPointDTO`
--
UPDATE `LogisticPickupPointDTO` SET `id` = ?, `name` = ?, `address` = ?, `instruction` = ?, `type` = ?, `logisticPartnerId` = ? WHERE 1;

--
-- DELETE template for table `LogisticPickupPointDTO`
--
DELETE FROM `LogisticPickupPointDTO` WHERE 0;

