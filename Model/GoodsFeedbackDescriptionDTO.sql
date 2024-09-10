--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackDescriptionDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackDescriptionDTO`
--
SELECT `advantages`, `disadvantages`, `comment` FROM `GoodsFeedbackDescriptionDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackDescriptionDTO`
--
INSERT INTO `GoodsFeedbackDescriptionDTO`(`advantages`, `disadvantages`, `comment`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GoodsFeedbackDescriptionDTO`
--
UPDATE `GoodsFeedbackDescriptionDTO` SET `advantages` = ?, `disadvantages` = ?, `comment` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackDescriptionDTO`
--
DELETE FROM `GoodsFeedbackDescriptionDTO` WHERE 0;

