note
    description: "API tests for ORDERLABELS_API"
    date: "$Date$"
    revision: "$Revision$"


class ORDERLABELS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_generate_order_label
            -- Готовый ярлык‑наклейка для коробки в заказе
            --
            -- Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_box_id: INTEGER_64
            l_format: PAGE_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id
            -- l_shipment_id
            -- l_box_id

            -- l_response := api.generate_order_label(l_campaign_id, l_order_id, l_shipment_id, l_box_id, l_format)
            assert ("not_implemented", False)
        end

    test_generate_order_labels
            -- Готовые ярлыки‑наклейки на все коробки в одном заказе
            --
            -- Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
            l_format: PAGE_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.generate_order_labels(l_campaign_id, l_order_id, l_format)
            assert ("not_implemented", False)
        end

    test_order_labels_data
            -- Данные для самостоятельного изготовления ярлыков
            --
            -- Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
        local
            l_response: GET_ORDER_LABELS_DATA_RESPONSE
            l_campaign_id: INTEGER_64
            l_order_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_order_id

            -- l_response := api.order_labels_data(l_campaign_id, l_order_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ORDERLABELS_API
            -- Create an object instance of `ORDERLABELS_API'.
        once
            create { ORDERLABELS_API } Result
        end

end
