const utils = require('../utils/utils');
const GetPromoPromocodeInfoDTO = require('../models/GetPromoPromocodeInfoDTO');
const MechanicsType = require('../models/MechanicsType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...MechanicsType.fields(`${keyPrefix}type`, isInput),
            },
            ...GetPromoPromocodeInfoDTO.fields(`${keyPrefix}promocodeInfo`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'promocodeInfo': utils.removeIfEmpty(GetPromoPromocodeInfoDTO.mapping(bundle, `${keyPrefix}promocodeInfo`)),
        }
    },
}
