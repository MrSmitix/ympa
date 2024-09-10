const utils = require('../utils/utils');
const ShipmentActionType = require('../models/ShipmentActionType');
const ShipmentStatusChangeDTO = require('../models/ShipmentStatusChangeDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ShipmentStatusChangeDTO.fields(`${keyPrefix}currentStatus`, isInput),
            {
                key: `${keyPrefix}availableActions`,
                list: true,
                type: 'string',
                ...ShipmentActionType.fields(`${keyPrefix}availableActions`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'currentStatus': utils.removeIfEmpty(ShipmentStatusChangeDTO.mapping(bundle, `${keyPrefix}currentStatus`)),
            'availableActions': utils.childMapping(bundle.inputData?.[`${keyPrefix}availableActions`], `${keyPrefix}availableActions`, ShipmentActionType),
        }
    },
}
