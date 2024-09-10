--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OutletAddressDTO' definition.
--


--
-- SELECT template for table `OutletAddressDTO`
--
SELECT `regionId`, `street`, `number`, `building`, `estate`, `block`, `additional`, `km`, `city` FROM `OutletAddressDTO` WHERE 1;

--
-- INSERT template for table `OutletAddressDTO`
--
INSERT INTO `OutletAddressDTO`(`regionId`, `street`, `number`, `building`, `estate`, `block`, `additional`, `km`, `city`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OutletAddressDTO`
--
UPDATE `OutletAddressDTO` SET `regionId` = ?, `street` = ?, `number` = ?, `building` = ?, `estate` = ?, `block` = ?, `additional` = ?, `km` = ?, `city` = ? WHERE 1;

--
-- DELETE template for table `OutletAddressDTO`
--
DELETE FROM `OutletAddressDTO` WHERE 0;

