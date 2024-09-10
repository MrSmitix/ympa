const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Вид маппинга. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'ALL',
                ],
            }
        )
    }
