const utils = require('../utils/utils');
const ModelPriceDTO = require('../models/ModelPriceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор модели товара. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название модели товара. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...ModelPriceDTO.fields(`${keyPrefix}prices`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'prices': utils.removeIfEmpty(ModelPriceDTO.mapping(bundle, `${keyPrefix}prices`)),
        }
    },
}
