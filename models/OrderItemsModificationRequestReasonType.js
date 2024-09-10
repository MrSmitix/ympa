const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Причина обновления состава заказа. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PARTNER_REQUESTED_REMOVE',
                    'USER_REQUESTED_REMOVE',
                ],
            }
        )
    }
