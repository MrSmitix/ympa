note
    description: "API tests for CATEGORIES_API"
    date: "$Date$"
    revision: "$Revision$"


class CATEGORIES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_categories_max_sale_quantum
            -- Лимит на установку кванта продажи и минимального количества товаров в заказе
            --
            -- Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_CATEGORIES_MAX_SALE_QUANTUM_RESPONSE
            l_get_categories_max_sale_quantum_request: GET_CATEGORIES_MAX_SALE_QUANTUM_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_get_categories_max_sale_quantum_request

            -- l_response := api.categories_max_sale_quantum(l_get_categories_max_sale_quantum_request)
            assert ("not_implemented", False)
        end

    test_categories_tree
            -- Дерево категорий
            --
            -- Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_CATEGORIES_RESPONSE
            l_get_categories_request: GET_CATEGORIES_REQUEST
        do
            -- TODO: Initialize required params.

            -- l_response := api.categories_tree(l_get_categories_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATEGORIES_API
            -- Create an object instance of `CATEGORIES_API'.
        once
            create { CATEGORIES_API } Result
        end

end
