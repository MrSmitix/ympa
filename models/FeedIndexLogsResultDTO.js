const utils = require('../utils/utils');
const FeedIndexLogsFeedDTO = require('../models/FeedIndexLogsFeedDTO');
const FeedIndexLogsRecordDTO = require('../models/FeedIndexLogsRecordDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FeedIndexLogsFeedDTO.fields(`${keyPrefix}feed`, isInput),
            {
                key: `${keyPrefix}indexLogRecords`,
                label: `[${labelPrefix}indexLogRecords]`,
                children: FeedIndexLogsRecordDTO.fields(`${keyPrefix}indexLogRecords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}total`,
                label: `Количество отчетов на всех страницах выходных данных. - [${labelPrefix}total]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feed': utils.removeIfEmpty(FeedIndexLogsFeedDTO.mapping(bundle, `${keyPrefix}feed`)),
            'indexLogRecords': utils.childMapping(bundle.inputData?.[`${keyPrefix}indexLogRecords`], `${keyPrefix}indexLogRecords`, FeedIndexLogsRecordDTO),
            'total': bundle.inputData?.[`${keyPrefix}total`],
        }
    },
}
