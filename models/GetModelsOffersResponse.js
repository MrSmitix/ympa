const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');
const EnrichedModelDTO = require('../models/EnrichedModelDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}models`,
                label: `[${labelPrefix}models]`,
                children: EnrichedModelDTO.fields(`${keyPrefix}models${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}currency`,
                ...CurrencyType.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}regionId`,
                label: `Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  - [${labelPrefix}regionId]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'models': utils.childMapping(bundle.inputData?.[`${keyPrefix}models`], `${keyPrefix}models`, EnrichedModelDTO),
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'regionId': bundle.inputData?.[`${keyPrefix}regionId`],
        }
    },
}
