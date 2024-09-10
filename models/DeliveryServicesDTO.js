const utils = require('../utils/utils');
const DeliveryServiceInfoDTO = require('../models/DeliveryServiceInfoDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}deliveryService`,
                label: `[${labelPrefix}deliveryService]`,
                children: DeliveryServiceInfoDTO.fields(`${keyPrefix}deliveryService${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'deliveryService': utils.childMapping(bundle.inputData?.[`${keyPrefix}deliveryService`], `${keyPrefix}deliveryService`, DeliveryServiceInfoDTO),
        }
    },
}
