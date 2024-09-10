@isTest
private class OASContentApiTest {
    /**
     * Списки характеристик товаров по категориям
     *
     * Возвращает список характеристик с допустимыми значениями для заданной категории.\n\n|**⚙️ Лимит:** 50 категорий в минуту |\n|-|\n
     */
    @isTest
    private static void getCategoryContentParametersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'categoryId' => 2147483648L
        };

        OASClient client;
        OASContentApi api;
        OASGetCategoryContentParametersRespo response;
        OASGetCategoryContentParametersRespo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContentApi(client);

        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации о заполненности карточек магазина
     *
     * Возвращает сведения о состоянии контента для заданных товаров:\n\n* создана ли карточка товара и в каком она статусе;\n* заполненность карточки в процентах;\n* переданные характеристики товаров;\n* есть ли ошибки или предупреждения, связанные с контентом;\n* рекомендации по заполнению карточки.\n\n|**⚙️ Лимит:** 600 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getOfferCardsContentStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOfferCardsContentStatusRequest' => ''
        };

        OASClient client;
        OASContentApi api;
        OASGetOfferCardsContentStatusRespons response;
        OASGetOfferCardsContentStatusRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContentApi(client);

        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Редактирование категорийных характеристик товара
     *
     * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.\n\n{% note warning &quot;Здесь только то, что относится к конкретной категории&quot; %}\n\nЕсли вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).\n\n{% endnote %}\n\nЧтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateOfferContentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateOfferContentRequest' => ''
        };

        OASClient client;
        OASContentApi api;
        OASUpdateOfferContentResponse response;
        OASUpdateOfferContentResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContentApi(client);

        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);
    }
}