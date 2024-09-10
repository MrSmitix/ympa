const utils = require('../utils/utils');
const CategoryParameterUnitDTO = require('../models/CategoryParameterUnitDTO');
const OfferCardRecommendationType = require('../models/OfferCardRecommendationType');
const ParameterType = require('../models/ParameterType');
const ParameterValueConstraintsDTO = require('../models/ParameterValueConstraintsDTO');
const ParameterValueOptionDTO = require('../models/ParameterValueOptionDTO');
const ValueRestrictionDTO = require('../models/ValueRestrictionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор характеристики. - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название характеристики. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...ParameterType.fields(`${keyPrefix}type`, isInput),
            },
            ...CategoryParameterUnitDTO.fields(`${keyPrefix}unit`, isInput),
            {
                key: `${keyPrefix}description`,
                label: `Описание характеристики. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}recommendationTypes`,
                list: true,
                type: 'string',
                ...OfferCardRecommendationType.fields(`${keyPrefix}recommendationTypes`, isInput),
            },
            {
                key: `${keyPrefix}required`,
                label: `Обязательность характеристики. - [${labelPrefix}required]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}filtering`,
                label: `Используется ли характеристика в фильтре. - [${labelPrefix}filtering]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}distinctive`,
                label: `Является ли характеристика особенностью варианта. - [${labelPrefix}distinctive]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}multivalue`,
                label: `Можно ли передать сразу несколько значений. - [${labelPrefix}multivalue]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}allowCustomValues`,
                label: `Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. - [${labelPrefix}allowCustomValues]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                children: ParameterValueOptionDTO.fields(`${keyPrefix}values${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ParameterValueConstraintsDTO.fields(`${keyPrefix}constraints`, isInput),
            {
                key: `${keyPrefix}valueRestrictions`,
                label: `[${labelPrefix}valueRestrictions]`,
                children: ValueRestrictionDTO.fields(`${keyPrefix}valueRestrictions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'unit': utils.removeIfEmpty(CategoryParameterUnitDTO.mapping(bundle, `${keyPrefix}unit`)),
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'recommendationTypes': utils.childMapping(bundle.inputData?.[`${keyPrefix}recommendationTypes`], `${keyPrefix}recommendationTypes`, OfferCardRecommendationType),
            'required': bundle.inputData?.[`${keyPrefix}required`],
            'filtering': bundle.inputData?.[`${keyPrefix}filtering`],
            'distinctive': bundle.inputData?.[`${keyPrefix}distinctive`],
            'multivalue': bundle.inputData?.[`${keyPrefix}multivalue`],
            'allowCustomValues': bundle.inputData?.[`${keyPrefix}allowCustomValues`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, ParameterValueOptionDTO),
            'constraints': utils.removeIfEmpty(ParameterValueConstraintsDTO.mapping(bundle, `${keyPrefix}constraints`)),
            'valueRestrictions': utils.childMapping(bundle.inputData?.[`${keyPrefix}valueRestrictions`], `${keyPrefix}valueRestrictions`, ValueRestrictionDTO),
        }
    },
}
