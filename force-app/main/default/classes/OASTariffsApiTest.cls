@isTest
private class OASTariffsApiTest {
    /**
     * Калькулятор стоимости услуг
     *
     * Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,\nдля какого товара рассчитана стоимость услуги.\n\nОбратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.\n\nВ запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void calculateTariffsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCalculateTariffsRequest' => ''
        };

        OASClient client;
        OASTariffsApi api;
        OASCalculateTariffsResponse response;
        OASCalculateTariffsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTariffsApi(client);

        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);
    }
}