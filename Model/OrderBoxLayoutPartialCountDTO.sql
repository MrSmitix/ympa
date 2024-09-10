--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBoxLayoutPartialCountDTO' definition.
--


--
-- SELECT template for table `OrderBoxLayoutPartialCountDTO`
--
SELECT `current`, `total` FROM `OrderBoxLayoutPartialCountDTO` WHERE 1;

--
-- INSERT template for table `OrderBoxLayoutPartialCountDTO`
--
INSERT INTO `OrderBoxLayoutPartialCountDTO`(`current`, `total`) VALUES (?, ?);

--
-- UPDATE template for table `OrderBoxLayoutPartialCountDTO`
--
UPDATE `OrderBoxLayoutPartialCountDTO` SET `current` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `OrderBoxLayoutPartialCountDTO`
--
DELETE FROM `OrderBoxLayoutPartialCountDTO` WHERE 0;

