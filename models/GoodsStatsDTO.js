const utils = require('../utils/utils');
const GoodsStatsGoodsDTO = require('../models/GoodsStatsGoodsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}shopSkus`,
                label: `[${labelPrefix}shopSkus]`,
                children: GoodsStatsGoodsDTO.fields(`${keyPrefix}shopSkus${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'shopSkus': utils.childMapping(bundle.inputData?.[`${keyPrefix}shopSkus`], `${keyPrefix}shopSkus`, GoodsStatsGoodsDTO),
        }
    },
}
