const utils = require('../utils/utils');
const ReturnInstanceStatusType = require('../models/ReturnInstanceStatusType');
const ReturnInstanceStockType = require('../models/ReturnInstanceStockType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}stockType`,
                ...ReturnInstanceStockType.fields(`${keyPrefix}stockType`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...ReturnInstanceStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}cis`,
                label: `Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). - [${labelPrefix}cis]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}imei`,
                label: `Международный идентификатор мобильного оборудования. - [${labelPrefix}imei]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'stockType': bundle.inputData?.[`${keyPrefix}stockType`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'cis': bundle.inputData?.[`${keyPrefix}cis`],
            'imei': bundle.inputData?.[`${keyPrefix}imei`],
        }
    },
}
