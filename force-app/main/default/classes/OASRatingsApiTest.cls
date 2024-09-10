@isTest
private class OASRatingsApiTest {
    /**
     * Заказы, которые повлияли на индекс качества
     *
     * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).\n\n|**⚙️ Лимит:** 100000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getQualityRatingDetailsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASRatingsApi api;
        OASGetQualityRatingDetailsResponse response;
        OASGetQualityRatingDetailsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRatingsApi(client);

        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Индекс качества магазинов
     *
     * Возвращает значение индекса качества магазинов и его составляющие.\n\nПодробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getQualityRatingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetQualityRatingRequest' => ''
        };

        OASClient client;
        OASRatingsApi api;
        OASGetQualityRatingResponse response;
        OASGetQualityRatingResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRatingsApi(client);

        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);
    }
}