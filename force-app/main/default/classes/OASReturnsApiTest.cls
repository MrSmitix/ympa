@isTest
private class OASReturnsApiTest {
    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L
        };

        OASClient client;
        OASReturnsApi api;
        OASGetReturnResponse response;
        OASGetReturnResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnApplicationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L
        };

        OASClient client;
        OASReturnsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnPhotoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L,
            'itemId' => 2147483648L,
            'imageHash' => 'null'
        };

        OASClient client;
        OASReturnsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.\n\nЧтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'orderIds' => new List<Long>{123543L},
            'statuses' => STARTED_BY_USER,WAITING_FOR_DECISION,
            'type' => '',
            'fromDate' => 2022-10-31,
            'toDate' => 2022-11-30,
            'fromDate2' => 2022-10-31,
            'toDate2' => 2022-11-30
        };

        OASClient client;
        OASReturnsApi api;
        OASGetReturnsResponse response;
        OASGetReturnsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Принятие или изменение решения по возврату
     *
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setReturnDecisionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L,
            'oaSSetReturnDecisionRequest' => ''
        };

        OASClient client;
        OASReturnsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setReturnDecision(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подтверждение решения по возврату
     *
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void submitReturnDecisionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L
        };

        OASClient client;
        OASReturnsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReturnsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.submitReturnDecision(params);
        System.assertEquals(expectedResponse, response);
    }
}