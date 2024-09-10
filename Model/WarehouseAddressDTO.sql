--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseAddressDTO' definition.
--


--
-- SELECT template for table `WarehouseAddressDTO`
--
SELECT `city`, `street`, `number`, `building`, `block`, `gps` FROM `WarehouseAddressDTO` WHERE 1;

--
-- INSERT template for table `WarehouseAddressDTO`
--
INSERT INTO `WarehouseAddressDTO`(`city`, `street`, `number`, `building`, `block`, `gps`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `WarehouseAddressDTO`
--
UPDATE `WarehouseAddressDTO` SET `city` = ?, `street` = ?, `number` = ?, `building` = ?, `block` = ?, `gps` = ? WHERE 1;

--
-- DELETE template for table `WarehouseAddressDTO`
--
DELETE FROM `WarehouseAddressDTO` WHERE 0;

