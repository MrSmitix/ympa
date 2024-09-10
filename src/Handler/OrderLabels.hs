{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.OrderLabels where

import           Import


-- | Готовый ярлык‑наклейка для коробки в заказе
--
-- Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-- operationId: generateOrderLabel
getCampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesByInt64LabelR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                                           -> Int64 -- ^ Идентификатор заказа.
                                                                           -> Int64 -- ^ Идентификатор грузоместа.
                                                                           -> Int64 -- ^ Идентификатор коробки.
                                                                           -> Handler Value
getCampaignsByInt64OrdersByInt64DeliveryShipmentsByInt64BoxesByInt64LabelR campaignId orderId shipmentId boxId = notImplemented

-- | Готовые ярлыки‑наклейки на все коробки в одном заказе
--
-- Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-- operationId: generateOrderLabels
getCampaignsByInt64OrdersByInt64DeliveryLabelsR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                -> Int64 -- ^ Идентификатор заказа.
                                                -> Handler Value
getCampaignsByInt64OrdersByInt64DeliveryLabelsR campaignId orderId = notImplemented

-- | Данные для самостоятельного изготовления ярлыков
--
-- Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-- operationId: getOrderLabelsData
getCampaignsByInt64OrdersByInt64DeliveryLabelsDataR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                    -> Int64 -- ^ Идентификатор заказа.
                                                    -> Handler Value
getCampaignsByInt64OrdersByInt64DeliveryLabelsDataR campaignId orderId = notImplemented
