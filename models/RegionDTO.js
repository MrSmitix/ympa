const utils = require('../utils/utils');
const RegionType = require('../models/RegionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор региона. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название региона. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...RegionType.fields(`${keyPrefix}type`, isInput),
            },
            ...RegionDTO.fields(`${keyPrefix}parent`, isInput),
            {
                key: `${keyPrefix}children`,
                label: `[${labelPrefix}children]`,
                children: RegionDTO.fields(`${keyPrefix}children${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'parent': utils.removeIfEmpty(RegionDTO.mapping(bundle, `${keyPrefix}parent`)),
            'children': utils.childMapping(bundle.inputData?.[`${keyPrefix}children`], `${keyPrefix}children`, RegionDTO),
        }
    },
}
