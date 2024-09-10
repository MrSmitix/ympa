--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderDeliveryAddressDTO' definition.
--


--
-- SELECT template for table `OrderDeliveryAddressDTO`
--
SELECT `country`, `postcode`, `city`, `district`, `subway`, `street`, `house`, `block`, `entrance`, `entryphone`, `floor`, `apartment`, `phone`, `recipient`, `gps` FROM `OrderDeliveryAddressDTO` WHERE 1;

--
-- INSERT template for table `OrderDeliveryAddressDTO`
--
INSERT INTO `OrderDeliveryAddressDTO`(`country`, `postcode`, `city`, `district`, `subway`, `street`, `house`, `block`, `entrance`, `entryphone`, `floor`, `apartment`, `phone`, `recipient`, `gps`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderDeliveryAddressDTO`
--
UPDATE `OrderDeliveryAddressDTO` SET `country` = ?, `postcode` = ?, `city` = ?, `district` = ?, `subway` = ?, `street` = ?, `house` = ?, `block` = ?, `entrance` = ?, `entryphone` = ?, `floor` = ?, `apartment` = ?, `phone` = ?, `recipient` = ?, `gps` = ? WHERE 1;

--
-- DELETE template for table `OrderDeliveryAddressDTO`
--
DELETE FROM `OrderDeliveryAddressDTO` WHERE 0;

