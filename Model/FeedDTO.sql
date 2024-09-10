--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedDTO' definition.
--


--
-- SELECT template for table `FeedDTO`
--
SELECT `id`, `login`, `name`, `password`, `uploadDate`, `url`, `content`, `download`, `placement`, `publication` FROM `FeedDTO` WHERE 1;

--
-- INSERT template for table `FeedDTO`
--
INSERT INTO `FeedDTO`(`id`, `login`, `name`, `password`, `uploadDate`, `url`, `content`, `download`, `placement`, `publication`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FeedDTO`
--
UPDATE `FeedDTO` SET `id` = ?, `login` = ?, `name` = ?, `password` = ?, `uploadDate` = ?, `url` = ?, `content` = ?, `download` = ?, `placement` = ?, `publication` = ? WHERE 1;

--
-- DELETE template for table `FeedDTO`
--
DELETE FROM `FeedDTO` WHERE 0;

