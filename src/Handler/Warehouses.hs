{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Warehouses where

import           Import


-- | Идентификаторы складов Маркета (FBY)
--
-- Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-- operationId: getFulfillmentWarehouses
getWarehousesR :: Handler Value
getWarehousesR = notImplemented

-- | Список складов и групп складов
--
-- Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-- operationId: getWarehouses
getBusinessesByInt64WarehousesR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                -> Handler Value
getBusinessesByInt64WarehousesR businessId = notImplemented
