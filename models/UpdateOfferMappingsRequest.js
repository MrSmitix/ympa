const utils = require('../utils/utils');
const UpdateOfferMappingDTO = require('../models/UpdateOfferMappingDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerMappings`,
                label: `[${labelPrefix}offerMappings]`,
                children: UpdateOfferMappingDTO.fields(`${keyPrefix}offerMappings${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}onlyPartnerMediaContent`,
                label: `Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  - [${labelPrefix}onlyPartnerMediaContent]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerMappings': utils.childMapping(bundle.inputData?.[`${keyPrefix}offerMappings`], `${keyPrefix}offerMappings`, UpdateOfferMappingDTO),
            'onlyPartnerMediaContent': bundle.inputData?.[`${keyPrefix}onlyPartnerMediaContent`],
        }
    },
}
