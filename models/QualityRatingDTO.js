const utils = require('../utils/utils');
const QualityRatingComponentDTO = require('../models/QualityRatingComponentDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rating`,
                label: `Значение индекса качества. - [${labelPrefix}rating]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}calculationDate`,
                label: `Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  - [${labelPrefix}calculationDate]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}components`,
                label: `[${labelPrefix}components]`,
                children: QualityRatingComponentDTO.fields(`${keyPrefix}components${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rating': bundle.inputData?.[`${keyPrefix}rating`],
            'calculationDate': bundle.inputData?.[`${keyPrefix}calculationDate`],
            'components': utils.childMapping(bundle.inputData?.[`${keyPrefix}components`], `${keyPrefix}components`, QualityRatingComponentDTO),
        }
    },
}
