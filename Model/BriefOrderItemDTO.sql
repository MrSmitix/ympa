--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BriefOrderItemDTO' definition.
--


--
-- SELECT template for table `BriefOrderItemDTO`
--
SELECT `id`, `vat`, `count`, `price`, `offerName`, `offerId`, `instances` FROM `BriefOrderItemDTO` WHERE 1;

--
-- INSERT template for table `BriefOrderItemDTO`
--
INSERT INTO `BriefOrderItemDTO`(`id`, `vat`, `count`, `price`, `offerName`, `offerId`, `instances`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BriefOrderItemDTO`
--
UPDATE `BriefOrderItemDTO` SET `id` = ?, `vat` = ?, `count` = ?, `price` = ?, `offerName` = ?, `offerId` = ?, `instances` = ? WHERE 1;

--
-- DELETE template for table `BriefOrderItemDTO`
--
DELETE FROM `BriefOrderItemDTO` WHERE 0;

