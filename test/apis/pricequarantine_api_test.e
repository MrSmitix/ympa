note
    description: "API tests for PRICEQUARANTINE_API"
    date: "$Date$"
    revision: "$Revision$"


class PRICEQUARANTINE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_business_quarantine_offers
            -- Список товаров, находящихся в карантине по цене в кабинете
            --
            -- Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
        local
            l_response: GET_QUARANTINE_OFFERS_RESPONSE
            l_business_id: INTEGER_64
            l_get_quarantine_offers_request: GET_QUARANTINE_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_quarantine_offers_request

            -- l_response := api.business_quarantine_offers(l_business_id, l_get_quarantine_offers_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_campaign_quarantine_offers
            -- Список товаров, находящихся в карантине по цене в магазине
            --
            -- Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: GET_QUARANTINE_OFFERS_RESPONSE
            l_campaign_id: INTEGER_64
            l_get_quarantine_offers_request: GET_QUARANTINE_OFFERS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_get_quarantine_offers_request

            -- l_response := api.campaign_quarantine_offers(l_campaign_id, l_get_quarantine_offers_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_confirm_business_prices
            -- Удаление товара из карантина по цене в кабинете
            --
            -- Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_confirm_prices_request: CONFIRM_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_confirm_prices_request

            -- l_response := api.confirm_business_prices(l_business_id, l_confirm_prices_request)
            assert ("not_implemented", False)
        end

    test_confirm_campaign_prices
            -- Удаление товара из карантина по цене в магазине
            --
            -- Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_confirm_prices_request: CONFIRM_PRICES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_confirm_prices_request

            -- l_response := api.confirm_campaign_prices(l_campaign_id, l_confirm_prices_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRICEQUARANTINE_API
            -- Create an object instance of `PRICEQUARANTINE_API'.
        once
            create { PRICEQUARANTINE_API } Result
        end

end
