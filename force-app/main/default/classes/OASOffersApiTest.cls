@isTest
private class OASOffersApiTest {
    /**
     * Удаление товаров из ассортимента магазина
     *
     * Удаляет заданные товары из заданного магазина.\n\n{% note warning &quot;Запрос удаляет товары именно из конкретного магазина&quot; %}\n\nНа продажи в других магазинах и на наличие товара в общем каталоге он не влияет.\n\n{% endnote %}\n\nТовар не получится удалить, если он хранится на складах Маркета.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void deleteCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSDeleteCampaignOffersRequest' => ''
        };

        OASClient client;
        OASOffersApi api;
        OASDeleteCampaignOffersResponse response;
        OASDeleteCampaignOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Все предложения магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.\n\nВ ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.\n\n{% note info %}\n\nКоличество предложений считается по данным за последние семь дней (не включая сегодня).\n\nДля новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)\n
     */
    @isTest
    private static void getAllOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'chunk' => ''
        };

        OASClient client;
        OASOffersApi api;
        OASGetAllOffersResponse response;
        OASGetAllOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о товарах, которые размещены в заданном магазине
     *
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void getCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetCampaignOffersRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASOffersApi api;
        OASGetCampaignOffersResponse response;
        OASGetCampaignOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Рекомендации Маркета, касающиеся цен
     *
     * Метод возвращает рекомендации нескольких типов.\n\n**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**\n\nПоказывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)\n\n**2. Оценка привлекательности цен на витрине.**\n\nПривлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)\n\nВ запросе можно использовать фильтры.\n\nРезультаты возвращаются постранично.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getOfferRecommendationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetOfferRecommendationsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASOffersApi api;
        OASGetOfferRecommendationsResponse response;
        OASGetOfferRecommendationsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Предложения магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.\n\nПоиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.\n\nВ ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.\n\n{% note info %}\n\nИз-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.\n\nВ связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.\n\n{% endnote %}\n\n{% note info %}\n\nКоличество предложений считается по данным за последние семь дней (не включая сегодня).\n\nДля новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)\n
     */
    @isTest
    private static void getOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'query' => 'null',
            'feedId' => 2147483648L,
            'shopCategoryId' => 'null',
            'r_currency' => '',
            'matched' => '',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASOffersApi api;
        OASGetOffersResponse response;
        OASGetOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение условий продажи товаров в магазине
     *
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateCampaignOffersRequest' => ''
        };

        OASClient client;
        OASOffersApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOffersApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }
}