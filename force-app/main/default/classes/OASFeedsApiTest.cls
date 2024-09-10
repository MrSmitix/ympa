@isTest
private class OASFeedsApiTest {
    /**
     * Информация о прайс-листе
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L
        };

        OASClient client;
        OASFeedsApi api;
        OASGetFeedResponse response;
        OASGetFeedResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedsApi(client);

        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.\n\nДанные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedIndexLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'r_limit' => 20,
            'publishedTimeFrom' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'publishedTimeTo' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'status' => ''
        };

        OASClient client;
        OASFeedsApi api;
        OASGetFeedIndexLogsResponse response;
        OASGetFeedIndexLogsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedsApi(client);

        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список прайс-листов магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFeedsApi api;
        OASGetFeedsResponse response;
        OASGetFeedsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedsApi(client);

        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.\n1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.\n2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;.\n3. Маркет начинает обновление данных магазина на сервисе.\n\n{% note alert %}\n\nЗапрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|\n|-|\n
     */
    @isTest
    private static void refreshFeedTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L
        };

        OASClient client;
        OASFeedsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет магазину изменить параметры прайс-листа.\n\nЧтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).\n\nЧтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).\n\n|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|\n|-|\n
     */
    @isTest
    private static void setFeedParamsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'oaSSetFeedParamsRequest' => ''
        };

        OASClient client;
        OASFeedsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);
    }
}