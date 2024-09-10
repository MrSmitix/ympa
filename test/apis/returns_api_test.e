note
    description: "API tests for RETURNS_API"
    date: "$Date$"
    revision: "$Revision$"


class RETURNS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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

    test_return_application
            -- Получение заявления на возврат
            --
            -- Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_return_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_return_id

            -- l_response := api.return_application(l_campaign_id, l_order_id, l_return_id)
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

    test_set_return_decision
            -- Принятие или изменение решения по возврату
            --
            -- Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_return_id: INTEGER_64
            l_set_return_decision_request: SET_RETURN_DECISION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_return_id
            -- l_set_return_decision_request

            -- l_response := api.set_return_decision(l_campaign_id, l_order_id, l_return_id, l_set_return_decision_request)
            assert ("not_implemented", False)
        end

    test_submit_return_decision
            -- Подтверждение решения по возврату
            --
            -- Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_return_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_return_id

            -- l_response := api.submit_return_decision(l_campaign_id, l_order_id, l_return_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: RETURNS_API
            -- Create an object instance of `RETURNS_API'.
        once
            create { RETURNS_API } Result
        end

end
