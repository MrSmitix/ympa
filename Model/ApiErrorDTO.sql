--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiErrorDTO' definition.
--


--
-- SELECT template for table `ApiErrorDTO`
--
SELECT `code`, `message` FROM `ApiErrorDTO` WHERE 1;

--
-- INSERT template for table `ApiErrorDTO`
--
INSERT INTO `ApiErrorDTO`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `ApiErrorDTO`
--
UPDATE `ApiErrorDTO` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `ApiErrorDTO`
--
DELETE FROM `ApiErrorDTO` WHERE 0;

