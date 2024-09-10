@isTest
private class OASOrderBusinessInformationApiTest {
    /**
     * Информация о покупателе — юридическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.\n\n{% note info &quot;&quot; %}\n\nЧтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n{% endnote %}\n\nПолучить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.\n\nЕсли у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).\n\n|**⚙️ Лимит:** 3 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderBusinessBuyerInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASOrderBusinessInformationApi api;
        OASGetBusinessBuyerInfoResponse response;
        OASGetBusinessBuyerInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderBusinessInformationApi(client);

        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о документах
     *
     * Возвращает информацию о документах по идентификатору заказа.\n\nПолучить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.\n\nЕсли у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).\n\n|**⚙️ Лимит:** 3 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderBusinessDocumentsInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASOrderBusinessInformationApi api;
        OASGetBusinessDocumentsInfoResponse response;
        OASGetBusinessDocumentsInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderBusinessInformationApi(client);

        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);
    }
}