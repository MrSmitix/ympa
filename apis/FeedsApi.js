const samples = require('../samples/FeedsApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiLockedErrorResponse = require('../models/ApiLockedErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const EmptyApiResponse = require('../models/EmptyApiResponse');
const FeedIndexLogsStatusType = require('../models/FeedIndexLogsStatusType');
const GetFeedIndexLogsResponse = require('../models/GetFeedIndexLogsResponse');
const GetFeedResponse = require('../models/GetFeedResponse');
const GetFeedsResponse = require('../models/GetFeedsResponse');
const SetFeedParamsRequest = require('../models/SetFeedParamsRequest');
const utils = require('../utils/utils');

module.exports = {
    getFeed: {
        key: 'getFeed',
        noun: 'feedsdbsfbsexpressfby',
        display: {
            label: 'Информация о прайс-листе',
            description: '{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaignId',
                    label: 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'feedId',
                    label: 'Идентификатор прайс-листа.',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...GetFeedResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/feeds/{feedId}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
            sample: samples['GetFeedResponseSample']
        }
    },
    getFeedIndexLogs: {
        key: 'getFeedIndexLogs',
        noun: 'feedsdbsfbsexpressfby',
        display: {
            label: 'Отчет по индексации прайс-листа',
            description: '{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaignId',
                    label: 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'feedId',
                    label: 'Идентификатор прайс-листа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'Количество значений на одной странице. ',
                    type: 'integer',
                },
                {
                    key: 'published_time_from',
                    label: 'Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. ',
                    type: 'string',
                },
                {
                    key: 'published_time_to',
                    label: 'Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} ',
                    type: 'string',
                },
                ....fields(),
            ],
            outputFields: [
                ...GetFeedIndexLogsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/feeds/{feedId}/index-logs'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'published_time_from': bundle.inputData?.['published_time_from'],
                        'published_time_to': bundle.inputData?.['published_time_to'],
                        'status': bundle.inputData?.['status'],
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
            sample: samples['GetFeedIndexLogsResponseSample']
        }
    },
    getFeeds: {
        key: 'getFeeds',
        noun: 'feedsdbsfbsexpressfby',
        display: {
            label: 'Список прайс-листов магазина',
            description: '{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaignId',
                    label: 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...GetFeedsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/feeds'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
            sample: samples['GetFeedsResponseSample']
        }
    },
    refreshFeed: {
        key: 'refreshFeed',
        noun: 'feedsdbsfbsexpressfby',
        display: {
            label: 'Сообщить, что прайс-лист обновился',
            description: '{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaignId',
                    label: 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'feedId',
                    label: 'Идентификатор прайс-листа.',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/feeds/{feedId}/refresh'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
            sample: samples['EmptyApiResponseSample']
        }
    },
    setFeedParams: {
        key: 'setFeedParams',
        noun: 'feedsdbsfbsexpressfby',
        display: {
            label: 'Изменение параметров прайс-листа',
            description: '{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaignId',
                    label: 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'feedId',
                    label: 'Идентификатор прайс-листа.',
                    type: 'number',
                    required: true,
                },
                ...SetFeedParamsRequest.fields(),
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/feeds/{feedId}/params'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SetFeedParamsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['EmptyApiResponseSample']
        }
    },
}
