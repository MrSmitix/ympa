const utils = require('../utils/utils');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');
const RegionDTO = require('../models/RegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}regions`,
                label: `[${labelPrefix}regions]`,
                children: RegionDTO.fields(`${keyPrefix}regions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'regions': utils.childMapping(bundle.inputData?.[`${keyPrefix}regions`], `${keyPrefix}regions`, RegionDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
