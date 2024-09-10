const utils = require('../utils/utils');
const OrderBoxLayoutItemDTO = require('../models/OrderBoxLayoutItemDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: OrderBoxLayoutItemDTO.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}boxId`,
                label: `Идентификатор коробки. - [${labelPrefix}boxId]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, OrderBoxLayoutItemDTO),
            'boxId': bundle.inputData?.[`${keyPrefix}boxId`],
        }
    },
}
