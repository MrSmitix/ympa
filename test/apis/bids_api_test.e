note
    description: "API tests for BIDS_API"
    date: "$Date$"
    revision: "$Revision$"


class BIDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_bids_info_for_business
            -- Информация об установленных ставках
            --
            -- Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
        local
            l_response: GET_BIDS_INFO_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_bids_info_request: GET_BIDS_INFO_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.bids_info_for_business(l_business_id, l_page_token, l_limit, l_get_bids_info_request)
            assert ("not_implemented", False)
        end

    test_bids_recommendations
            -- Рекомендованные ставки для заданных товаров
            --
            -- Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
        local
            l_response: GET_BIDS_RECOMMENDATIONS_RESPONSE
            l_business_id: INTEGER_64
            l_get_bids_recommendations_request: GET_BIDS_RECOMMENDATIONS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_bids_recommendations_request

            -- l_response := api.bids_recommendations(l_business_id, l_get_bids_recommendations_request)
            assert ("not_implemented", False)
        end

    test_put_bids_for_business
            -- Включение буста продаж и установка ставок
            --
            -- Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_put_sku_bids_request: PUT_SKU_BIDS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_put_sku_bids_request

            -- l_response := api.put_bids_for_business(l_business_id, l_put_sku_bids_request)
            assert ("not_implemented", False)
        end

    test_put_bids_for_campaign
            -- Включение буста продаж и установка ставок для магазина
            --
            -- Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_put_sku_bids_request: PUT_SKU_BIDS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_put_sku_bids_request

            -- l_response := api.put_bids_for_campaign(l_campaign_id, l_put_sku_bids_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BIDS_API
            -- Create an object instance of `BIDS_API'.
        once
            create { BIDS_API } Result
        end

end
