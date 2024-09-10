--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseOfferDTO' definition.
--


--
-- SELECT template for table `WarehouseOfferDTO`
--
SELECT `offerId`, `turnoverSummary`, `stocks`, `updatedAt` FROM `WarehouseOfferDTO` WHERE 1;

--
-- INSERT template for table `WarehouseOfferDTO`
--
INSERT INTO `WarehouseOfferDTO`(`offerId`, `turnoverSummary`, `stocks`, `updatedAt`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `WarehouseOfferDTO`
--
UPDATE `WarehouseOfferDTO` SET `offerId` = ?, `turnoverSummary` = ?, `stocks` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `WarehouseOfferDTO`
--
DELETE FROM `WarehouseOfferDTO` WHERE 0;

