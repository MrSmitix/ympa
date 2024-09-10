const utils = require('../utils/utils');
const PriceDTO = require('../models/PriceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор предложения из прайс-листа. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...PriceDTO.fields(`${keyPrefix}price`, isInput),
            {
                key: `${keyPrefix}marketSku`,
                label: `SKU на Маркете. - [${labelPrefix}marketSku]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `Дата и время последнего обновления цены на товар. - [${labelPrefix}updatedAt]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'price': utils.removeIfEmpty(PriceDTO.mapping(bundle, `${keyPrefix}price`)),
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
        }
    },
}
