const samples = require('../samples/ReturnsApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const EmptyApiResponse = require('../models/EmptyApiResponse');
const GetReturnResponse = require('../models/GetReturnResponse');
const GetReturnsResponse = require('../models/GetReturnsResponse');
const RefundStatusType = require('../models/RefundStatusType');
const ReturnType = require('../models/ReturnType');
const SetReturnDecisionRequest = require('../models/SetReturnDecisionRequest');
const utils = require('../utils/utils');

module.exports = {
    getReturn: {
        key: 'getReturn',
        noun: 'returnsfbsdbsexpressfby',
        display: {
            label: 'Информация о невыкупе или возврате',
            description: 'Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'orderId',
                    label: 'Идентификатор заказа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'returnId',
                    label: 'Идентификатор возврата.',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...GetReturnResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}'),
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
            sample: samples['GetReturnResponseSample']
        }
    },
    getReturnApplication: {
        key: 'getReturnApplication',
        noun: 'returnsfbsdbsexpress',
        display: {
            label: 'Получение заявления на возврат',
            description: 'Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'orderId',
                    label: 'Идентификатор заказа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'returnId',
                    label: 'Идентификатор возврата.',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/octet-stream, application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getReturnPhoto: {
        key: 'getReturnPhoto',
        noun: 'returnsfbsdbsexpressfby',
        display: {
            label: 'Получение фотографии возврата',
            description: 'Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'orderId',
                    label: 'Идентификатор заказа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'returnId',
                    label: 'Идентификатор возврата.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'itemId',
                    label: 'Идентификатор товара в возврате.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'imageHash',
                    label: 'Хеш ссылки изображения для загрузки.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/octet-stream, application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getReturns: {
        key: 'getReturns',
        noun: 'returnsfbsdbsexpressfby',
        display: {
            label: 'Список невыкупов и возвратов',
            description: 'Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'page_token',
                    label: 'Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Количество значений на одной странице. ',
                    type: 'integer',
                },
                {
                    key: 'orderIds',
                    label: 'Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. ',
                    type: 'string',
                }
                {
                    key: 'statuses',
                    label: 'Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. ',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'fromDate',
                    label: 'Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ',
                    type: 'string',
                },
                {
                    key: 'toDate',
                    label: 'Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ',
                    type: 'string',
                },
                {
                    key: 'from_date',
                    label: '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. ',
                    type: 'string',
                },
                {
                    key: 'to_date',
                    label: '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...GetReturnsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/returns'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'page_token': bundle.inputData?.['page_token'],
                        'limit': bundle.inputData?.['limit'],
                        'orderIds': bundle.inputData?.['orderIds'],
                        'statuses': bundle.inputData?.['statuses'],
                        'type': bundle.inputData?.['type'],
                        'fromDate': bundle.inputData?.['fromDate'],
                        'toDate': bundle.inputData?.['toDate'],
                        'from_date': bundle.inputData?.['from_date'],
                        'to_date': bundle.inputData?.['to_date'],
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
            sample: samples['GetReturnsResponseSample']
        }
    },
    setReturnDecision: {
        key: 'setReturnDecision',
        noun: 'returnsdbs',
        display: {
            label: 'Принятие или изменение решения по возврату',
            description: 'Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'orderId',
                    label: 'Идентификатор заказа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'returnId',
                    label: 'Идентификатор возврата.',
                    type: 'number',
                    required: true,
                },
                ...SetReturnDecisionRequest.fields(),
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision'),
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
                        ...SetReturnDecisionRequest.mapping(bundle),
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
    submitReturnDecision: {
        key: 'submitReturnDecision',
        noun: 'returnsdbs',
        display: {
            label: 'Подтверждение решения по возврату',
            description: 'Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ',
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
                    key: 'orderId',
                    label: 'Идентификатор заказа.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'returnId',
                    label: 'Идентификатор возврата.',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit'),
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
}
