const utils = require('../utils/utils');
const LicenseCheckStatusType = require('../models/LicenseCheckStatusType');
const LicenseType = require('../models/LicenseType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.  - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}outletId`,
                label: `Идентификатор точки продаж, для которой действительна лицензия. - [${labelPrefix}outletId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}licenseType`,
                ...LicenseType.fields(`${keyPrefix}licenseType`, isInput),
            },
            {
                key: `${keyPrefix}number`,
                label: `Номер лицензии. - [${labelPrefix}number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateOfIssue`,
                label: `Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.  - [${labelPrefix}dateOfIssue]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateOfExpiry`,
                label: `Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.  - [${labelPrefix}dateOfExpiry]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}checkStatus`,
                ...LicenseCheckStatusType.fields(`${keyPrefix}checkStatus`, isInput),
            },
            {
                key: `${keyPrefix}checkComment`,
                label: `Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`.  - [${labelPrefix}checkComment]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'outletId': bundle.inputData?.[`${keyPrefix}outletId`],
            'licenseType': bundle.inputData?.[`${keyPrefix}licenseType`],
            'number': bundle.inputData?.[`${keyPrefix}number`],
            'dateOfIssue': bundle.inputData?.[`${keyPrefix}dateOfIssue`],
            'dateOfExpiry': bundle.inputData?.[`${keyPrefix}dateOfExpiry`],
            'checkStatus': bundle.inputData?.[`${keyPrefix}checkStatus`],
            'checkComment': bundle.inputData?.[`${keyPrefix}checkComment`],
        }
    },
}
