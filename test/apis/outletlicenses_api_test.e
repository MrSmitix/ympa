note
    description: "API tests for OUTLETLICENSES_API"
    date: "$Date$"
    revision: "$Revision$"


class OUTLETLICENSES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delete_outlet_licenses
            -- Удаление лицензий для точек продаж
            --
            -- Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_ids: LIST [INTEGER_64]
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.delete_outlet_licenses(l_campaign_id, l_ids)
            assert ("not_implemented", False)
        end

    test_outlet_licenses
            -- Информация о лицензиях для точек продаж
            --
            -- Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: GET_OUTLET_LICENSES_RESPONSE
            l_campaign_id: INTEGER_64
            l_outlet_ids: LIST [INTEGER_64]
            l_ids: LIST [INTEGER_64]
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.outlet_licenses(l_campaign_id, l_outlet_ids, l_ids)
            assert ("not_implemented", False)
        end

    test_update_outlet_licenses
            -- Создание и изменение лицензий для точек продаж
            --
            -- Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_update_outlet_license_request: UPDATE_OUTLET_LICENSE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_update_outlet_license_request

            -- l_response := api.update_outlet_licenses(l_campaign_id, l_update_outlet_license_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OUTLETLICENSES_API
            -- Create an object instance of `OUTLETLICENSES_API'.
        once
            create { OUTLETLICENSES_API } Result
        end

end
