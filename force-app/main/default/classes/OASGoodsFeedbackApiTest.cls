@isTest
private class OASGoodsFeedbackApiTest {
    /**
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void deleteGoodsFeedbackCommentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteGoodsFeedbackCommentRequest' => ''
        };

        OASClient client;
        OASGoodsFeedbackApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsFeedbackApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 комментариев.\n\nКомментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getGoodsFeedbackCommentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetGoodsFeedbackCommentsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASGoodsFeedbackApi api;
        OASGetGoodsFeedbackCommentsResponse response;
        OASGetGoodsFeedbackCommentsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsFeedbackApi(client);

        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 отзывов.\n\nОтзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getGoodsFeedbacksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetGoodsFeedbackRequest' => ''
        };

        OASClient client;
        OASGoodsFeedbackApi api;
        OASGetGoodsFeedbackResponse response;
        OASGetGoodsFeedbackResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsFeedbackApi(client);

        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void skipGoodsFeedbacksReactionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSSkipGoodsFeedbackReactionRequest' => ''
        };

        OASClient client;
        OASGoodsFeedbackApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsFeedbackApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.\n\nДля создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.\n\nЧтобы добавить комментарий к другому комментарию, передайте:\n\n* &#x60;feedbackId&#x60; — идентификатор отзыва;\n* &#x60;comment.parentId&#x60; — идентификатор родительского комментария.\n\nЧтобы изменить комментарий, передайте:\n\n* &#x60;feedbackId&#x60;— идентификатор отзыва;\n* &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.\n\nЕсли передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateGoodsFeedbackCommentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateGoodsFeedbackCommentRequest' => ''
        };

        OASClient client;
        OASGoodsFeedbackApi api;
        OASUpdateGoodsFeedbackCommentRespons response;
        OASUpdateGoodsFeedbackCommentRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGoodsFeedbackApi(client);

        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);
    }
}