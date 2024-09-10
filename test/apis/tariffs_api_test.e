note
    description: "API tests for TARIFFS_API"
    date: "$Date$"
    revision: "$Revision$"


class TARIFFS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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

feature {NONE} -- Implementation

    api: TARIFFS_API
            -- Create an object instance of `TARIFFS_API'.
        once
            create { TARIFFS_API } Result
        end

end
