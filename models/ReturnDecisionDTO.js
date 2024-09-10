const utils = require('../utils/utils');
const ReturnDecisionReasonType = require('../models/ReturnDecisionReasonType');
const ReturnDecisionSubreasonType = require('../models/ReturnDecisionSubreasonType');
const ReturnDecisionType = require('../models/ReturnDecisionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}returnItemId`,
                label: `Идентификатор товара в возврате. - [${labelPrefix}returnItemId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}count`,
                label: `Количество единиц товара. - [${labelPrefix}count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}comment`,
                label: `Комментарий. - [${labelPrefix}comment]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}reasonType`,
                ...ReturnDecisionReasonType.fields(`${keyPrefix}reasonType`, isInput),
            },
            {
                key: `${keyPrefix}subreasonType`,
                ...ReturnDecisionSubreasonType.fields(`${keyPrefix}subreasonType`, isInput),
            },
            {
                key: `${keyPrefix}decisionType`,
                ...ReturnDecisionType.fields(`${keyPrefix}decisionType`, isInput),
            },
            {
                key: `${keyPrefix}refundAmount`,
                label: `Сумма возврата. - [${labelPrefix}refundAmount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}partnerCompensation`,
                label: `Компенсация за обратную доставку. - [${labelPrefix}partnerCompensation]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}images`,
                label: `Список хеш-кодов фотографий товара от покупателя. - [${labelPrefix}images]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'returnItemId': bundle.inputData?.[`${keyPrefix}returnItemId`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'comment': bundle.inputData?.[`${keyPrefix}comment`],
            'reasonType': bundle.inputData?.[`${keyPrefix}reasonType`],
            'subreasonType': bundle.inputData?.[`${keyPrefix}subreasonType`],
            'decisionType': bundle.inputData?.[`${keyPrefix}decisionType`],
            'refundAmount': bundle.inputData?.[`${keyPrefix}refundAmount`],
            'partnerCompensation': bundle.inputData?.[`${keyPrefix}partnerCompensation`],
            'images': bundle.inputData?.[`${keyPrefix}images`],
        }
    },
}
