@isTest
private class OASBusinessesApiTest {
    /**
     * Настройки кабинета
     *
     * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getBusinessSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L
        };

        OASClient client;
        OASBusinessesApi api;
        OASGetBusinessSettingsResponse response;
        OASGetBusinessSettingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessesApi(client);

        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);
    }
}