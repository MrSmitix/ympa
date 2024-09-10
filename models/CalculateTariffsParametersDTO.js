const utils = require('../utils/utils');
const PaymentFrequencyType = require('../models/PaymentFrequencyType');
const SellingProgramType = require('../models/SellingProgramType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  - [${labelPrefix}campaignId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}sellingProgram`,
                ...SellingProgramType.fields(`${keyPrefix}sellingProgram`, isInput),
            },
            {
                key: `${keyPrefix}frequency`,
                ...PaymentFrequencyType.fields(`${keyPrefix}frequency`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'sellingProgram': bundle.inputData?.[`${keyPrefix}sellingProgram`],
            'frequency': bundle.inputData?.[`${keyPrefix}frequency`],
        }
    },
}
