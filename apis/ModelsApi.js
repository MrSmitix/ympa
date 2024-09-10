const samples = require('../samples/ModelsApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const CurrencyType = require('../models/CurrencyType');
const GetModelsOffersResponse = require('../models/GetModelsOffersResponse');
const GetModelsRequest = require('../models/GetModelsRequest');
const GetModelsResponse = require('../models/GetModelsResponse');
const SearchModelsResponse = require('../models/SearchModelsResponse');
const SortOrderType = require('../models/SortOrderType');
const utils = require('../utils/utils');

module.exports = {
    getModel: {
        key: 'getModel',
        noun: 'modelsdbs',
        display: {
            label: 'Информация об одной модели',
            description: 'Возвращает информацию о модели товара.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'modelId',
                    label: 'Идентификатор модели товара.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'regionId',
                    label: 'Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ',
                    type: 'number',
                    required: true,
                },
                ....fields(),
            ],
            outputFields: [
                ...GetModelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/models/{modelId}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'regionId': bundle.inputData?.['regionId'],
                        'currency': bundle.inputData?.['currency'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetModelsResponseSample']
        }
    },
    getModelOffers: {
        key: 'getModelOffers',
        noun: 'modelsdbs',
        display: {
            label: 'Список предложений для одной модели',
            description: 'Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'modelId',
                    label: 'Идентификатор модели товара.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'regionId',
                    label: 'Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ',
                    type: 'number',
                    required: true,
                },
                ....fields(),
                ....fields(),
                {
                    key: 'count',
                    label: 'Количество предложений на странице ответа.',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...GetModelsOffersResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/models/{modelId}/offers'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'regionId': bundle.inputData?.['regionId'],
                        'currency': bundle.inputData?.['currency'],
                        'orderByPrice': bundle.inputData?.['orderByPrice'],
                        'count': bundle.inputData?.['count'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetModelsOffersResponseSample']
        }
    },
    getModels: {
        key: 'getModels',
        noun: 'modelsdbs',
        display: {
            label: 'Информация о нескольких моделях',
            description: 'Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'regionId',
                    label: 'Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ',
                    type: 'number',
                    required: true,
                },
                ...GetModelsRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GetModelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/models'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'regionId': bundle.inputData?.['regionId'],
                        'currency': bundle.inputData?.['currency'],
                    },
                    body: {
                        ...GetModelsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetModelsResponseSample']
        }
    },
    getModelsOffers: {
        key: 'getModelsOffers',
        noun: 'modelsdbs',
        display: {
            label: 'Список предложений для нескольких моделей',
            description: 'Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'regionId',
                    label: 'Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ',
                    type: 'number',
                    required: true,
                },
                ...GetModelsRequest.fields(),
                ....fields(),
                ....fields(),
            ],
            outputFields: [
                ...GetModelsOffersResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/models/offers'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'regionId': bundle.inputData?.['regionId'],
                        'currency': bundle.inputData?.['currency'],
                        'orderByPrice': bundle.inputData?.['orderByPrice'],
                    },
                    body: {
                        ...GetModelsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetModelsOffersResponseSample']
        }
    },
    searchModels: {
        key: 'searchModels',
        noun: 'modelsdbs',
        display: {
            label: 'Поиск модели товара',
            description: 'Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'query',
                    label: 'Поисковый запрос по названию модели товара.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'regionId',
                    label: 'Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ',
                    type: 'number',
                    required: true,
                },
                ....fields(),
                {
                    key: 'page',
                    label: 'Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ',
                    type: 'integer',
                },
                {
                    key: 'pageSize',
                    label: 'Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...SearchModelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/models'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'query': bundle.inputData?.['query'],
                        'regionId': bundle.inputData?.['regionId'],
                        'currency': bundle.inputData?.['currency'],
                        'page': bundle.inputData?.['page'],
                        'pageSize': bundle.inputData?.['pageSize'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['SearchModelsResponseSample']
        }
    },
}
