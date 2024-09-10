const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cis`,
                label: `Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %}  - [${labelPrefix}cis]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}uin`,
                label: `Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.  - [${labelPrefix}uin]`,
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
            'uin': bundle.inputData?.[`${keyPrefix}uin`],
            'rnpt': bundle.inputData?.[`${keyPrefix}rnpt`],
            'gtd': bundle.inputData?.[`${keyPrefix}gtd`],
        }
    },
}
