const utils = require('../utils/utils');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');
const WarehouseOffersDTO = require('../models/WarehouseOffersDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}warehouses`,
                label: `[${labelPrefix}warehouses]`,
                children: WarehouseOffersDTO.fields(`${keyPrefix}warehouses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'warehouses': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouses`], `${keyPrefix}warehouses`, WarehouseOffersDTO),
        }
    },
}
