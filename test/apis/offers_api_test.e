note
    description: "API tests for OFFERS_API"
    date: "$Date$"
    revision: "$Revision$"


class OFFERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_all_offers
            -- Все предложения магазина
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
        local
            l_response: GET_ALL_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_feed_id: INTEGER_64
            l_chunk: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.all_offers(l_campaign_id, l_feed_id, l_chunk)
            assert ("not_implemented", False)
        end

    test_campaign_offers
            -- Информация о товарах, которые размещены в заданном магазине
            --
            -- Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: GET_CAMPAIGN_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_campaign_offers_request: GET_CAMPAIGN_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_campaign_offers_request

            -- l_response := api.campaign_offers(l_campaign_id, l_get_campaign_offers_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_delete_campaign_offers
            -- Удаление товаров из ассортимента магазина
            --
            -- Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: DELETE_CAMPAIGN_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_delete_campaign_offers_request: DELETE_CAMPAIGN_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_delete_campaign_offers_request

            -- l_response := api.delete_campaign_offers(l_campaign_id, l_delete_campaign_offers_request)
            assert ("not_implemented", False)
        end

    test_offer_recommendations
            -- Рекомендации Маркета, касающиеся цен
            --
            -- Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: GET_OFFER_RECOMMENDATIONS_RESPONSE
            l_business_id: INTEGER_64
            l_get_offer_recommendations_request: GET_OFFER_RECOMMENDATIONS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_offer_recommendations_request

            -- l_response := api.offer_recommendations(l_business_id, l_get_offer_recommendations_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_offers
            -- Предложения магазина
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
        local
            l_response: GET_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_query: STRING_32
            l_feed_id: INTEGER_64
            l_shop_category_id: STRING_32
            l_currency: CURRENCY_TYPE
            l_matched: BOOLEAN
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.offers(l_campaign_id, l_query, l_feed_id, l_shop_category_id, l_currency, l_matched, l_page, l_page_size)
            assert ("not_implemented", False)
        end

    test_update_campaign_offers
            -- Изменение условий продажи товаров в магазине
            --
            -- Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_update_campaign_offers_request: UPDATE_CAMPAIGN_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_update_campaign_offers_request

            -- l_response := api.update_campaign_offers(l_campaign_id, l_update_campaign_offers_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OFFERS_API
            -- Create an object instance of `OFFERS_API'.
        once
            create { OFFERS_API } Result
        end

end
