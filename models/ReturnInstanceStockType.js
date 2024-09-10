const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип остатка на складе. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FIT',
                    'DEFECT',
                    'ANOMALY',
                    'SURPLUS',
                    'EXPIRED',
                    'MISGRADING',
                    'UNDEFINED',
                    'INCORRECT_IMEI',
                    'INCORRECT_SERIAL_NUMBER',
                    'INCORRECT_CIS',
                    'PART_MISSING',
                    'NON_COMPLIENT',
                    'NOT_ACCEPTABLE',
                    'SERVICE',
                    'MARKDOWN',
                    'DEMO',
                    'REPAIR',
                    'FIRMWARE',
                    'UNKNOWN',
                ],
            }
        )
    }
