--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedParameterDTO' definition.
--


--
-- SELECT template for table `FeedParameterDTO`
--
SELECT `deleted`, `name`, `values` FROM `FeedParameterDTO` WHERE 1;

--
-- INSERT template for table `FeedParameterDTO`
--
INSERT INTO `FeedParameterDTO`(`deleted`, `name`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeedParameterDTO`
--
UPDATE `FeedParameterDTO` SET `deleted` = ?, `name` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `FeedParameterDTO`
--
DELETE FROM `FeedParameterDTO` WHERE 0;

