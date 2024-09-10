--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderDTO' definition.
--


--
-- SELECT template for table `OrderDTO`
--
SELECT `id`, `status`, `substatus`, `creationDate`, `updatedAt`, `currency`, `itemsTotal`, `deliveryTotal`, `buyerItemsTotal`, `buyerTotal`, `buyerItemsTotalBeforeDiscount`, `buyerTotalBeforeDiscount`, `paymentType`, `paymentMethod`, `fake`, `items`, `subsidies`, `delivery`, `buyer`, `notes`, `taxSystem`, `cancelRequested`, `expiryDate` FROM `OrderDTO` WHERE 1;

--
-- INSERT template for table `OrderDTO`
--
INSERT INTO `OrderDTO`(`id`, `status`, `substatus`, `creationDate`, `updatedAt`, `currency`, `itemsTotal`, `deliveryTotal`, `buyerItemsTotal`, `buyerTotal`, `buyerItemsTotalBeforeDiscount`, `buyerTotalBeforeDiscount`, `paymentType`, `paymentMethod`, `fake`, `items`, `subsidies`, `delivery`, `buyer`, `notes`, `taxSystem`, `cancelRequested`, `expiryDate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderDTO`
--
UPDATE `OrderDTO` SET `id` = ?, `status` = ?, `substatus` = ?, `creationDate` = ?, `updatedAt` = ?, `currency` = ?, `itemsTotal` = ?, `deliveryTotal` = ?, `buyerItemsTotal` = ?, `buyerTotal` = ?, `buyerItemsTotalBeforeDiscount` = ?, `buyerTotalBeforeDiscount` = ?, `paymentType` = ?, `paymentMethod` = ?, `fake` = ?, `items` = ?, `subsidies` = ?, `delivery` = ?, `buyer` = ?, `notes` = ?, `taxSystem` = ?, `cancelRequested` = ?, `expiryDate` = ? WHERE 1;

--
-- DELETE template for table `OrderDTO`
--
DELETE FROM `OrderDTO` WHERE 0;

