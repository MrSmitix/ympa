const utils = require('../utils/utils');
const FeedContentDTO = require('../models/FeedContentDTO');
const FeedDownloadDTO = require('../models/FeedDownloadDTO');
const FeedPlacementDTO = require('../models/FeedPlacementDTO');
const FeedPublicationDTO = require('../models/FeedPublicationDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор прайс-листа. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}login`,
                label: `Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  - [${labelPrefix}login]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}password`,
                label: `Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  - [${labelPrefix}password]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}uploadDate`,
                label: `Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  - [${labelPrefix}uploadDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  - [${labelPrefix}url]`,
                type: 'string',
            },
            ...FeedContentDTO.fields(`${keyPrefix}content`, isInput),
            ...FeedDownloadDTO.fields(`${keyPrefix}download`, isInput),
            ...FeedPlacementDTO.fields(`${keyPrefix}placement`, isInput),
            ...FeedPublicationDTO.fields(`${keyPrefix}publication`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'login': bundle.inputData?.[`${keyPrefix}login`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'password': bundle.inputData?.[`${keyPrefix}password`],
            'uploadDate': bundle.inputData?.[`${keyPrefix}uploadDate`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'content': utils.removeIfEmpty(FeedContentDTO.mapping(bundle, `${keyPrefix}content`)),
            'download': utils.removeIfEmpty(FeedDownloadDTO.mapping(bundle, `${keyPrefix}download`)),
            'placement': utils.removeIfEmpty(FeedPlacementDTO.mapping(bundle, `${keyPrefix}placement`)),
            'publication': utils.removeIfEmpty(FeedPublicationDTO.mapping(bundle, `${keyPrefix}publication`)),
        }
    },
}
