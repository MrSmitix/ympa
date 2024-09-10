const utils = require('../utils/utils');
const TimeUnitType = require('../models/TimeUnitType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}timePeriod`,
                label: `Продолжительность в указанных единицах. - [${labelPrefix}timePeriod]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}timeUnit`,
                ...TimeUnitType.fields(`${keyPrefix}timeUnit`, isInput),
            },
            {
                key: `${keyPrefix}comment`,
                label: `Комментарий. - [${labelPrefix}comment]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'timePeriod': bundle.inputData?.[`${keyPrefix}timePeriod`],
            'timeUnit': bundle.inputData?.[`${keyPrefix}timeUnit`],
            'comment': bundle.inputData?.[`${keyPrefix}comment`],
        }
    },
}
