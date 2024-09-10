const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cis`,
                label: `Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. - [${labelPrefix}cis]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cisFull`,
                label: `Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. - [${labelPrefix}cisFull]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}uin`,
                label: `УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.  - [${labelPrefix}uin]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}rnpt`,
                label: `Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  - [${labelPrefix}rnpt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}gtd`,
                label: `Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  - [${labelPrefix}gtd]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cis': bundle.inputData?.[`${keyPrefix}cis`],
            'cisFull': bundle.inputData?.[`${keyPrefix}cisFull`],
            'uin': bundle.inputData?.[`${keyPrefix}uin`],
            'rnpt': bundle.inputData?.[`${keyPrefix}rnpt`],
            'gtd': bundle.inputData?.[`${keyPrefix}gtd`],
        }
    },
}
