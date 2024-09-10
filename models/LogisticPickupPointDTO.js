const utils = require('../utils/utils');
const LogisticPointType = require('../models/LogisticPointType');
const PickupAddressDTO = require('../models/PickupAddressDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор пункта вывоза. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название пункта вывоза. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...PickupAddressDTO.fields(`${keyPrefix}address`, isInput),
            {
                key: `${keyPrefix}instruction`,
                label: `Дополнительные инструкции к вывозу. - [${labelPrefix}instruction]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...LogisticPointType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}logisticPartnerId`,
                label: `Идентификатор логистического партнера, к которому относится логистическая точка. - [${labelPrefix}logisticPartnerId]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'address': utils.removeIfEmpty(PickupAddressDTO.mapping(bundle, `${keyPrefix}address`)),
            'instruction': bundle.inputData?.[`${keyPrefix}instruction`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'logisticPartnerId': bundle.inputData?.[`${keyPrefix}logisticPartnerId`],
        }
    },
}
