--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBusinessBuyerDTO' definition.
--


--
-- SELECT template for table `OrderBusinessBuyerDTO`
--
SELECT `inn`, `kpp`, `organizationName`, `organizationJurAddress` FROM `OrderBusinessBuyerDTO` WHERE 1;

--
-- INSERT template for table `OrderBusinessBuyerDTO`
--
INSERT INTO `OrderBusinessBuyerDTO`(`inn`, `kpp`, `organizationName`, `organizationJurAddress`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OrderBusinessBuyerDTO`
--
UPDATE `OrderBusinessBuyerDTO` SET `inn` = ?, `kpp` = ?, `organizationName` = ?, `organizationJurAddress` = ? WHERE 1;

--
-- DELETE template for table `OrderBusinessBuyerDTO`
--
DELETE FROM `OrderBusinessBuyerDTO` WHERE 0;

