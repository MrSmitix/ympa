const utils = require('../utils/utils');
const BasePriceDTO = require('../models/BasePriceDTO');
const PriceQuarantineVerdictDTO = require('../models/PriceQuarantineVerdictDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                type: 'string',
            },
            ...BasePriceDTO.fields(`${keyPrefix}currentPrice`, isInput),
            ...BasePriceDTO.fields(`${keyPrefix}lastValidPrice`, isInput),
            {
                key: `${keyPrefix}verdicts`,
                label: `[${labelPrefix}verdicts]`,
                children: PriceQuarantineVerdictDTO.fields(`${keyPrefix}verdicts${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'currentPrice': utils.removeIfEmpty(BasePriceDTO.mapping(bundle, `${keyPrefix}currentPrice`)),
            'lastValidPrice': utils.removeIfEmpty(BasePriceDTO.mapping(bundle, `${keyPrefix}lastValidPrice`)),
            'verdicts': utils.childMapping(bundle.inputData?.[`${keyPrefix}verdicts`], `${keyPrefix}verdicts`, PriceQuarantineVerdictDTO),
        }
    },
}
