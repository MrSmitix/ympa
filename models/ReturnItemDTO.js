const utils = require('../utils/utils');
const ReturnDecisionDTO = require('../models/ReturnDecisionDTO');
const ReturnInstanceDTO = require('../models/ReturnInstanceDTO');
const TrackDTO = require('../models/TrackDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}marketSku`,
                label: `SKU на Маркете. - [${labelPrefix}marketSku]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}count`,
                label: `Количество единиц товара. - [${labelPrefix}count]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}decisions`,
                label: `[${labelPrefix}decisions]`,
                children: ReturnDecisionDTO.fields(`${keyPrefix}decisions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}instances`,
                label: `[${labelPrefix}instances]`,
                children: ReturnInstanceDTO.fields(`${keyPrefix}instances${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}tracks`,
                label: `[${labelPrefix}tracks]`,
                children: TrackDTO.fields(`${keyPrefix}tracks${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'decisions': utils.childMapping(bundle.inputData?.[`${keyPrefix}decisions`], `${keyPrefix}decisions`, ReturnDecisionDTO),
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, ReturnInstanceDTO),
            'tracks': utils.childMapping(bundle.inputData?.[`${keyPrefix}tracks`], `${keyPrefix}tracks`, TrackDTO),
        }
    },
}
