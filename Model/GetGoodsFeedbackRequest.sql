--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetGoodsFeedbackRequest' definition.
--


--
-- SELECT template for table `GetGoodsFeedbackRequest`
--
SELECT `dateTimeFrom`, `dateTimeTo`, `reactionStatus`, `ratingValues`, `modelIds`, `paid` FROM `GetGoodsFeedbackRequest` WHERE 1;

--
-- INSERT template for table `GetGoodsFeedbackRequest`
--
INSERT INTO `GetGoodsFeedbackRequest`(`dateTimeFrom`, `dateTimeTo`, `reactionStatus`, `ratingValues`, `modelIds`, `paid`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetGoodsFeedbackRequest`
--
UPDATE `GetGoodsFeedbackRequest` SET `dateTimeFrom` = ?, `dateTimeTo` = ?, `reactionStatus` = ?, `ratingValues` = ?, `modelIds` = ?, `paid` = ? WHERE 1;

--
-- DELETE template for table `GetGoodsFeedbackRequest`
--
DELETE FROM `GetGoodsFeedbackRequest` WHERE 0;

