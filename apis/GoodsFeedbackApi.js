const samples = require('../samples/GoodsFeedbackApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const DeleteGoodsFeedbackCommentRequest = require('../models/DeleteGoodsFeedbackCommentRequest');
const EmptyApiResponse = require('../models/EmptyApiResponse');
const GetGoodsFeedbackCommentsRequest = require('../models/GetGoodsFeedbackCommentsRequest');
const GetGoodsFeedbackCommentsResponse = require('../models/GetGoodsFeedbackCommentsResponse');
const GetGoodsFeedbackRequest = require('../models/GetGoodsFeedbackRequest');
const GetGoodsFeedbackResponse = require('../models/GetGoodsFeedbackResponse');
const SkipGoodsFeedbackReactionRequest = require('../models/SkipGoodsFeedbackReactionRequest');
const UpdateGoodsFeedbackCommentRequest = require('../models/UpdateGoodsFeedbackCommentRequest');
const UpdateGoodsFeedbackCommentResponse = require('../models/UpdateGoodsFeedbackCommentResponse');
const utils = require('../utils/utils');

module.exports = {
    deleteGoodsFeedbackComment: {
        key: 'deleteGoodsFeedbackComment',
        noun: 'goods-feedbackfbyfbsdbsexpress',
        display: {
            label: 'Удаление комментария к отзыву',
            description: 'Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
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
                ...DeleteGoodsFeedbackCommentRequest.fields(),
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/goods-feedback/comments/delete'),
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
                        ...DeleteGoodsFeedbackCommentRequest.mapping(bundle),
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
    getGoodsFeedbackComments: {
        key: 'getGoodsFeedbackComments',
        noun: 'goods-feedbackfbyfbsdbsexpress',
        display: {
            label: 'Получение комментариев к отзыву',
            description: 'Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
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
                ...GetGoodsFeedbackCommentsRequest.fields(),
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
                ...GetGoodsFeedbackCommentsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/goods-feedback/comments'),
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
                        ...GetGoodsFeedbackCommentsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetGoodsFeedbackCommentsResponseSample']
        }
    },
    getGoodsFeedbacks: {
        key: 'getGoodsFeedbacks',
        noun: 'goods-feedbackfbyfbsdbsexpress',
        display: {
            label: 'Получение отзывов о товарах продавца',
            description: 'Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
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
                    key: 'page_token',
                    label: 'Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Количество значений на одной странице. ',
                    type: 'integer',
                },
                ...GetGoodsFeedbackRequest.fields(),
            ],
            outputFields: [
                ...GetGoodsFeedbackResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/goods-feedback'),
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
                        ...GetGoodsFeedbackRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetGoodsFeedbackResponseSample']
        }
    },
    skipGoodsFeedbacksReaction: {
        key: 'skipGoodsFeedbacksReaction',
        noun: 'goods-feedbackfbyfbsdbsexpress',
        display: {
            label: 'Отказ от ответа на отзывы',
            description: 'Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
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
                ...SkipGoodsFeedbackReactionRequest.fields(),
            ],
            outputFields: [
                ...EmptyApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/goods-feedback/skip-reaction'),
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
                        ...SkipGoodsFeedbackReactionRequest.mapping(bundle),
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
    updateGoodsFeedbackComment: {
        key: 'updateGoodsFeedbackComment',
        noun: 'goods-feedbackfbyfbsdbsexpress',
        display: {
            label: 'Добавление нового или изменение созданного комментария',
            description: 'Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
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
                ...UpdateGoodsFeedbackCommentRequest.fields(),
            ],
            outputFields: [
                ...UpdateGoodsFeedbackCommentResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/goods-feedback/comments/update'),
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
                        ...UpdateGoodsFeedbackCommentRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['UpdateGoodsFeedbackCommentResponseSample']
        }
    },
}
