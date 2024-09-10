note
    description: "API tests for OUTLETS_API"
    date: "$Date$"
    revision: "$Revision$"


class OUTLETS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_outlet
            -- Создание точки продаж
            --
            -- Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: CREATE_OUTLET_RESPONSE
            l_campaign_id: INTEGER_64
            l_change_outlet_request: CHANGE_OUTLET_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_change_outlet_request

            -- l_response := api.create_outlet(l_campaign_id, l_change_outlet_request)
            assert ("not_implemented", False)
        end

    test_delete_outlet
            -- Удаление точки продаж
            --
            -- Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_outlet_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_outlet_id

            -- l_response := api.delete_outlet(l_campaign_id, l_outlet_id)
            assert ("not_implemented", False)
        end

    test_outlet
            -- Информация об одной точке продаж
            --
            -- Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: GET_OUTLET_RESPONSE
            l_campaign_id: INTEGER_64
            l_outlet_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_outlet_id

            -- l_response := api.outlet(l_campaign_id, l_outlet_id)
            assert ("not_implemented", False)
        end

    test_outlets
            -- Информация о нескольких точках продаж
            --
            -- Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: GET_OUTLETS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_region_id: INTEGER_64
            l_shop_outlet_code: STRING_32
            l_region_id2: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.outlets(l_campaign_id, l_page_token, l_region_id, l_shop_outlet_code, l_region_id2)
            assert ("not_implemented", False)
        end

    test_update_outlet
            -- Изменение информации о точке продаж
            --
            -- Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_outlet_id: INTEGER_64
            l_change_outlet_request: CHANGE_OUTLET_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_outlet_id
            -- l_change_outlet_request

            -- l_response := api.update_outlet(l_campaign_id, l_outlet_id, l_change_outlet_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OUTLETS_API
            -- Create an object instance of `OUTLETS_API'.
        once
            create { OUTLETS_API } Result
        end

end
