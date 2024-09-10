const utils = require('../utils/utils');
const OrderBoxLayoutDTO = require('../models/OrderBoxLayoutDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}boxes`,
                label: `[${labelPrefix}boxes]`,
                children: OrderBoxLayoutDTO.fields(`${keyPrefix}boxes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}allowRemove`,
                label: `Передайте `true`, если вы собираетесь удалить часть товаров из заказа. - [${labelPrefix}allowRemove]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'boxes': utils.childMapping(bundle.inputData?.[`${keyPrefix}boxes`], `${keyPrefix}boxes`, OrderBoxLayoutDTO),
            'allowRemove': bundle.inputData?.[`${keyPrefix}allowRemove`],
        }
    },
}
