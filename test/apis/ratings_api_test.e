note
    description: "API tests for RATINGS_API"
    date: "$Date$"
    revision: "$Revision$"


class RATINGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_quality_rating_details
            -- Заказы, которые повлияли на индекс качества
            --
            -- Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
        local
            l_response: GET_QUALITY_RATING_DETAILS_RESPONSE
            l_campaign_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.quality_rating_details(l_campaign_id)
            assert ("not_implemented", False)
        end

    test_quality_ratings
            -- Индекс качества магазинов
            --
            -- Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_QUALITY_RATING_RESPONSE
            l_business_id: INTEGER_64
            l_get_quality_rating_request: GET_QUALITY_RATING_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_quality_rating_request

            -- l_response := api.quality_ratings(l_business_id, l_get_quality_rating_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: RATINGS_API
            -- Create an object instance of `RATINGS_API'.
        once
            create { RATINGS_API } Result
        end

end
