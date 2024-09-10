const samples = require('../samples/CategoriesApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const GetCategoriesMaxSaleQuantumRequest = require('../models/GetCategoriesMaxSaleQuantumRequest');
const GetCategoriesMaxSaleQuantumResponse = require('../models/GetCategoriesMaxSaleQuantumResponse');
const GetCategoriesRequest = require('../models/GetCategoriesRequest');
const GetCategoriesResponse = require('../models/GetCategoriesResponse');
const utils = require('../utils/utils');

module.exports = {
    getCategoriesMaxSaleQuantum: {
        key: 'getCategoriesMaxSaleQuantum',
        noun: 'categoriesfbyfbsdbsexpress',
        display: {
            label: 'Лимит на установку кванта продажи и минимального количества товаров в заказе',
            description: 'Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GetCategoriesMaxSaleQuantumRequest.fields(),
            ],
            outputFields: [
                ...GetCategoriesMaxSaleQuantumResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/categories/max-sale-quantum'),
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
                        ...GetCategoriesMaxSaleQuantumRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetCategoriesMaxSaleQuantumResponseSample']
        }
    },
    getCategoriesTree: {
        key: 'getCategoriesTree',
        noun: 'categoriesfbyfbsdbsexpress',
        display: {
            label: 'Дерево категорий',
            description: 'Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GetCategoriesRequest.fields(),
            ],
            outputFields: [
                ...GetCategoriesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/categories/tree'),
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
                        ...GetCategoriesRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetCategoriesResponseSample']
        }
    },
}
