const utils = require('../utils/utils');
const CampaignSettingsDeliveryDTO = require('../models/CampaignSettingsDeliveryDTO');
const CampaignSettingsScheduleSourceType = require('../models/CampaignSettingsScheduleSourceType');
const RegionType = require('../models/RegionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор региона. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название региона. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...RegionType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}deliveryOptionsSource`,
                ...CampaignSettingsScheduleSourceType.fields(`${keyPrefix}deliveryOptionsSource`, isInput),
            },
            ...CampaignSettingsDeliveryDTO.fields(`${keyPrefix}delivery`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'deliveryOptionsSource': bundle.inputData?.[`${keyPrefix}deliveryOptionsSource`],
            'delivery': utils.removeIfEmpty(CampaignSettingsDeliveryDTO.mapping(bundle, `${keyPrefix}delivery`)),
        }
    },
}
