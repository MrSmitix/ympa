{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Campaigns where

import           Import


-- | Информация о магазине
--
-- Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: getCampaign
getCampaignsByInt64R :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                     -> Handler Value
getCampaignsByInt64R campaignId = notImplemented

-- | Логины, связанные с магазином
--
-- Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: getCampaignLogins
getCampaignsByInt64LoginsR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                           -> Handler Value
getCampaignsByInt64LoginsR campaignId = notImplemented

-- | Регион магазина
--
-- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-- operationId: getCampaignRegion
getCampaignsByInt64RegionR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                           -> Handler Value
getCampaignsByInt64RegionR campaignId = notImplemented

-- | Настройки магазина
--
-- Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: getCampaignSettings
getCampaignsByInt64SettingsR :: Int64 -- ^ Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
                             -> Handler Value
getCampaignsByInt64SettingsR campaignId = notImplemented

-- | Список магазинов пользователя
--
-- Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-- operationId: getCampaigns
getCampaignsR :: Handler Value
getCampaignsR = notImplemented

-- | Магазины, доступные логину
--
-- Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
-- operationId: getCampaignsByLogin
getCampaignsByLoginByTextR :: Text -- ^ Логин пользователя.
                           -> Handler Value
getCampaignsByLoginByTextR login = notImplemented
