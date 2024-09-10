@isTest
private class OASOfferMappingsApiTest {
    /**
     * Список товаров в каталоге
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).\n\n{% endnote %}\n\nДля каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:\n\n* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.\n* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.\n\nРезультаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.\n\n{% note info %}\n\nКоличество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)\n
     */
    @isTest
    private static void getOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'offerId' => new List<String>{''},
            'shopSku' => new List<String>{''},
            'mappingKind' => '',
            'status' => new List<OASOfferProcessingStatusType>{OASOfferProcessingStatusType.getExample()},
            'availability' => new List<OASOfferAvailabilityStatusType>{OASOfferAvailabilityStatusType.getExample()},
            'categoryId' => new List<Integer>{0},
            'vendor' => new List<String>{''},
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASOfferMappingsApi api;
        OASGetOfferMappingEntriesResponse response;
        OASGetOfferMappingEntriesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOfferMappingsApi(client);

        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Рекомендованные карточки для товаров
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).\n\n{% endnote %}\n\nВозвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.\n\nКаждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:\n\n##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##\n\nЧтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.\n\nПолученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).\n\nВ одном запросе можно получить не более 500 рекомендаций.\n\n|**⚙️ Лимит:** 100 000 рекомендаций в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetSuggestedOfferMappingEntriesRe' => ''
        };

        OASClient client;
        OASOfferMappingsApi api;
        OASGetSuggestedOfferMappingEntriesRe response;
        OASGetSuggestedOfferMappingEntriesRe expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOfferMappingsApi(client);

        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление и редактирование товаров в каталоге
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).\n\n{% endnote %}\n\nДобавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.\n\nИнформацию о товарах нужно передать в теле POST-запроса.\n\nУ каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:\n\n* Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге.\n* Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.\n\nВ обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.\n\nЕсли вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).\n\nПеред публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).\n\nВ одном запросе можно добавить не более 500 товаров.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5 000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateOfferMappingEntryRequest' => ''
        };

        OASClient client;
        OASOfferMappingsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOfferMappingsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }
}