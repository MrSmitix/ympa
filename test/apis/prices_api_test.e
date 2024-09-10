note
    description: "API tests for PRICES_API"
    date: "$Date$"
    revision: "$Revision$"


class PRICES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_prices
            -- Список цен
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
        local
            l_response: GET_PRICES_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_archived: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.prices(l_campaign_id, l_page_token, l_limit, l_archived)
            assert ("not_implemented", False)
        end

    test_prices_by_offer_ids
            -- Просмотр цен на указанные товары в магазине
            --
            -- Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
        local
            l_response: GET_PRICES_BY_OFFER_IDS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_prices_by_offer_ids_request: GET_PRICES_BY_OFFER_IDS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.prices_by_offer_ids(l_campaign_id, l_page_token, l_limit, l_get_prices_by_offer_ids_request)
            assert ("not_implemented", False)
        end

    test_suggested_prices
            -- Цены для продвижения товаров
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
        local
            l_response: SUGGEST_PRICES_RESPONSE
            l_campaign_id: INTEGER_64
            l_suggest_prices_request: SUGGEST_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_suggest_prices_request

            -- l_response := api.suggested_prices(l_campaign_id, l_suggest_prices_request)
            assert ("not_implemented", False)
        end

    test_update_business_prices
            -- Установка цен на товары во всех магазинах
            --
            -- Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_update_business_prices_request: UPDATE_BUSINESS_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_business_prices_request

            -- l_response := api.update_business_prices(l_business_id, l_update_business_prices_request)
            assert ("not_implemented", False)
        end

    test_update_prices
            -- Установка цен на товары в конкретном магазине
            --
            -- Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_update_prices_request: UPDATE_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_update_prices_request

            -- l_response := api.update_prices(l_campaign_id, l_update_prices_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRICES_API
            -- Create an object instance of `PRICES_API'.
        once
            create { PRICES_API } Result
        end

end
