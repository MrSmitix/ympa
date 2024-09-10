const utils = require('../utils/utils');
const UnitDTO = require('../models/UnitDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}defaultUnitId`,
                label: `Единица измерения по умолчанию. - [${labelPrefix}defaultUnitId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}units`,
                label: `[${labelPrefix}units]`,
                children: UnitDTO.fields(`${keyPrefix}units${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'defaultUnitId': bundle.inputData?.[`${keyPrefix}defaultUnitId`],
            'units': utils.childMapping(bundle.inputData?.[`${keyPrefix}units`], `${keyPrefix}units`, UnitDTO),
        }
    },
}
