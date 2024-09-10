note
    description: "API tests for ORDERDELIVERY_API"
    date: "$Date$"
    revision: "$Revision$"


class ORDERDELIVERY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_order_buyer_info
            -- Информация о покупателе — физическом лице
            --
            -- Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
        local
            l_response: GET_ORDER_BUYER_INFO_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.order_buyer_info(l_campaign_id, l_order_id)
            assert ("not_implemented", False)
        end

    test_set_order_delivery_date
            -- Изменение даты доставки заказа
            --
            -- Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_set_order_delivery_date_request: SET_ORDER_DELIVERY_DATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_set_order_delivery_date_request

            -- l_response := api.set_order_delivery_date(l_campaign_id, l_order_id, l_set_order_delivery_date_request)
            assert ("not_implemented", False)
        end

    test_set_order_delivery_track_code
            -- Передача трек‑номера посылки
            --
            -- {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_set_order_delivery_track_code_request: SET_ORDER_DELIVERY_TRACK_CODE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_set_order_delivery_track_code_request

            -- l_response := api.set_order_delivery_track_code(l_campaign_id, l_order_id, l_set_order_delivery_track_code_request)
            assert ("not_implemented", False)
        end

    test_update_order_storage_limit
            -- Продление срока хранения заказа
            --
            -- Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_update_order_storage_limit_request: UPDATE_ORDER_STORAGE_LIMIT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_update_order_storage_limit_request

            -- l_response := api.update_order_storage_limit(l_campaign_id, l_order_id, l_update_order_storage_limit_request)
            assert ("not_implemented", False)
        end

    test_verify_order_eac
            -- Передача кода подтверждения
            --
            -- Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: VERIFY_ORDER_EAC_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_verify_order_eac_request: VERIFY_ORDER_EAC_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_verify_order_eac_request

            -- l_response := api.verify_order_eac(l_campaign_id, l_order_id, l_verify_order_eac_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ORDERDELIVERY_API
            -- Create an object instance of `ORDERDELIVERY_API'.
        once
            create { ORDERDELIVERY_API } Result
        end

end
