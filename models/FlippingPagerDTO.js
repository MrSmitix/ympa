const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}total`,
                label: `Сколько всего найдено элементов. - [${labelPrefix}total]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}from`,
                label: `Начальный номер найденного элемента на странице. - [${labelPrefix}from]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}to`,
                label: `Конечный номер найденного элемента на странице. - [${labelPrefix}to]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}currentPage`,
                label: `Текущая страница. - [${labelPrefix}currentPage]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pagesCount`,
                label: `Общее количество страниц. - [${labelPrefix}pagesCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pageSize`,
                label: `Размер страницы. - [${labelPrefix}pageSize]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'from': bundle.inputData?.[`${keyPrefix}from`],
            'to': bundle.inputData?.[`${keyPrefix}to`],
            'currentPage': bundle.inputData?.[`${keyPrefix}currentPage`],
            'pagesCount': bundle.inputData?.[`${keyPrefix}pagesCount`],
            'pageSize': bundle.inputData?.[`${keyPrefix}pageSize`],
        }
    },
}
