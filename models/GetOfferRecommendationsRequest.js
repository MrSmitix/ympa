const utils = require('../utils/utils');
const FieldStateType = require('../models/FieldStateType');
const PriceCompetitivenessType = require('../models/PriceCompetitivenessType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerIds`,
                label: `Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. - [${labelPrefix}offerIds]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}cofinancePriceFilter`,
                ...FieldStateType.fields(`${keyPrefix}cofinancePriceFilter`, isInput),
            },
            {
                key: `${keyPrefix}recommendedCofinancePriceFilter`,
                ...FieldStateType.fields(`${keyPrefix}recommendedCofinancePriceFilter`, isInput),
            },
            {
                key: `${keyPrefix}competitivenessFilter`,
                ...PriceCompetitivenessType.fields(`${keyPrefix}competitivenessFilter`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerIds': bundle.inputData?.[`${keyPrefix}offerIds`],
            'cofinancePriceFilter': bundle.inputData?.[`${keyPrefix}cofinancePriceFilter`],
            'recommendedCofinancePriceFilter': bundle.inputData?.[`${keyPrefix}recommendedCofinancePriceFilter`],
            'competitivenessFilter': bundle.inputData?.[`${keyPrefix}competitivenessFilter`],
        }
    },
}
