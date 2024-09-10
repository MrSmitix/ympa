const utils = require('../utils/utils');
const MechanicsType = require('../models/MechanicsType');
const PromoParticipationType = require('../models/PromoParticipationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}participation`,
                ...PromoParticipationType.fields(`${keyPrefix}participation`, isInput),
            },
            {
                key: `${keyPrefix}mechanics`,
                ...MechanicsType.fields(`${keyPrefix}mechanics`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'participation': bundle.inputData?.[`${keyPrefix}participation`],
            'mechanics': bundle.inputData?.[`${keyPrefix}mechanics`],
        }
    },
}
