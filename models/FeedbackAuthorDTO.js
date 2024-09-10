const utils = require('../utils/utils');
const RegionDTO = require('../models/RegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Имя автора отзыва. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...RegionDTO.fields(`${keyPrefix}region`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'region': utils.removeIfEmpty(RegionDTO.mapping(bundle, `${keyPrefix}region`)),
        }
    },
}
