const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DEPOT',
                    'MIXED',
                    'RETAIL',
                    'NOT_DEFINED',
                ],
            }
        )
    }
