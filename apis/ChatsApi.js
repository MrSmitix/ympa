const samples = require('../samples/ChatsApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const CreateChatRequest = require('../models/CreateChatRequest');
const CreateChatResponse = require('../models/CreateChatResponse');
const EmptyApiResponse = require('../models/EmptyApiResponse');
const GetChatHistoryRequest = require('../models/GetChatHistoryRequest');
const GetChatHistoryResponse = require('../models/GetChatHistoryResponse');
const GetChatsRequest = require('../models/GetChatsRequest');
const GetChatsResponse = require('../models/GetChatsResponse');
const SendMessageToChatRequest = require('../models/SendMessageToChatRequest');
const utils = require('../utils/utils');
const FormData = require('form-data');

module.exports = {
    createChat: {
        key: 'createChat',
        noun: 'chatsdbsfbsfbyexpress',
        display: {
            label: 'Создание нового чата с покупателем',
            description: 'Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'businessId',
                    label: 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                ...CreateChatRequest.fields(),
            ],
            outputFields: [
                ...CreateChatResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/chats/new'),
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
                        ...CreateChatRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateChatResponseSample']
        }
    },
    getChatHistory: {
        key: 'getChatHistory',
        noun: 'chatsdbsfbsfbyexpress',
        display: {
            label: 'Получение истории сообщений в чате',
            description: 'Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'businessId',
                    label: 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'chatId',
                    label: 'Идентификатор чата.',
                    type: 'number',
                    required: true,
                },
                ...GetChatHistoryRequest.fields(),
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
            ],
            outputFields: [
                ...GetChatHistoryResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/chats/history'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'chatId': bundle.inputData?.['chatId'],
                        'page_token': bundle.inputData?.['page_token'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                        ...GetChatHistoryRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetChatHistoryResponseSample']
        }
    },
    getChats: {
        key: 'getChats',
        noun: 'chatsdbsfbsfbyexpress',
        display: {
            label: 'Получение доступных чатов',
            description: 'Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'businessId',
                    label: 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                ...GetChatsRequest.fields(),
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
            ],
            outputFields: [
                ...GetChatsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/chats'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'page_token': bundle.inputData?.['page_token'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                        ...GetChatsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetChatsResponseSample']
        }
    },
    sendFileToChat: {
        key: 'sendFileToChat',
        noun: 'chatsdbsfbsfbyexpress',
        display: {
            label: 'Отправка файла в чат',
            description: 'Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'businessId',
                    label: 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'chatId',
                    label: 'Идентификатор чата.',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'file',
                    label: 'Содержимое файла. Максимальный размер файла — 5 Мбайт.',
                    type: 'file',
                    required: true,
                },
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/chats/file/send'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        
                        'Accept': 'application/json',
                    },
                    params: {
                        'chatId': bundle.inputData?.['chatId'],
                    },
                    body: formData,
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
    sendMessageToChat: {
        key: 'sendMessageToChat',
        noun: 'chatsdbsfbsfbyexpress',
        display: {
            label: 'Отправка сообщения в чат',
            description: 'Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'businessId',
                    label: 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
                    type: 'number',
                    required: true,
                },
                {
                    key: 'chatId',
                    label: 'Идентификатор чата.',
                    type: 'number',
                    required: true,
                },
                ...SendMessageToChatRequest.fields(),
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/chats/message'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'chatId': bundle.inputData?.['chatId'],
                    },
                    body: {
                        ...SendMessageToChatRequest.mapping(bundle),
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
