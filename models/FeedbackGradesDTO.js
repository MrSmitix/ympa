const utils = require('../utils/utils');
const FeedbackFactorDTO = require('../models/FeedbackFactorDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}average`,
                label: `Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). - [${labelPrefix}average]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}agreeCount`,
                label: `Количество пользователей, считающих отзыв полезным. - [${labelPrefix}agreeCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}rejectCount`,
                label: `Количество пользователей, считающих отзыв бесполезным. - [${labelPrefix}rejectCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}factors`,
                label: `[${labelPrefix}factors]`,
                children: FeedbackFactorDTO.fields(`${keyPrefix}factors${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'average': bundle.inputData?.[`${keyPrefix}average`],
            'agreeCount': bundle.inputData?.[`${keyPrefix}agreeCount`],
            'rejectCount': bundle.inputData?.[`${keyPrefix}rejectCount`],
            'factors': utils.childMapping(bundle.inputData?.[`${keyPrefix}factors`], `${keyPrefix}factors`, FeedbackFactorDTO),
        }
    },
}
