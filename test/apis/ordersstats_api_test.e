note
    description: "API tests for ORDERSSTATS_API"
    date: "$Date$"
    revision: "$Revision$"


class ORDERSSTATS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_orders_stats
            -- Детальная информация по заказам
            --
            -- Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: GET_ORDERS_STATS_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_orders_stats_request: GET_ORDERS_STATS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.orders_stats(l_campaign_id, l_page_token, l_limit, l_get_orders_stats_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ORDERSSTATS_API
            -- Create an object instance of `ORDERSSTATS_API'.
        once
            create { ORDERSSTATS_API } Result
        end

end
