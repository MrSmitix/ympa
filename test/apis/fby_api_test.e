note
    description: "API tests for FBY_API"
    date: "$Date$"
    revision: "$Revision$"


class FBY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_add_hidden_offers
            -- Скрытие товаров и настройки скрытия
            --
            -- Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_add_hidden_offers_request: ADD_HIDDEN_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_add_hidden_offers_request

            -- l_response := api.add_hidden_offers(l_campaign_id, l_add_hidden_offers_request)
            assert ("not_implemented", False)
        end

    test_add_offers_to_archive
            -- Добавление товаров в архив
            --
            -- Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: ADD_OFFERS_TO_ARCHIVE_RESPONSE
            l_business_id: INTEGER_64
            l_add_offers_to_archive_request: ADD_OFFERS_TO_ARCHIVE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_add_offers_to_archive_request

            -- l_response := api.add_offers_to_archive(l_business_id, l_add_offers_to_archive_request)
            assert ("not_implemented", False)
        end

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

    test_business_quarantine_offers
            -- Список товаров, находящихся в карантине по цене в кабинете
            --
            -- Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
        local
            l_response: GET_QUARANTINE_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_get_quarantine_offers_request: GET_QUARANTINE_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_quarantine_offers_request

            -- l_response := api.business_quarantine_offers(l_business_id, l_get_quarantine_offers_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_business_settings
            -- Настройки кабинета
            --
            -- Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_BUSINESS_SETTINGS_RESPONSE
            l_business_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_settings(l_business_id)
            assert ("not_implemented", False)
        end

    test_calculate_tariffs
            -- Калькулятор стоимости услуг
            --
            -- Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: CALCULATE_TARIFFS_RESPONSE
            l_calculate_tariffs_request: CALCULATE_TARIFFS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_calculate_tariffs_request

            -- l_response := api.calculate_tariffs(l_calculate_tariffs_request)
            assert ("not_implemented", False)
        end

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

    test_campaign_quarantine_offers
            -- Список товаров, находящихся в карантине по цене в магазине
            --
            -- Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: GET_QUARANTINE_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_quarantine_offers_request: GET_QUARANTINE_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_quarantine_offers_request

            -- l_response := api.campaign_quarantine_offers(l_campaign_id, l_get_quarantine_offers_request, l_page_token, l_limit)
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

    test_categories_max_sale_quantum
            -- Лимит на установку кванта продажи и минимального количества товаров в заказе
            --
            -- Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_CATEGORIES_MAX_SALE_QUANTUM_RESPONSE
            l_get_categories_max_sale_quantum_request: GET_CATEGORIES_MAX_SALE_QUANTUM_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_get_categories_max_sale_quantum_request

            -- l_response := api.categories_max_sale_quantum(l_get_categories_max_sale_quantum_request)
            assert ("not_implemented", False)
        end

    test_categories_tree
            -- Дерево категорий
            --
            -- Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_CATEGORIES_RESPONSE
            l_get_categories_request: GET_CATEGORIES_REQUEST
        do
            -- TODO: Initialize required params.

            -- l_response := api.categories_tree(l_get_categories_request)
            assert ("not_implemented", False)
        end

    test_category_content_parameters
            -- Списки характеристик товаров по категориям
            --
            -- Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
        local
            l_response: GET_CATEGORY_CONTENT_PARAMETERS_RESPONSE
            l_category_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_category_id

            -- l_response := api.category_content_parameters(l_category_id)
            assert ("not_implemented", False)
        end

    test_chat_history
            -- Получение истории сообщений в чате
            --
            -- Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_CHAT_HISTORY_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_get_chat_history_request: GET_CHAT_HISTORY_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_get_chat_history_request

            -- l_response := api.chat_history(l_business_id, l_chat_id, l_get_chat_history_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_chats
            -- Получение доступных чатов
            --
            -- Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_CHATS_RESPONSE
            l_business_id: INTEGER_64
            l_get_chats_request: GET_CHATS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_chats_request

            -- l_response := api.chats(l_business_id, l_get_chats_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_confirm_business_prices
            -- Удаление товара из карантина по цене в кабинете
            --
            -- Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_confirm_prices_request: CONFIRM_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_confirm_prices_request

            -- l_response := api.confirm_business_prices(l_business_id, l_confirm_prices_request)
            assert ("not_implemented", False)
        end

    test_confirm_campaign_prices
            -- Удаление товара из карантина по цене в магазине
            --
            -- Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_confirm_prices_request: CONFIRM_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_confirm_prices_request

            -- l_response := api.confirm_campaign_prices(l_campaign_id, l_confirm_prices_request)
            assert ("not_implemented", False)
        end

    test_create_chat
            -- Создание нового чата с покупателем
            --
            -- Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: CREATE_CHAT_RESPONSE
            l_business_id: INTEGER_64
            l_create_chat_request: CREATE_CHAT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_chat_request

            -- l_response := api.create_chat(l_business_id, l_create_chat_request)
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

    test_delete_goods_feedback_comment
            -- Удаление комментария к отзыву
            --
            -- Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_delete_goods_feedback_comment_request: DELETE_GOODS_FEEDBACK_COMMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_goods_feedback_comment_request

            -- l_response := api.delete_goods_feedback_comment(l_business_id, l_delete_goods_feedback_comment_request)
            assert ("not_implemented", False)
        end

    test_delete_hidden_offers
            -- Возобновление показа товаров
            --
            -- Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_delete_hidden_offers_request: DELETE_HIDDEN_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_delete_hidden_offers_request

            -- l_response := api.delete_hidden_offers(l_campaign_id, l_delete_hidden_offers_request)
            assert ("not_implemented", False)
        end

    test_delete_offers
            -- Удаление товаров из каталога
            --
            -- Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: DELETE_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_delete_offers_request: DELETE_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_offers_request

            -- l_response := api.delete_offers(l_business_id, l_delete_offers_request)
            assert ("not_implemented", False)
        end

    test_delete_offers_from_archive
            -- Удаление товаров из архива
            --
            -- Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: DELETE_OFFERS_FROM_ARCHIVE_RESPONSE
            l_business_id: INTEGER_64
            l_delete_offers_from_archive_request: DELETE_OFFERS_FROM_ARCHIVE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_offers_from_archive_request

            -- l_response := api.delete_offers_from_archive(l_business_id, l_delete_offers_from_archive_request)
            assert ("not_implemented", False)
        end

    test_delete_promo_offers
            -- Удаление товаров из акции
            --
            -- Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: DELETE_PROMO_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_delete_promo_offers_request: DELETE_PROMO_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_promo_offers_request

            -- l_response := api.delete_promo_offers(l_business_id, l_delete_promo_offers_request)
            assert ("not_implemented", False)
        end

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

    test_feedback_and_comment_updates
            -- Новые и обновленные отзывы о магазине
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GET_FEEDBACK_LIST_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_from_date: DATE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.feedback_and_comment_updates(l_campaign_id, l_page_token, l_limit, l_from_date)
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

    test_fulfillment_warehouses
            -- Идентификаторы складов Маркета (FBY)
            --
            -- Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: GET_FULFILLMENT_WAREHOUSES_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.fulfillment_warehouses
            assert ("not_implemented", False)
        end

    test_generate_boost_consolidated_report
            -- Отчет по бусту продаж
            --
            -- Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_boost_consolidated_request: GENERATE_BOOST_CONSOLIDATED_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_boost_consolidated_request

            -- l_response := api.generate_boost_consolidated_report(l_generate_boost_consolidated_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_competitors_position_report
            -- Отчет «Конкурентная позиция»
            --
            -- Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_competitors_position_report_request: GENERATE_COMPETITORS_POSITION_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_competitors_position_report_request

            -- l_response := api.generate_competitors_position_report(l_generate_competitors_position_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_feedback_report
            -- Отчет по отзывам о товарах
            --
            -- Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_feedback_request: GENERATE_GOODS_FEEDBACK_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_feedback_request

            -- l_response := api.generate_goods_feedback_report(l_generate_goods_feedback_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_movement_report
            -- Отчет по движению товаров
            --
            -- Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_movement_report_request: GENERATE_GOODS_MOVEMENT_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_movement_report_request

            -- l_response := api.generate_goods_movement_report(l_generate_goods_movement_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_realization_report
            -- Отчет по реализации
            --
            -- Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_realization_report_request: GENERATE_GOODS_REALIZATION_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_realization_report_request

            -- l_response := api.generate_goods_realization_report(l_generate_goods_realization_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_turnover_report
            -- Отчет по оборачиваемости
            --
            -- Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_turnover_request: GENERATE_GOODS_TURNOVER_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_turnover_request

            -- l_response := api.generate_goods_turnover_report(l_generate_goods_turnover_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_prices_report
            -- Отчет «Цены на рынке»
            --
            -- Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_prices_report_request: GENERATE_PRICES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_prices_report_request

            -- l_response := api.generate_prices_report(l_generate_prices_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_shelfs_statistics_report
            -- Отчет по полкам
            --
            -- Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_shelfs_statistics_request: GENERATE_SHELFS_STATISTICS_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_shelfs_statistics_request

            -- l_response := api.generate_shelfs_statistics_report(l_generate_shelfs_statistics_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_shows_sales_report
            -- Отчет «Аналитика продаж»
            --
            -- Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_shows_sales_report_request: GENERATE_SHOWS_SALES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_shows_sales_report_request

            -- l_response := api.generate_shows_sales_report(l_generate_shows_sales_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_stocks_on_warehouses_report
            -- Отчет по остаткам на складах
            --
            -- Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_stocks_on_warehouses_report_request: GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_stocks_on_warehouses_report_request

            -- l_response := api.generate_stocks_on_warehouses_report(l_generate_stocks_on_warehouses_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_marketplace_services_report
            -- Отчет по стоимости услуг
            --
            -- Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_marketplace_services_report_request: GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_marketplace_services_report_request

            -- l_response := api.generate_united_marketplace_services_report(l_generate_united_marketplace_services_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_netting_report
            -- Отчет по платежам
            --
            -- Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_netting_report_request: GENERATE_UNITED_NETTING_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_netting_report_request

            -- l_response := api.generate_united_netting_report(l_generate_united_netting_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_orders_report
            -- Отчет по заказам
            --
            -- Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_orders_request: GENERATE_UNITED_ORDERS_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_orders_request

            -- l_response := api.generate_united_orders_report(l_generate_united_orders_request, l_format)
            assert ("not_implemented", False)
        end

    test_goods_feedback_comments
            -- Получение комментариев к отзыву
            --
            -- Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_GOODS_FEEDBACK_COMMENTS_RESPONSE
            l_business_id: INTEGER_64
            l_get_goods_feedback_comments_request: GET_GOODS_FEEDBACK_COMMENTS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_goods_feedback_comments_request

            -- l_response := api.goods_feedback_comments(l_business_id, l_get_goods_feedback_comments_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_goods_feedbacks
            -- Получение отзывов о товарах продавца
            --
            -- Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_GOODS_FEEDBACK_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_goods_feedback_request: GET_GOODS_FEEDBACK_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.goods_feedbacks(l_business_id, l_page_token, l_limit, l_get_goods_feedback_request)
            assert ("not_implemented", False)
        end

    test_goods_stats
            -- Отчет по товарам
            --
            -- Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: GET_GOODS_STATS_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_goods_stats_request: GET_GOODS_STATS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_goods_stats_request

            -- l_response := api.goods_stats(l_campaign_id, l_get_goods_stats_request)
            assert ("not_implemented", False)
        end

    test_hidden_offers
            -- Информация о скрытых вами товарах
            --
            -- Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
        local
            l_response: GET_HIDDEN_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_offer_id: LIST [STRING_32]
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.hidden_offers(l_campaign_id, l_offer_id, l_page_token, l_limit, l_offset, l_page, l_page_size)
            assert ("not_implemented", False)
        end

    test_offer_cards_content_status
            -- Получение информации о заполненности карточек магазина
            --
            -- Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
        local
            l_response: GET_OFFER_CARDS_CONTENT_STATUS_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_offer_cards_content_status_request: GET_OFFER_CARDS_CONTENT_STATUS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.offer_cards_content_status(l_business_id, l_page_token, l_limit, l_get_offer_cards_content_status_request)
            assert ("not_implemented", False)
        end

    test_offer_mapping_entries
            -- Список товаров в каталоге
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
        local
            l_response: GET_OFFER_MAPPING_ENTRIES_RESPONSE
            l_campaign_id: INTEGER_64
            l_offer_id: LIST [STRING_32]
            l_shop_sku: LIST [STRING_32]
            l_mapping_kind: OFFER_MAPPING_KIND_TYPE
            l_status: LIST [OFFER_PROCESSING_STATUS_TYPE]
            l_availability: LIST [OFFER_AVAILABILITY_STATUS_TYPE]
            l_category_id: LIST [INTEGER_32]
            l_vendor: LIST [STRING_32]
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.offer_mapping_entries(l_campaign_id, l_offer_id, l_shop_sku, l_mapping_kind, l_status, l_availability, l_category_id, l_vendor, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_offer_mappings
            -- Информация о товарах в каталоге
            --
            -- Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: GET_OFFER_MAPPINGS_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_offer_mappings_request: GET_OFFER_MAPPINGS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.offer_mappings(l_business_id, l_page_token, l_limit, l_get_offer_mappings_request)
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

    test_order
            -- Информация об одном заказе
            --
            -- Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: GET_ORDER_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.order(l_campaign_id, l_order_id)
            assert ("not_implemented", False)
        end

    test_order_business_buyer_info
            -- Информация о покупателе — юридическом лице
            --
            -- Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
        local
            l_response: GET_BUSINESS_BUYER_INFO_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.order_business_buyer_info(l_campaign_id, l_order_id)
            assert ("not_implemented", False)
        end

    test_order_business_documents_info
            -- Информация о документах
            --
            -- Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
        local
            l_response: GET_BUSINESS_DOCUMENTS_INFO_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.order_business_documents_info(l_campaign_id, l_order_id)
            assert ("not_implemented", False)
        end

    test_orders
            -- Информация о нескольких заказах
            --
            -- Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: GET_ORDERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_ids: LIST [INTEGER_64]
            l_status: LIST [ORDER_STATUS_TYPE]
            l_substatus: LIST [ORDER_SUBSTATUS_TYPE]
            l_from_date: DATE
            l_to_date: DATE
            l_supplier_shipment_date_from: DATE
            l_supplier_shipment_date_to: DATE
            l_updated_at_from: DATE_TIME
            l_updated_at_to: DATE_TIME
            l_dispatch_type: ORDER_DELIVERY_DISPATCH_TYPE
            l_fake: BOOLEAN
            l_has_cis: BOOLEAN
            l_only_waiting_for_cancellation_approve: BOOLEAN
            l_only_estimated_delivery: BOOLEAN
            l_buyer_type: ORDER_BUYER_TYPE
            l_page: INTEGER_32
            l_page_size: INTEGER_32
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.orders(l_campaign_id, l_order_ids, l_status, l_substatus, l_from_date, l_to_date, l_supplier_shipment_date_from, l_supplier_shipment_date_to, l_updated_at_from, l_updated_at_to, l_dispatch_type, l_fake, l_has_cis, l_only_waiting_for_cancellation_approve, l_only_estimated_delivery, l_buyer_type, l_page, l_page_size, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_orders_stats
            -- Детальная информация по заказам
            --
            -- Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: GET_ORDERS_STATS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_orders_stats_request: GET_ORDERS_STATS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.orders_stats(l_campaign_id, l_page_token, l_limit, l_get_orders_stats_request)
            assert ("not_implemented", False)
        end

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

    test_promo_offers
            -- Получение списка товаров, которые участвуют или могут участвовать в акции
            --
            -- Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_PROMO_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_get_promo_offers_request: GET_PROMO_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_promo_offers_request

            -- l_response := api.promo_offers(l_business_id, l_get_promo_offers_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_promos
            -- Получение списка акций
            --
            -- Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_PROMOS_RESPONSE
            l_business_id: INTEGER_64
            l_get_promos_request: GET_PROMOS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.promos(l_business_id, l_get_promos_request)
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

    test_quality_ratings
            -- Индекс качества магазинов
            --
            -- Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_QUALITY_RATING_RESPONSE
            l_business_id: INTEGER_64
            l_get_quality_rating_request: GET_QUALITY_RATING_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_quality_rating_request

            -- l_response := api.quality_ratings(l_business_id, l_get_quality_rating_request)
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

    test_report_info
            -- Получение заданного отчета
            --
            -- Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: GET_REPORT_INFO_RESPONSE
            l_report_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_report_id

            -- l_response := api.report_info(l_report_id)
            assert ("not_implemented", False)
        end

    test_return
            -- Информация о невыкупе или возврате
            --
            -- Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: GET_RETURN_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_return_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_return_id

            -- l_response := api.return(l_campaign_id, l_order_id, l_return_id)
            assert ("not_implemented", False)
        end

    test_return_photo
            -- Получение фотографии возврата
            --
            -- Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_return_id: INTEGER_64
            l_item_id: INTEGER_64
            l_image_hash: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_return_id
            -- l_item_id
            -- l_image_hash

            -- l_response := api.return_photo(l_campaign_id, l_order_id, l_return_id, l_item_id, l_image_hash)
            assert ("not_implemented", False)
        end

    test_returns
            -- Список невыкупов и возвратов
            --
            -- Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: GET_RETURNS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_order_ids: LIST [INTEGER_64]
            l_statuses: LIST [REFUND_STATUS_TYPE]
            l_type: RETURN_TYPE
            l_from_date: DATE
            l_to_date: DATE
            l_from_date2: DATE
            l_to_date2: DATE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.returns(l_campaign_id, l_page_token, l_limit, l_order_ids, l_statuses, l_type, l_from_date, l_to_date, l_from_date2, l_to_date2)
            assert ("not_implemented", False)
        end

    test_search_region_children
            -- Информация о дочерних регионах
            --
            -- Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGION_WITH_CHILDREN_RESPONSE
            l_region_id: INTEGER_64
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_region_id

            -- l_response := api.search_region_children(l_region_id, l_page, l_page_size)
            assert ("not_implemented", False)
        end

    test_search_regions_by_id
            -- Информация о регионе
            --
            -- Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGIONS_RESPONSE
            l_region_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_region_id

            -- l_response := api.search_regions_by_id(l_region_id)
            assert ("not_implemented", False)
        end

    test_search_regions_by_name
            -- Поиск регионов по их имени
            --
            -- Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGIONS_RESPONSE
            l_name: STRING_32
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_name

            -- l_response := api.search_regions_by_name(l_name, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_send_file_to_chat
            -- Отправка файла в чат
            --
            -- Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_file: FILE
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_file

            -- l_response := api.send_file_to_chat(l_business_id, l_chat_id, l_file)
            assert ("not_implemented", False)
        end

    test_send_message_to_chat
            -- Отправка сообщения в чат
            --
            -- Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_send_message_to_chat_request: SEND_MESSAGE_TO_CHAT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_send_message_to_chat_request

            -- l_response := api.send_message_to_chat(l_business_id, l_chat_id, l_send_message_to_chat_request)
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

    test_skip_goods_feedbacks_reaction
            -- Отказ от ответа на отзывы
            --
            -- Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_skip_goods_feedback_reaction_request: SKIP_GOODS_FEEDBACK_REACTION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_skip_goods_feedback_reaction_request

            -- l_response := api.skip_goods_feedbacks_reaction(l_business_id, l_skip_goods_feedback_reaction_request)
            assert ("not_implemented", False)
        end

    test_stocks
            -- Информация об остатках и оборачиваемости
            --
            -- Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
        local
            l_response: GET_WAREHOUSE_STOCKS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_warehouse_stocks_request: GET_WAREHOUSE_STOCKS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.stocks(l_campaign_id, l_page_token, l_limit, l_get_warehouse_stocks_request)
            assert ("not_implemented", False)
        end

    test_suggested_offer_mapping_entries
            -- Рекомендованные карточки для товаров
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
        local
            l_response: GET_SUGGESTED_OFFER_MAPPING_ENTRIES_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_suggested_offer_mapping_entries_request: GET_SUGGESTED_OFFER_MAPPING_ENTRIES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_suggested_offer_mapping_entries_request

            -- l_response := api.suggested_offer_mapping_entries(l_campaign_id, l_get_suggested_offer_mapping_entries_request)
            assert ("not_implemented", False)
        end

    test_suggested_offer_mappings
            -- Просмотр карточек на Маркете, которые подходят вашим товарам
            --
            -- Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
        local
            l_response: GET_SUGGESTED_OFFER_MAPPINGS_RESPONSE
            l_business_id: INTEGER_64
            l_get_suggested_offer_mappings_request: GET_SUGGESTED_OFFER_MAPPINGS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.suggested_offer_mappings(l_business_id, l_get_suggested_offer_mappings_request)
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

    test_update_goods_feedback_comment
            -- Добавление нового или изменение созданного комментария
            --
            -- Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: UPDATE_GOODS_FEEDBACK_COMMENT_RESPONSE
            l_business_id: INTEGER_64
            l_update_goods_feedback_comment_request: UPDATE_GOODS_FEEDBACK_COMMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_goods_feedback_comment_request

            -- l_response := api.update_goods_feedback_comment(l_business_id, l_update_goods_feedback_comment_request)
            assert ("not_implemented", False)
        end

    test_update_offer_content
            -- Редактирование категорийных характеристик товара
            --
            -- Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: UPDATE_OFFER_CONTENT_RESPONSE
            l_business_id: INTEGER_64
            l_update_offer_content_request: UPDATE_OFFER_CONTENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_offer_content_request

            -- l_response := api.update_offer_content(l_business_id, l_update_offer_content_request)
            assert ("not_implemented", False)
        end

    test_update_offer_mapping_entries
            -- Добавление и редактирование товаров в каталоге
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_update_offer_mapping_entry_request: UPDATE_OFFER_MAPPING_ENTRY_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_update_offer_mapping_entry_request

            -- l_response := api.update_offer_mapping_entries(l_campaign_id, l_update_offer_mapping_entry_request)
            assert ("not_implemented", False)
        end

    test_update_offer_mappings
            -- Добавление товаров в каталог и изменение информации о них
            --
            -- Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
        local
            l_response: UPDATE_OFFER_MAPPINGS_RESPONSE
            l_business_id: INTEGER_64
            l_update_offer_mappings_request: UPDATE_OFFER_MAPPINGS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_offer_mappings_request

            -- l_response := api.update_offer_mappings(l_business_id, l_update_offer_mappings_request)
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

    test_update_promo_offers
            -- Добавление товаров в акцию или изменение их цен
            --
            -- Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: UPDATE_PROMO_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_update_promo_offers_request: UPDATE_PROMO_OFFERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_promo_offers_request

            -- l_response := api.update_promo_offers(l_business_id, l_update_promo_offers_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: FBY_API
            -- Create an object instance of `FBY_API'.
        once
            create { FBY_API } Result
        end

end
