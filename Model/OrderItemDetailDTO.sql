--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemDetailDTO' definition.
--


--
-- SELECT template for table `OrderItemDetailDTO`
--
SELECT `itemCount`, `itemStatus`, `updateDate` FROM `OrderItemDetailDTO` WHERE 1;

--
-- INSERT template for table `OrderItemDetailDTO`
--
INSERT INTO `OrderItemDetailDTO`(`itemCount`, `itemStatus`, `updateDate`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OrderItemDetailDTO`
--
UPDATE `OrderItemDetailDTO` SET `itemCount` = ?, `itemStatus` = ?, `updateDate` = ? WHERE 1;

--
-- DELETE template for table `OrderItemDetailDTO`
--
DELETE FROM `OrderItemDetailDTO` WHERE 0;

