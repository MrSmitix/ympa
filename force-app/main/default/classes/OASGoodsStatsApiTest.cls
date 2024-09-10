@isTest
private class OASGoodsStatsApiTest {
    /**
     * Отчет по товарам
     *
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void getGoodsStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetGoodsStatsRequest' => ''
        };

        OASClient client;
        OASGoodsStatsApi api;
        OASGetGoodsStatsResponse response;
        OASGetGoodsStatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsStatsApi(client);

        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);
    }
}