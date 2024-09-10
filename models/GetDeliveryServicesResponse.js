const utils = require('../utils/utils');
const DeliveryServicesDTO = require('../models/DeliveryServicesDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...DeliveryServicesDTO.fields(`${keyPrefix}result`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'result': utils.removeIfEmpty(DeliveryServicesDTO.mapping(bundle, `${keyPrefix}result`)),
        }
    },
}
