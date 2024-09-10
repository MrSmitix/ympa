const samples = require('../samples/BusinessesApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const GetBusinessSettingsResponse = require('../models/GetBusinessSettingsResponse');
const utils = require('../utils/utils');

module.exports = {
    getBusinessSettings: {
        key: 'getBusinessSettings',
        noun: 'businessesdbsfbsfbyexpress',
        display: {
            label: 'Настройки кабинета',
            description: 'Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| ',
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
            ],
            outputFields: [
                ...GetBusinessSettingsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/businesses/{businessId}/settings'),
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
            sample: samples['GetBusinessSettingsResponseSample']
        }
    },
}
