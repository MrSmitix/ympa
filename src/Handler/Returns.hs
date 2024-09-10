{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Returns where

import           Import


-- | Информация о невыкупе или возврате
--
-- Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: getReturn
getCampaignsByInt64OrdersByInt64ReturnsByInt64R :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                -> Int64 -- ^ Идентификатор заказа.
                                                -> Int64 -- ^ Идентификатор возврата.
                                                -> Handler Value
getCampaignsByInt64OrdersByInt64ReturnsByInt64R campaignId orderId returnId = notImplemented

-- | Получение заявления на возврат
--
-- Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: getReturnApplication
getCampaignsByInt64OrdersByInt64ReturnsByInt64ApplicationR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                           -> Int64 -- ^ Идентификатор заказа.
                                                           -> Int64 -- ^ Идентификатор возврата.
                                                           -> Handler Value
getCampaignsByInt64OrdersByInt64ReturnsByInt64ApplicationR campaignId orderId returnId = notImplemented

-- | Получение фотографии возврата
--
-- Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: getReturnPhoto
getCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                                          -> Int64 -- ^ Идентификатор заказа.
                                                                          -> Int64 -- ^ Идентификатор возврата.
                                                                          -> Int64 -- ^ Идентификатор товара в возврате.
                                                                          -> Text -- ^ Хеш ссылки изображения для загрузки.
                                                                          -> Handler Value
getCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionByInt64ImageByTextR campaignId orderId returnId itemId imageHash = notImplemented

-- | Список невыкупов и возвратов
--
-- Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: getReturns
getCampaignsByInt64ReturnsR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                            -> Handler Value
getCampaignsByInt64ReturnsR campaignId = notImplemented

-- | Принятие или изменение решения по возврату
--
-- Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: setReturnDecision
postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                         -> Int64 -- ^ Идентификатор заказа.
                                                         -> Int64 -- ^ Идентификатор возврата.
                                                         -> Handler Value
postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionR campaignId orderId returnId = notImplemented

-- | Подтверждение решения по возврату
--
-- Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-- operationId: submitReturnDecision
postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionSubmitR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                                               -> Int64 -- ^ Идентификатор заказа.
                                                               -> Int64 -- ^ Идентификатор возврата.
                                                               -> Handler Value
postCampaignsByInt64OrdersByInt64ReturnsByInt64DecisionSubmitR campaignId orderId returnId = notImplemented
