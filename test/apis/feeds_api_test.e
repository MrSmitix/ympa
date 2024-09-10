note
    description: "API tests for FEEDS_API"
    date: "$Date$"
    revision: "$Revision$"


class FEEDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_feed
            -- Информация о прайс-листе
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_FEED_RESPONSE
            l_campaign_id: INTEGER_64
            l_feed_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_feed_id

            -- l_response := api.feed(l_campaign_id, l_feed_id)
            assert ("not_implemented", False)
        end

    test_feed_index_logs
            -- Отчет по индексации прайс-листа
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_FEED_INDEX_LOGS_RESPONSE
            l_campaign_id: INTEGER_64
            l_feed_id: INTEGER_64
            l_limit: INTEGER_32
            l_published_time_from: DATE_TIME
            l_published_time_to: DATE_TIME
            l_status: FEED_INDEX_LOGS_STATUS_TYPE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_feed_id

            -- l_response := api.feed_index_logs(l_campaign_id, l_feed_id, l_limit, l_published_time_from, l_published_time_to, l_status)
            assert ("not_implemented", False)
        end

    test_feeds
            -- Список прайс-листов магазина
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_FEEDS_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.feeds(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_refresh_feed
            -- Сообщить, что прайс-лист обновился
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_feed_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_feed_id

            -- l_response := api.refresh_feed(l_campaign_id, l_feed_id)
            assert ("not_implemented", False)
        end

    test_set_feed_params
            -- Изменение параметров прайс-листа
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_feed_id: INTEGER_64
            l_set_feed_params_request: SET_FEED_PARAMS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_feed_id
            -- l_set_feed_params_request

            -- l_response := api.set_feed_params(l_campaign_id, l_feed_id, l_set_feed_params_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: FEEDS_API
            -- Create an object instance of `FEEDS_API'.
        once
            create { FEEDS_API } Result
        end

end
