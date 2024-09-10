--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SearchShipmentsResponseDTO' definition.
--


--
-- SELECT template for table `SearchShipmentsResponseDTO`
--
SELECT `shipments`, `paging` FROM `SearchShipmentsResponseDTO` WHERE 1;

--
-- INSERT template for table `SearchShipmentsResponseDTO`
--
INSERT INTO `SearchShipmentsResponseDTO`(`shipments`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `SearchShipmentsResponseDTO`
--
UPDATE `SearchShipmentsResponseDTO` SET `shipments` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `SearchShipmentsResponseDTO`
--
DELETE FROM `SearchShipmentsResponseDTO` WHERE 0;

