--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SetOrderBoxLayoutRequest' definition.
--


--
-- SELECT template for table `SetOrderBoxLayoutRequest`
--
SELECT `boxes`, `allowRemove` FROM `SetOrderBoxLayoutRequest` WHERE 1;

--
-- INSERT template for table `SetOrderBoxLayoutRequest`
--
INSERT INTO `SetOrderBoxLayoutRequest`(`boxes`, `allowRemove`) VALUES (?, ?);

--
-- UPDATE template for table `SetOrderBoxLayoutRequest`
--
UPDATE `SetOrderBoxLayoutRequest` SET `boxes` = ?, `allowRemove` = ? WHERE 1;

--
-- DELETE template for table `SetOrderBoxLayoutRequest`
--
DELETE FROM `SetOrderBoxLayoutRequest` WHERE 0;

