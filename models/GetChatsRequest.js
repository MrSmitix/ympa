const utils = require('../utils/utils');
const ChatStatusType = require('../models/ChatStatusType');
const ChatType = require('../models/ChatType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderIds`,
                label: `Фильтр по идентификаторам заказов на Маркете. - [${labelPrefix}orderIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}types`,
                list: true,
                type: 'string',
                ...ChatType.fields(`${keyPrefix}types`, isInput),
            },
            {
                key: `${keyPrefix}statuses`,
                list: true,
                type: 'string',
                ...ChatStatusType.fields(`${keyPrefix}statuses`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, ChatType),
            'statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}statuses`], `${keyPrefix}statuses`, ChatStatusType),
        }
    },
}
