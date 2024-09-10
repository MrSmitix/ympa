note
    description: "API tests for PROMOS_API"
    date: "$Date$"
    revision: "$Revision$"


class PROMOS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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

    api: PROMOS_API
            -- Create an object instance of `PROMOS_API'.
        once
            create { PROMOS_API } Result
        end

end
