@isTest
private class OASWarehousesApiTest {
    /**
     * Идентификаторы складов Маркета (FBY)
     *
     * Возвращает список складов Маркета с их идентификаторами.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getFulfillmentWarehousesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASWarehousesApi api;
        OASGetFulfillmentWarehousesResponse response;
        OASGetFulfillmentWarehousesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASWarehousesApi(client);

        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFulfillmentWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFulfillmentWarehousesResponse.getExample();
        response = (OASGetFulfillmentWarehousesResponse) api.getFulfillmentWarehouses();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список складов и групп складов
     *
     * Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)\n\nСреди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getWarehousesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L
        };

        OASClient client;
        OASWarehousesApi api;
        OASGetWarehousesResponse response;
        OASGetWarehousesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASWarehousesApi(client);

        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);
    }
}