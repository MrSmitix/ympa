const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}reportId`,
                label: `Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. - [${labelPrefix}reportId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}estimatedGenerationTime`,
                label: `Ожидаемая продолжительность генерации в миллисекундах. - [${labelPrefix}estimatedGenerationTime]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'reportId': bundle.inputData?.[`${keyPrefix}reportId`],
            'estimatedGenerationTime': bundle.inputData?.[`${keyPrefix}estimatedGenerationTime`],
        }
    },
}
