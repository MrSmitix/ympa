--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ReturnItemDTO' definition.
--


--
-- SELECT template for table `ReturnItemDTO`
--
SELECT `marketSku`, `shopSku`, `count`, `decisions`, `instances`, `tracks` FROM `ReturnItemDTO` WHERE 1;

--
-- INSERT template for table `ReturnItemDTO`
--
INSERT INTO `ReturnItemDTO`(`marketSku`, `shopSku`, `count`, `decisions`, `instances`, `tracks`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ReturnItemDTO`
--
UPDATE `ReturnItemDTO` SET `marketSku` = ?, `shopSku` = ?, `count` = ?, `decisions` = ?, `instances` = ?, `tracks` = ? WHERE 1;

--
-- DELETE template for table `ReturnItemDTO`
--
DELETE FROM `ReturnItemDTO` WHERE 0;

