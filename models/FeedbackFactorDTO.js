const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор параметра. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}title`,
                label: `Название параметра. Например, `Скорость обработки заказа`. - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  - [${labelPrefix}value]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
