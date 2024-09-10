@isTest
private class OASOutletLicensesApiTest {
    /**
     * Удаление лицензий для точек продаж
     *
     * Удаляет информацию о лицензиях для точек продаж.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void deleteOutletLicensesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'ids' => new Set<Long>{123456789L}
        };

        OASClient client;
        OASOutletLicensesApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletLicensesApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteOutletLicenses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о лицензиях для точек продаж
     *
     * Возвращает информацию о лицензиях для точек продаж.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOutletLicensesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'outletIds' => new Set<Long>{123456789L},
            'ids' => new Set<Long>{123456789L}
        };

        OASClient client;
        OASOutletLicensesApi api;
        OASGetOutletLicensesResponse response;
        OASGetOutletLicensesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletLicensesApi(client);

        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOutletLicensesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOutletLicensesResponse.getExample();
        response = (OASGetOutletLicensesResponse) api.getOutletLicenses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Создание и изменение лицензий для точек продаж
     *
     * Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.\n\nЧтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.\n\nВ течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.\n\n|**⚙️ Лимит:** 100 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOutletLicensesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateOutletLicenseRequest' => ''
        };

        OASClient client;
        OASOutletLicensesApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOutletLicensesApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOutletLicenses(params);
        System.assertEquals(expectedResponse, response);
    }
}