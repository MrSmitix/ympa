const utils = require('../utils/utils');
const GpsDTO = require('../models/GpsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                label: `Страна.  Обязательный параметр.  - [${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}postcode`,
                label: `Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  - [${labelPrefix}postcode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}city`,
                label: `Город или населенный пункт.  Обязательный параметр.  - [${labelPrefix}city]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}district`,
                label: `Район. - [${labelPrefix}district]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}subway`,
                label: `Станция метро. - [${labelPrefix}subway]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}street`,
                label: `Улица.  Обязательный параметр.  - [${labelPrefix}street]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}house`,
                label: `Дом или владение.  Обязательный параметр.  - [${labelPrefix}house]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}block`,
                label: `Корпус или строение. - [${labelPrefix}block]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entrance`,
                label: `Подъезд. - [${labelPrefix}entrance]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entryphone`,
                label: `Код домофона. - [${labelPrefix}entryphone]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}floor`,
                label: `Этаж. - [${labelPrefix}floor]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}apartment`,
                label: `Квартира или офис. - [${labelPrefix}apartment]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}phone`,
                label: `Телефон получателя заказа.  Обязательный параметр.  - [${labelPrefix}phone]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}recipient`,
                label: `Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  - [${labelPrefix}recipient]`,
                type: 'string',
            },
            ...GpsDTO.fields(`${keyPrefix}gps`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'postcode': bundle.inputData?.[`${keyPrefix}postcode`],
            'city': bundle.inputData?.[`${keyPrefix}city`],
            'district': bundle.inputData?.[`${keyPrefix}district`],
            'subway': bundle.inputData?.[`${keyPrefix}subway`],
            'street': bundle.inputData?.[`${keyPrefix}street`],
            'house': bundle.inputData?.[`${keyPrefix}house`],
            'block': bundle.inputData?.[`${keyPrefix}block`],
            'entrance': bundle.inputData?.[`${keyPrefix}entrance`],
            'entryphone': bundle.inputData?.[`${keyPrefix}entryphone`],
            'floor': bundle.inputData?.[`${keyPrefix}floor`],
            'apartment': bundle.inputData?.[`${keyPrefix}apartment`],
            'phone': bundle.inputData?.[`${keyPrefix}phone`],
            'recipient': bundle.inputData?.[`${keyPrefix}recipient`],
            'gps': utils.removeIfEmpty(GpsDTO.mapping(bundle, `${keyPrefix}gps`)),
        }
    },
}
