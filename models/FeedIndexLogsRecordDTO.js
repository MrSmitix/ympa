const utils = require('../utils/utils');
const FeedIndexLogsErrorDTO = require('../models/FeedIndexLogsErrorDTO');
const FeedIndexLogsIndexType = require('../models/FeedIndexLogsIndexType');
const FeedIndexLogsOffersDTO = require('../models/FeedIndexLogsOffersDTO');
const FeedIndexLogsStatusType = require('../models/FeedIndexLogsStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}downloadTime`,
                label: `Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  - [${labelPrefix}downloadTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}fileTime`,
                label: `Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  - [${labelPrefix}fileTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}generationId`,
                label: `Идентификатор индексации. - [${labelPrefix}generationId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}indexType`,
                ...FeedIndexLogsIndexType.fields(`${keyPrefix}indexType`, isInput),
            },
            {
                key: `${keyPrefix}publishedTime`,
                label: `Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  - [${labelPrefix}publishedTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...FeedIndexLogsStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...FeedIndexLogsErrorDTO.fields(`${keyPrefix}error`, isInput),
            ...FeedIndexLogsOffersDTO.fields(`${keyPrefix}offers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'downloadTime': bundle.inputData?.[`${keyPrefix}downloadTime`],
            'fileTime': bundle.inputData?.[`${keyPrefix}fileTime`],
            'generationId': bundle.inputData?.[`${keyPrefix}generationId`],
            'indexType': bundle.inputData?.[`${keyPrefix}indexType`],
            'publishedTime': bundle.inputData?.[`${keyPrefix}publishedTime`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'error': utils.removeIfEmpty(FeedIndexLogsErrorDTO.mapping(bundle, `${keyPrefix}error`)),
            'offers': utils.removeIfEmpty(FeedIndexLogsOffersDTO.mapping(bundle, `${keyPrefix}offers`)),
        }
    },
}
