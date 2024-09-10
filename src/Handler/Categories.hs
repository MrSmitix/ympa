{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Categories where

import           Import


-- | Лимит на установку кванта продажи и минимального количества товаров в заказе
--
-- Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- operationId: getCategoriesMaxSaleQuantum
postCategoriesMaxSaleQuantumR :: Handler Value
postCategoriesMaxSaleQuantumR = notImplemented

-- | Дерево категорий
--
-- Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-- operationId: getCategoriesTree
postCategoriesTreeR :: Handler Value
postCategoriesTreeR = notImplemented
