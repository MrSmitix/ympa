const utils = require('../utils/utils');
const FeedPublicationFullDTO = require('../models/FeedPublicationFullDTO');
const FeedPublicationPriceAndStockUpdateDTO = require('../models/FeedPublicationPriceAndStockUpdateDTO');
const FeedStatusType = require('../models/FeedStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...FeedStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...FeedPublicationFullDTO.fields(`${keyPrefix}full`, isInput),
            ...FeedPublicationPriceAndStockUpdateDTO.fields(`${keyPrefix}priceAndStockUpdate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'full': utils.removeIfEmpty(FeedPublicationFullDTO.mapping(bundle, `${keyPrefix}full`)),
            'priceAndStockUpdate': utils.removeIfEmpty(FeedPublicationPriceAndStockUpdateDTO.mapping(bundle, `${keyPrefix}priceAndStockUpdate`)),
        }
    },
}
