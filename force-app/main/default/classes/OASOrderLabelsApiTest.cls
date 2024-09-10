@isTest
private class OASOrderLabelsApiTest {
    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateOrderLabelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'boxId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASOrderLabelsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderLabelsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).\n\nНа вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateOrderLabelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASOrderLabelsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderLabelsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderLabelsDataTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASOrderLabelsApi api;
        OASGetOrderLabelsDataResponse response;
        OASGetOrderLabelsDataResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderLabelsApi(client);

        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);
    }
}