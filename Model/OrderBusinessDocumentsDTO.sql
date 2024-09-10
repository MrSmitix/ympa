--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBusinessDocumentsDTO' definition.
--


--
-- SELECT template for table `OrderBusinessDocumentsDTO`
--
SELECT `upd`, `ukd`, `torgTwelve`, `sf`, `ksf` FROM `OrderBusinessDocumentsDTO` WHERE 1;

--
-- INSERT template for table `OrderBusinessDocumentsDTO`
--
INSERT INTO `OrderBusinessDocumentsDTO`(`upd`, `ukd`, `torgTwelve`, `sf`, `ksf`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderBusinessDocumentsDTO`
--
UPDATE `OrderBusinessDocumentsDTO` SET `upd` = ?, `ukd` = ?, `torgTwelve` = ?, `sf` = ?, `ksf` = ? WHERE 1;

--
-- DELETE template for table `OrderBusinessDocumentsDTO`
--
DELETE FROM `OrderBusinessDocumentsDTO` WHERE 0;

