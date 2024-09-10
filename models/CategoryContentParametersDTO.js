const utils = require('../utils/utils');
const CategoryParameterDTO = require('../models/CategoryParameterDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}categoryId`,
                label: `Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). - [${labelPrefix}categoryId]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}parameters`,
                label: `[${labelPrefix}parameters]`,
                children: CategoryParameterDTO.fields(`${keyPrefix}parameters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'categoryId': bundle.inputData?.[`${keyPrefix}categoryId`],
            'parameters': utils.childMapping(bundle.inputData?.[`${keyPrefix}parameters`], `${keyPrefix}parameters`, CategoryParameterDTO),
        }
    },
}
