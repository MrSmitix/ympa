--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderDigitalItemDTO' definition.
--


--
-- SELECT template for table `OrderDigitalItemDTO`
--
SELECT `id`, `code`, `slip`, `activate_till` FROM `OrderDigitalItemDTO` WHERE 1;

--
-- INSERT template for table `OrderDigitalItemDTO`
--
INSERT INTO `OrderDigitalItemDTO`(`id`, `code`, `slip`, `activate_till`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OrderDigitalItemDTO`
--
UPDATE `OrderDigitalItemDTO` SET `id` = ?, `code` = ?, `slip` = ?, `activate_till` = ? WHERE 1;

--
-- DELETE template for table `OrderDigitalItemDTO`
--
DELETE FROM `OrderDigitalItemDTO` WHERE 0;

