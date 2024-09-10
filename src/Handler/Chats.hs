{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Chats where

import           Import


-- | Создание нового чата с покупателем
--
-- Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: createChat
postBusinessesByInt64ChatsNewR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                               -> Handler Value
postBusinessesByInt64ChatsNewR businessId = notImplemented

-- | Получение истории сообщений в чате
--
-- Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-- operationId: getChatHistory
postBusinessesByInt64ChatsHistoryR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                   -> Handler Value
postBusinessesByInt64ChatsHistoryR businessId = notImplemented

-- | Получение доступных чатов
--
-- Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-- operationId: getChats
postBusinessesByInt64ChatsR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                            -> Handler Value
postBusinessesByInt64ChatsR businessId = notImplemented

-- | Отправка файла в чат
--
-- Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: sendFileToChat
postBusinessesByInt64ChatsFileSendR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                    -> Handler Value
postBusinessesByInt64ChatsFileSendR businessId = notImplemented

-- | Отправка сообщения в чат
--
-- Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: sendMessageToChat
postBusinessesByInt64ChatsMessageR :: Int64 -- ^ Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                                   -> Handler Value
postBusinessesByInt64ChatsMessageR businessId = notImplemented
