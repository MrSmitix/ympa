@isTest
private class OASOutletsApiTest {
    /**
     * Создание точки продаж
     *
     * Создает точку продаж магазина на Маркете.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void createOutletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSChangeOutletRequest' => ''
        };

        OASClient client;
        OASOutletsApi api;
        OASCreateOutletResponse response;
        OASCreateOutletResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletsApi(client);

        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateOutletResponse.getExample();
        response = (OASCreateOutletResponse) api.createOutlet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление точки продаж
     *
     * Удаляет точку продаж магазина на Маркете.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void deleteOutletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'outletId' => 2147483648L
        };

        OASClient client;
        OASOutletsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutlet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация об одной точке продаж
     *
     * Возвращает информацию о точках продаж магазина.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOutletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'outletId' => 2147483648L
        };

        OASClient client;
        OASOutletsApi api;
        OASGetOutletResponse response;
        OASGetOutletResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletsApi(client);

        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletResponse.getExample();
        response = (OASGetOutletResponse) api.getOutlet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о нескольких точках продаж
     *
     * Возвращает список точек продаж магазина.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOutletsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'regionId' => 2147483648L,
            'shopOutletCode' => 'null',
            'regionId2' => 2147483648L
        };

        OASClient client;
        OASOutletsApi api;
        OASGetOutletsResponse response;
        OASGetOutletsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletsApi(client);

        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletsResponse.getExample();
        response = (OASGetOutletsResponse) api.getOutlets(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение информации о точке продаж
     *
     * Изменяет информацию о точке продаж магазина на Маркете.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOutletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'outletId' => 2147483648L,
            'oaSChangeOutletRequest' => ''
        };

        OASClient client;
        OASOutletsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutlet(params);
        System.assertEquals(expectedResponse, response);
    }
}