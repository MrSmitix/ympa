@isTest
private class OASCampaignsApiTest {
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignResponse response;
        OASGetCampaignResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignLoginsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignLoginsResponse response;
        OASGetCampaignLoginsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Регион магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).\n\n{% endnote %}\n\nВозвращает регион, в котором находится магазин.\n|**⚙️ Лимит:** 5 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignRegionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignRegionResponse response;
        OASGetCampaignRegionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignSettingsResponse response;
        OASGetCampaignSettingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignsResponse response;
        OASGetCampaignsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignsByLoginTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'login' => 'null',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASCampaignsApi api;
        OASGetCampaignsResponse response;
        OASGetCampaignsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);
    }
}