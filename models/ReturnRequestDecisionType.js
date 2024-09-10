const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Решение по возврату. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REFUND_MONEY',
                    'REFUND_MONEY_INCLUDING_SHIPMENT',
                    'REPAIR',
                    'REPLACE',
                    'SEND_TO_EXAMINATION',
                    'DECLINE_REFUND',
                    'OTHER_DECISION',
                ],
            }
        )
    }
