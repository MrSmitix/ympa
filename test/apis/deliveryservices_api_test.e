note
    description: "API tests for DELIVERYSERVICES_API"
    date: "$Date$"
    revision: "$Revision$"


class DELIVERYSERVICES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delivery_services
            -- Справочник служб доставки
            --
            -- Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
        local
            l_response: GET_DELIVERY_SERVICES_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.delivery_services
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DELIVERYSERVICES_API
            -- Create an object instance of `DELIVERYSERVICES_API'.
        once
            create { DELIVERYSERVICES_API } Result
        end

end
