note
    description: "API tests for CONTENT_API"
    date: "$Date$"
    revision: "$Revision$"


class CONTENT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_category_content_parameters
            -- Списки характеристик товаров по категориям
            --
            -- Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
        local
            l_response: GET_CATEGORY_CONTENT_PARAMETERS_RESPONSE
            l_category_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_category_id

            -- l_response := api.category_content_parameters(l_category_id)
            assert ("not_implemented", False)
        end

    test_offer_cards_content_status
            -- Получение информации о заполненности карточек магазина
            --
            -- Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
        local
            l_response: GET_OFFER_CARDS_CONTENT_STATUS_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_offer_cards_content_status_request: GET_OFFER_CARDS_CONTENT_STATUS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.offer_cards_content_status(l_business_id, l_page_token, l_limit, l_get_offer_cards_content_status_request)
            assert ("not_implemented", False)
        end

    test_update_offer_content
            -- Редактирование категорийных характеристик товара
            --
            -- Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
        local
            l_response: UPDATE_OFFER_CONTENT_RESPONSE
            l_business_id: INTEGER_64
            l_update_offer_content_request: UPDATE_OFFER_CONTENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_offer_content_request

            -- l_response := api.update_offer_content(l_business_id, l_update_offer_content_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONTENT_API
            -- Create an object instance of `CONTENT_API'.
        once
            create { CONTENT_API } Result
        end

end
