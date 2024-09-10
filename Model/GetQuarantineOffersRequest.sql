--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQuarantineOffersRequest' definition.
--


--
-- SELECT template for table `GetQuarantineOffersRequest`
--
SELECT `offerIds`, `cardStatuses`, `categoryIds`, `vendorNames`, `tags` FROM `GetQuarantineOffersRequest` WHERE 1;

--
-- INSERT template for table `GetQuarantineOffersRequest`
--
INSERT INTO `GetQuarantineOffersRequest`(`offerIds`, `cardStatuses`, `categoryIds`, `vendorNames`, `tags`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetQuarantineOffersRequest`
--
UPDATE `GetQuarantineOffersRequest` SET `offerIds` = ?, `cardStatuses` = ?, `categoryIds` = ?, `vendorNames` = ?, `tags` = ? WHERE 1;

--
-- DELETE template for table `GetQuarantineOffersRequest`
--
DELETE FROM `GetQuarantineOffersRequest` WHERE 0;

