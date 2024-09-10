note
    description: "API tests for GOODSSTATS_API"
    date: "$Date$"
    revision: "$Revision$"


class GOODSSTATS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_goods_stats
            -- Отчет по товарам
            --
            -- Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: GET_GOODS_STATS_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_goods_stats_request: GET_GOODS_STATS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_goods_stats_request

            -- l_response := api.goods_stats(l_campaign_id, l_get_goods_stats_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GOODSSTATS_API
            -- Create an object instance of `GOODSSTATS_API'.
        once
            create { GOODSSTATS_API } Result
        end

end
