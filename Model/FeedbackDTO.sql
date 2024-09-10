--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackDTO' definition.
--


--
-- SELECT template for table `FeedbackDTO`
--
SELECT `id`, `createdAt`, `text`, `state`, `author`, `pro`, `contra`, `comments`, `shop`, `resolved`, `verified`, `recommend`, `grades`, `order` FROM `FeedbackDTO` WHERE 1;

--
-- INSERT template for table `FeedbackDTO`
--
INSERT INTO `FeedbackDTO`(`id`, `createdAt`, `text`, `state`, `author`, `pro`, `contra`, `comments`, `shop`, `resolved`, `verified`, `recommend`, `grades`, `order`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FeedbackDTO`
--
UPDATE `FeedbackDTO` SET `id` = ?, `createdAt` = ?, `text` = ?, `state` = ?, `author` = ?, `pro` = ?, `contra` = ?, `comments` = ?, `shop` = ?, `resolved` = ?, `verified` = ?, `recommend` = ?, `grades` = ?, `order` = ? WHERE 1;

--
-- DELETE template for table `FeedbackDTO`
--
DELETE FROM `FeedbackDTO` WHERE 0;

