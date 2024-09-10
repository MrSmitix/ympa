note
    description: "API tests for SHIPMENTS_API"
    date: "$Date$"
    revision: "$Revision$"


class SHIPMENTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_confirm_shipment
            -- Подтверждение отгрузки
            --
            -- Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_confirm_shipment_request: CONFIRM_SHIPMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.confirm_shipment(l_campaign_id, l_shipment_id, l_confirm_shipment_request)
            assert ("not_implemented", False)
        end

    test_download_shipment_act
            -- Получение акта приема-передачи
            --
            -- {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.download_shipment_act(l_campaign_id, l_shipment_id)
            assert ("not_implemented", False)
        end

    test_download_shipment_discrepancy_act
            -- Получение акта расхождений
            --
            -- Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.download_shipment_discrepancy_act(l_campaign_id, l_shipment_id)
            assert ("not_implemented", False)
        end

    test_download_shipment_inbound_act
            -- Получение фактического акта приема-передачи
            --
            -- Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.download_shipment_inbound_act(l_campaign_id, l_shipment_id)
            assert ("not_implemented", False)
        end

    test_download_shipment_pallet_labels
            -- Ярлыки для доверительной приемки (FBS)
            --
            -- PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_format: SHIPMENT_PALLET_LABEL_PAGE_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.download_shipment_pallet_labels(l_campaign_id, l_shipment_id, l_format)
            assert ("not_implemented", False)
        end

    test_download_shipment_reception_transfer_act
            -- Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
            --
            -- Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_warehouse_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.download_shipment_reception_transfer_act(l_campaign_id, l_warehouse_id)
            assert ("not_implemented", False)
        end

    test_download_shipment_transportation_waybill
            -- Получение транспортной накладной
            --
            -- Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: FILE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.download_shipment_transportation_waybill(l_campaign_id, l_shipment_id)
            assert ("not_implemented", False)
        end

    test_search_shipments
            -- Получение информации о нескольких отгрузках
            --
            -- Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: SEARCH_SHIPMENTS_RESPONSE
            l_campaign_id: INTEGER_64
            l_search_shipments_request: SEARCH_SHIPMENTS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_search_shipments_request

            -- l_response := api.search_shipments(l_campaign_id, l_search_shipments_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_set_shipment_pallets_count
            -- Передача количества упаковок в отгрузке
            --
            -- Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_set_shipment_pallets_count_request: SET_SHIPMENT_PALLETS_COUNT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id
            -- l_set_shipment_pallets_count_request

            -- l_response := api.set_shipment_pallets_count(l_campaign_id, l_shipment_id, l_set_shipment_pallets_count_request)
            assert ("not_implemented", False)
        end

    test_shipment
            -- Получение информации об одной отгрузке
            --
            -- Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GET_SHIPMENT_RESPONSE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_cancelled_orders: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.shipment(l_campaign_id, l_shipment_id, l_cancelled_orders)
            assert ("not_implemented", False)
        end

    test_shipment_orders_info
            -- Получение информации о возможности печати ярлыков (FBS)
            --
            -- Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GET_SHIPMENT_ORDERS_INFO_RESPONSE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id

            -- l_response := api.shipment_orders_info(l_campaign_id, l_shipment_id)
            assert ("not_implemented", False)
        end

    test_transfer_orders_from_shipment
            -- Перенос заказов в следующую отгрузку
            --
            -- Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_campaign_id: INTEGER_64
            l_shipment_id: INTEGER_64
            l_transfer_orders_from_shipment_request: TRANSFER_ORDERS_FROM_SHIPMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_shipment_id
            -- l_transfer_orders_from_shipment_request

            -- l_response := api.transfer_orders_from_shipment(l_campaign_id, l_shipment_id, l_transfer_orders_from_shipment_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SHIPMENTS_API
            -- Create an object instance of `SHIPMENTS_API'.
        once
            create { SHIPMENTS_API } Result
        end

end
