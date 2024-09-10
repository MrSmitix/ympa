const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FIT',
                    'FREEZE',
                    'AVAILABLE',
                    'QUARANTINE',
                    'UTILIZATION',
                    'DEFECT',
                    'EXPIRED',
                ],
            }
        )
    }
