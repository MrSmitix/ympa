--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PickupAddressDTO' definition.
--


--
-- SELECT template for table `PickupAddressDTO`
--
SELECT `country`, `city`, `street`, `house`, `postcode` FROM `PickupAddressDTO` WHERE 1;

--
-- INSERT template for table `PickupAddressDTO`
--
INSERT INTO `PickupAddressDTO`(`country`, `city`, `street`, `house`, `postcode`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `PickupAddressDTO`
--
UPDATE `PickupAddressDTO` SET `country` = ?, `city` = ?, `street` = ?, `house` = ?, `postcode` = ? WHERE 1;

--
-- DELETE template for table `PickupAddressDTO`
--
DELETE FROM `PickupAddressDTO` WHERE 0;

