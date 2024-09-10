const utils = require('../utils/utils');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');
const ShipmentInfoDTO = require('../models/ShipmentInfoDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}shipments`,
                label: `[${labelPrefix}shipments]`,
                children: ShipmentInfoDTO.fields(`${keyPrefix}shipments${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'shipments': utils.childMapping(bundle.inputData?.[`${keyPrefix}shipments`], `${keyPrefix}shipments`, ShipmentInfoDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
