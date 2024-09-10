const utils = require('../utils/utils');
const TurnoverType = require('../models/TurnoverType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}turnover`,
                ...TurnoverType.fields(`${keyPrefix}turnover`, isInput),
            },
            {
                key: `${keyPrefix}turnoverDays`,
                label: `Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) - [${labelPrefix}turnoverDays]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'turnover': bundle.inputData?.[`${keyPrefix}turnover`],
            'turnoverDays': bundle.inputData?.[`${keyPrefix}turnoverDays`],
        }
    },
}
