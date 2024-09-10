const utils = require('../utils/utils');
const FlippingPagerDTO = require('../models/FlippingPagerDTO');
const FullOutletDTO = require('../models/FullOutletDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}outlets`,
                label: `[${labelPrefix}outlets]`,
                children: FullOutletDTO.fields(`${keyPrefix}outlets${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            ...FlippingPagerDTO.fields(`${keyPrefix}pager`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'outlets': utils.childMapping(bundle.inputData?.[`${keyPrefix}outlets`], `${keyPrefix}outlets`, FullOutletDTO),
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'pager': utils.removeIfEmpty(FlippingPagerDTO.mapping(bundle, `${keyPrefix}pager`)),
        }
    },
}
