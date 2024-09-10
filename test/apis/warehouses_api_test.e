note
    description: "API tests for WAREHOUSES_API"
    date: "$Date$"
    revision: "$Revision$"


class WAREHOUSES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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

    test_warehouses
            -- Список складов и групп складов
            --
            -- Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: GET_WAREHOUSES_RESPONSE
            l_business_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.warehouses(l_business_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: WAREHOUSES_API
            -- Create an object instance of `WAREHOUSES_API'.
        once
            create { WAREHOUSES_API } Result
        end

end
