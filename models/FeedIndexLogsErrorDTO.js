const utils = require('../utils/utils');
const FeedIndexLogsErrorType = require('../models/FeedIndexLogsErrorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}httpStatusCode`,
                label: `HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  - [${labelPrefix}httpStatusCode]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                ...FeedIndexLogsErrorType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}description`,
                label: `Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  - [${labelPrefix}description]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'httpStatusCode': bundle.inputData?.[`${keyPrefix}httpStatusCode`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
        }
    },
}
