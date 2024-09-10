@isTest
private class OASPricesApiTest {
    /**
     * Список цен
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).\n\n{% endnote %}\n\nВозвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.\n\n{% note info %}\n\nОбщее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.\n\n{% endnote %}\n\nСпособы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).\n\n|**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки|\n|-|\n
     */
    @isTest
    private static void getPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'archived' => ''
        };

        OASClient client;
        OASPricesApi api;
        OASGetPricesResponse response;
        OASGetPricesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPricesApi(client);

        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Просмотр цен на указанные товары в магазине
     *
     * Возвращает список цен на указанные товары в магазине.\n\n{% note warning &quot;Метод только для отдельных магазинов&quot; %}\n\nИспользуйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.\n\nДля просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25)\n
     */
    @isTest
    private static void getPricesByOfferIdsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetPricesByOfferIdsRequest' => ''
        };

        OASClient client;
        OASPricesApi api;
        OASGetPricesByOfferIdsResponse response;
        OASGetPricesByOfferIdsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPricesApi(client);

        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Цены для продвижения товаров
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).\n\n{% endnote %}\n\n{% note warning &quot;&quot; %}\n\nЭтот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.\n\n{% endnote %}\n\nВозвращает цены для продвижения товаров, которые вы размещаете на Маркете.\n\nТовары, для которых нужно получить цены, передаются в теле POST-запроса.\n\nЦены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.\n\nВыходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.\n\nУстановить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.\n\nПодробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).\n\n|**⚙️ Лимит:** 100 000 товаров в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSSuggestPricesRequest' => ''
        };

        OASClient client;
        OASPricesApi api;
        OASSuggestPricesResponse response;
        OASSuggestPricesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPricesApi(client);

        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Установка цен на товары во всех магазинах
     *
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void updateBusinessPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateBusinessPricesRequest' => ''
        };

        OASClient client;
        OASPricesApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPricesApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Установка цен на товары в конкретном магазине
     *
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).\n\n{% note warning &quot;Метод только для отдельных магазинов&quot; %}\n\nИспользуйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.\n\nДля управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).\n\n{% endnote %}\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updatePricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdatePricesRequest' => ''
        };

        OASClient client;
        OASPricesApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPricesApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);
    }
}