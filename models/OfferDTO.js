const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}price`,
                label: `Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}feedId`,
                label: `Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  - [${labelPrefix}feedId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shopCategoryId`,
                label: `Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  - [${labelPrefix}shopCategoryId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketCategoryId`,
                label: `Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  - [${labelPrefix}marketCategoryId]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}preDiscountPrice`,
                label: `Цена предложения без скидки. - [${labelPrefix}preDiscountPrice]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}discount`,
                label: `Скидка на предложение в процентах. - [${labelPrefix}discount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cutPrice`,
                label: `Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  - [${labelPrefix}cutPrice]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}url`,
                label: `URL-адрес предложения на сайте магазина. - [${labelPrefix}url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}modelId`,
                label: `Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %}  - [${labelPrefix}modelId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Наименование предложения. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}currency`,
                ...CurrencyType.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}bid`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  - [${labelPrefix}bid]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cbid`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  - [${labelPrefix}cbid]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}fee`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  - [${labelPrefix}fee]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}blocked`,
                label: `Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  - [${labelPrefix}blocked]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'feedId': bundle.inputData?.[`${keyPrefix}feedId`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'shopCategoryId': bundle.inputData?.[`${keyPrefix}shopCategoryId`],
            'marketCategoryId': bundle.inputData?.[`${keyPrefix}marketCategoryId`],
            'preDiscountPrice': bundle.inputData?.[`${keyPrefix}preDiscountPrice`],
            'discount': bundle.inputData?.[`${keyPrefix}discount`],
            'cutPrice': bundle.inputData?.[`${keyPrefix}cutPrice`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'modelId': bundle.inputData?.[`${keyPrefix}modelId`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'bid': bundle.inputData?.[`${keyPrefix}bid`],
            'cbid': bundle.inputData?.[`${keyPrefix}cbid`],
            'fee': bundle.inputData?.[`${keyPrefix}fee`],
            'blocked': bundle.inputData?.[`${keyPrefix}blocked`],
        }
    },
}
