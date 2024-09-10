note
    description: "API tests for CAMPAIGNS_API"
    date: "$Date$"
    revision: "$Revision$"


class CAMPAIGNS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_campaign
            -- Информация о магазине
            --
            -- Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGN_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.campaign(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_campaign_logins
            -- Логины, связанные с магазином
            --
            -- Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGN_LOGINS_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.campaign_logins(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_campaign_region
            -- Регион магазина
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGN_REGION_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.campaign_region(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_campaign_settings
            -- Настройки магазина
            --
            -- Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGN_SETTINGS_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.campaign_settings(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_campaigns
            -- Список магазинов пользователя
            --
            -- Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGNS_RESPONSE
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.campaigns(l_page, l_page_size)
            assert ("not_implemented", False)
        end

    test_campaigns_by_login
            -- Магазины, доступные логину
            --
            -- Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GET_CAMPAIGNS_RESPONSE
            l_login: STRING_32
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_login

            -- l_response := api.campaigns_by_login(l_login, l_page, l_page_size)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CAMPAIGNS_API
            -- Create an object instance of `CAMPAIGNS_API'.
        once
            create { CAMPAIGNS_API } Result
        end

end
