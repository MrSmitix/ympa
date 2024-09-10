const samples = require('../samples/ContentApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiLockedErrorResponse = require('../models/ApiLockedErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const GetCategoryContentParametersResponse = require('../models/GetCategoryContentParametersResponse');
const GetOfferCardsContentStatusRequest = require('../models/GetOfferCardsContentStatusRequest');
const GetOfferCardsContentStatusResponse = require('../models/GetOfferCardsContentStatusResponse');
const UpdateOfferContentRequest = require('../models/UpdateOfferContentRequest');
const UpdateOfferContentResponse = require('../models/UpdateOfferContentResponse');
const utils = require('../utils/utils');

module.exports = {
    getCategoryContentParameters: {
        key: 'getCategoryContentParameters',
        noun: 'contentdbsfbyfbsexpress',
        display: {
            label: 'Списки характеристик товаров по категориям',
            description: 'Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'categoryId',
                    label: 'Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ',
                    type: 'number',
                    required: true,
                },
            ],
            outputFields: [
                ...GetCategoryContentParametersResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/category/{categoryId}/parameters'),
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
            sample: samples['GetCategoryContentParametersResponseSample']
        }
    },
    getOfferCardsContentStatus: {
        key: 'getOfferCardsContentStatus',
        noun: 'contentdbsfbyfbsexpress',
        display: {
            label: 'Получение информации о заполненности карточек магазина',
            description: 'Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| ',
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
                ...GetOfferCardsContentStatusRequest.fields(),
            ],
            outputFields: [
                ...GetOfferCardsContentStatusResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/offer-cards'),
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
                        ...GetOfferCardsContentStatusRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetOfferCardsContentStatusResponseSample']
        }
    },
    updateOfferContent: {
        key: 'updateOfferContent',
        noun: 'contentdbsfbyfbsexpress',
        display: {
            label: 'Редактирование категорийных характеристик товара',
            description: 'Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| ',
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
                ...UpdateOfferContentRequest.fields(),
            ],
            outputFields: [
                ...UpdateOfferContentResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/offer-cards/update'),
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
                        ...UpdateOfferContentRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['UpdateOfferContentResponseSample']
        }
    },
}
