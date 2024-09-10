const utils = require('../utils/utils');
const FeedContentErrorDTO = require('../models/FeedContentErrorDTO');
const FeedStatusType = require('../models/FeedStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejectedOffersCount`,
                label: `Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  - [${labelPrefix}rejectedOffersCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                ...FeedStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}totalOffersCount`,
                label: `Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  - [${labelPrefix}totalOffersCount]`,
                type: 'number',
            },
            ...FeedContentErrorDTO.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejectedOffersCount': bundle.inputData?.[`${keyPrefix}rejectedOffersCount`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'totalOffersCount': bundle.inputData?.[`${keyPrefix}totalOffersCount`],
            'error': utils.removeIfEmpty(FeedContentErrorDTO.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
