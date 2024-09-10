@isTest
private class OASShipmentsApiTest {
    /**
     * Подтверждение отгрузки
     *
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void confirmShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSConfirmShipmentRequest' => ''
        };

        OASClient client;
        OASShipmentsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение акта приема-передачи
     *
     * {% note warning &quot;Экспресс‑доставка&quot; %}\n\nЕсли ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.\n\n{% endnote %}\n\nЗапрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.\n\nПри формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:\n\n{% cut &quot;Данные, из которых Маркет формирует акт&quot; %}\n\n| **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         |\n| --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |\n| Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        |\n| Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |\n| Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |\n| № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |\n| № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |\n| Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |\n| Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |\n| Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |\n\n{% endcut %}\n\nОстальные поля нужно заполнить самостоятельно в распечатанном акте.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение акта расхождений
     *
     * Возвращает акт расхождений для заданной отгрузки.\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentDiscrepancyActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение фактического акта приема-передачи
     *
     * Возвращает фактический акт приема-передачи для заданной отгрузки.\n\nТакой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentInboundActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Ярлыки для доверительной приемки (FBS)
     *
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).\n\nРаспечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.\n\nКоличество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md).\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentPalletLabelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.\n\n{% note warning &quot;Экспресс‑доставка&quot; %}\n\nЕсли ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.\n\n{% endnote %}\n\nВ акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.\n\nПри формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:\n\n{% cut &quot;Данные, из которых Маркет формирует акт&quot; %}\n\n| **Данные в акте**	                                  | **Описание**                                                                                                                                                                                                                                                         |\n| --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |\n| Отправитель	                                        | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |\n| Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |\n| № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |\n| № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |\n| Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |\n| Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   |\n| Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |\n| Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |\n\n{% endcut %}\n\nОстальные поля нужно заполнить самостоятельно в распечатанном акте.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentReceptionTransferActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'warehouseId' => 123123
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение транспортной накладной
     *
     * Возвращает транспортную накладную для заданной отгрузки.\n\nТранспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentTransportationWaybillTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASShipmentsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации об одной отгрузке
     *
     * Возвращает информацию об отгрузке по ее идентификатору.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'cancelledOrders' => ''
        };

        OASClient client;
        OASShipmentsApi api;
        OASGetShipmentResponse response;
        OASGetShipmentResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getShipmentOrdersInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASShipmentsApi api;
        OASGetShipmentOrdersInfoResponse response;
        OASGetShipmentOrdersInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации о нескольких отгрузках
     *
     * Возвращает информацию об отгрузках по заданным параметрам:\n\n* дате;\n* статусу;\n* идентификаторам заказов.\n\nРезультаты возвращаются постранично.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void searchShipmentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSSearchShipmentsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASShipmentsApi api;
        OASSearchShipmentsResponse response;
        OASSearchShipmentsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача количества упаковок в отгрузке
     *
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).\n\nПолучить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md).\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void setShipmentPalletsCountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSSetShipmentPalletsCountRequest' => ''
        };

        OASClient client;
        OASShipmentsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Перенос заказов в следующую отгрузку
     *
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)\n\nИспользуйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.\n\n{% note warning &quot;Такие переносы снижают индекс качества магазина&quot; %}\n\nЭтот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)\n\n{% endnote %}\n\nПереносить заказы можно, если до формирования отгрузки осталось больше получаса.\n\nПеренос происходит не мгновенно, а занимает несколько минут.\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void transferOrdersFromShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSTransferOrdersFromShipmentRequest' => ''
        };

        OASClient client;
        OASShipmentsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASShipmentsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);
    }
}