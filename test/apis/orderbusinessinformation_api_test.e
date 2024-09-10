note
    description: "API tests for ORDERBUSINESSINFORMATION_API"
    date: "$Date$"
    revision: "$Revision$"


class ORDERBUSINESSINFORMATION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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

feature {NONE} -- Implementation

    api: ORDERBUSINESSINFORMATION_API
            -- Create an object instance of `ORDERBUSINESSINFORMATION_API'.
        once
            create { ORDERBUSINESSINFORMATION_API } Result
        end

end
