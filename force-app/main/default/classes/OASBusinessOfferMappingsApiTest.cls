@isTest
private class OASBusinessOfferMappingsApiTest {
    /**
     * Добавление товаров в архив
     *
     * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.\n\n{% note warning &quot;В архив нельзя отправить товар, который хранится на складе Маркета&quot; %}\n\nВначале такой товар нужно распродать или вывезти.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void addOffersToArchiveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSAddOffersToArchiveRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASAddOffersToArchiveResponse response;
        OASAddOffersToArchiveResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товаров из каталога
     *
     * Удаляет товары из каталога.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void deleteOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteOffersRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASDeleteOffersResponse response;
        OASDeleteOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товаров из архива
     *
     * Восстанавливает товары из архива.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void deleteOffersFromArchiveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteOffersFromArchiveRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASDeleteOffersFromArchiveResponse response;
        OASDeleteOffersFromArchiveResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о товарах в каталоге
     *
     * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.\n\nМожно использовать тремя способами:\n* задать список интересующих SKU;\n* задать фильтр — в этом случае результаты возвращаются постранично;\n* не передавать тело запроса, чтобы получить список всех товаров в каталоге.\n\n|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void getOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOfferMappingsRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASGetOfferMappingsResponse response;
        OASGetOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Просмотр карточек на Маркете, которые подходят вашим товарам
     *
     * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.\n\nПользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.\n\n**Как пользоваться запросом**\n\n1. Передайте Маркету список товаров, которые нужно проверить.\n2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.\n3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;.\n4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.\n\n{% note info &quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?&quot; %}\n\n𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.\n\nНапример, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetSuggestedOfferMappingsRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASGetSuggestedOfferMappingsResponse response;
        OASGetSuggestedOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление товаров в каталог и изменение информации о них
     *
     * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.\n\nСписок категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).\n\nЧтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.\n\nДля **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.\n\nЧтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.\n\nЧтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.\n\nПараметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.\n\n{% note warning &quot;Правила использования SKU&quot; %}\n\n* У каждого товара SKU должен быть свой.\n\n* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.\n\n* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.\n\n{% endnote %}\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void updateOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateOfferMappingsRequest' => ''
        };

        OASClient client;
        OASBusinessOfferMappingsApi api;
        OASUpdateOfferMappingsResponse response;
        OASUpdateOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessOfferMappingsApi(client);

        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }
}