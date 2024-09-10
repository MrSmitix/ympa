const utils = require('../utils/utils');
const EacVerificationStatusType = require('../models/EacVerificationStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}verificationResult`,
                ...EacVerificationStatusType.fields(`${keyPrefix}verificationResult`, isInput),
            },
            {
                key: `${keyPrefix}attemptsLeft`,
                label: `Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  - [${labelPrefix}attemptsLeft]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'verificationResult': bundle.inputData?.[`${keyPrefix}verificationResult`],
            'attemptsLeft': bundle.inputData?.[`${keyPrefix}attemptsLeft`],
        }
    },
}
