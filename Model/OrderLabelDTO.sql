--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderLabelDTO' definition.
--


--
-- SELECT template for table `OrderLabelDTO`
--
SELECT `orderId`, `placesNumber`, `url`, `parcelBoxLabels` FROM `OrderLabelDTO` WHERE 1;

--
-- INSERT template for table `OrderLabelDTO`
--
INSERT INTO `OrderLabelDTO`(`orderId`, `placesNumber`, `url`, `parcelBoxLabels`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OrderLabelDTO`
--
UPDATE `OrderLabelDTO` SET `orderId` = ?, `placesNumber` = ?, `url` = ?, `parcelBoxLabels` = ? WHERE 1;

--
-- DELETE template for table `OrderLabelDTO`
--
DELETE FROM `OrderLabelDTO` WHERE 0;

