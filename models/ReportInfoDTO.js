const utils = require('../utils/utils');
const ReportStatusType = require('../models/ReportStatusType');
const ReportSubStatusType = require('../models/ReportSubStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ReportStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}subStatus`,
                ...ReportSubStatusType.fields(`${keyPrefix}subStatus`, isInput),
            },
            {
                key: `${keyPrefix}generationRequestedAt`,
                label: `Дата и время запроса на генерацию. - [${labelPrefix}generationRequestedAt]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}generationFinishedAt`,
                label: `Дата и время завершения генерации. - [${labelPrefix}generationFinishedAt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}file`,
                label: `Ссылка на готовый отчет. - [${labelPrefix}file]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}estimatedGenerationTime`,
                label: `Ожидаемая продолжительность генерации в миллисекундах. - [${labelPrefix}estimatedGenerationTime]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'subStatus': bundle.inputData?.[`${keyPrefix}subStatus`],
            'generationRequestedAt': bundle.inputData?.[`${keyPrefix}generationRequestedAt`],
            'generationFinishedAt': bundle.inputData?.[`${keyPrefix}generationFinishedAt`],
            'file': bundle.inputData?.[`${keyPrefix}file`],
            'estimatedGenerationTime': bundle.inputData?.[`${keyPrefix}estimatedGenerationTime`],
        }
    },
}
