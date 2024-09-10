const utils = require('../utils/utils');
const FeedStatusType = require('../models/FeedStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...FeedStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}totalOffersCount`,
                label: `Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. - [${labelPrefix}totalOffersCount]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'totalOffersCount': bundle.inputData?.[`${keyPrefix}totalOffersCount`],
        }
    },
}
