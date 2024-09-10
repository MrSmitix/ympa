--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedPublicationFullDTO' definition.
--


--
-- SELECT template for table `FeedPublicationFullDTO`
--
SELECT `fileTime`, `publishedTime` FROM `FeedPublicationFullDTO` WHERE 1;

--
-- INSERT template for table `FeedPublicationFullDTO`
--
INSERT INTO `FeedPublicationFullDTO`(`fileTime`, `publishedTime`) VALUES (?, ?);

--
-- UPDATE template for table `FeedPublicationFullDTO`
--
UPDATE `FeedPublicationFullDTO` SET `fileTime` = ?, `publishedTime` = ? WHERE 1;

--
-- DELETE template for table `FeedPublicationFullDTO`
--
DELETE FROM `FeedPublicationFullDTO` WHERE 0;

