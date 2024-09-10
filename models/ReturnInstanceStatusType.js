const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Логистический статус конкретного товара. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CREATED',
                    'RECEIVED',
                    'IN_TRANSIT',
                    'READY_FOR_PICKUP',
                    'PICKED',
                    'RECEIVED_ON_FULFILLMENT',
                    'CANCELLED',
                    'LOST',
                    'UTILIZED',
                    'PREPARED_FOR_UTILIZATION',
                    'EXPROPRIATED',
                    'NOT_IN_DEMAND',
                ],
            }
        )
    }
