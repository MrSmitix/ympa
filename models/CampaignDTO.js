const utils = require('../utils/utils');
const BusinessDTO = require('../models/BusinessDTO');
const PlacementType = require('../models/PlacementType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}domain`,
                label: `URL магазина. - [${labelPrefix}domain]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор кампании. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}clientId`,
                label: `Идентификатор плательщика в Яндекс Балансе. - [${labelPrefix}clientId]`,
                type: 'number',
            },
            ...BusinessDTO.fields(`${keyPrefix}business`, isInput),
            {
                key: `${keyPrefix}placementType`,
                ...PlacementType.fields(`${keyPrefix}placementType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'domain': bundle.inputData?.[`${keyPrefix}domain`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'clientId': bundle.inputData?.[`${keyPrefix}clientId`],
            'business': utils.removeIfEmpty(BusinessDTO.mapping(bundle, `${keyPrefix}business`)),
            'placementType': bundle.inputData?.[`${keyPrefix}placementType`],
        }
    },
}
