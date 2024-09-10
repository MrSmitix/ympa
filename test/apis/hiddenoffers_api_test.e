note
    description: "API tests for HIDDENOFFERS_API"
    date: "$Date$"
    revision: "$Revision$"


class HIDDENOFFERS_API_TEST

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

feature {NONE} -- Implementation

    api: HIDDENOFFERS_API
            -- Create an object instance of `HIDDENOFFERS_API'.
        once
            create { HIDDENOFFERS_API } Result
        end

end
