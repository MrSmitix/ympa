@isTest
private class OASFeedbacksApiTest {
    /**
     * Новые и обновленные отзывы о магазине
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает новые и обновленные отзывы о магазине на Маркете.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedbackAndCommentUpdatesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'fromDate' => Date.newInstance(1960, 2, 17)
        };

        OASClient client;
        OASFeedbacksApi api;
        OASGetFeedbackListResponse response;
        OASGetFeedbackListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFeedbacksApi(client);

        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);
    }
}