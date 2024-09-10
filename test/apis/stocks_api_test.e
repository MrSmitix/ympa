note
    description: "API tests for STOCKS_API"
    date: "$Date$"
    revision: "$Revision$"


class STOCKS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_stocks
            -- Информация об остатках и оборачиваемости
            --
            -- Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
        local
            l_response: GET_WAREHOUSE_STOCKS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_warehouse_stocks_request: GET_WAREHOUSE_STOCKS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.stocks(l_campaign_id, l_page_token, l_limit, l_get_warehouse_stocks_request)
            assert ("not_implemented", False)
        end

    test_update_stocks
            -- Передача информации об остатках
            --
            -- Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_update_stocks_request: UPDATE_STOCKS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_update_stocks_request

            -- l_response := api.update_stocks(l_campaign_id, l_update_stocks_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: STOCKS_API
            -- Create an object instance of `STOCKS_API'.
        once
            create { STOCKS_API } Result
        end

end
