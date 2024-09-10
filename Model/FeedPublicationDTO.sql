--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedPublicationDTO' definition.
--


--
-- SELECT template for table `FeedPublicationDTO`
--
SELECT `status`, `full`, `priceAndStockUpdate` FROM `FeedPublicationDTO` WHERE 1;

--
-- INSERT template for table `FeedPublicationDTO`
--
INSERT INTO `FeedPublicationDTO`(`status`, `full`, `priceAndStockUpdate`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeedPublicationDTO`
--
UPDATE `FeedPublicationDTO` SET `status` = ?, `full` = ?, `priceAndStockUpdate` = ? WHERE 1;

--
-- DELETE template for table `FeedPublicationDTO`
--
DELETE FROM `FeedPublicationDTO` WHERE 0;

