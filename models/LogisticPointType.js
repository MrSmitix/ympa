const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'WAREHOUSE',
                    'PICKUP_POINT',
                    'PICKUP_TERMINAL',
                    'PICKUP_POST_OFFICE',
                    'PICKUP_MIXED',
                    'PICKUP_RETAIL',
                    'UNKNOWN',
                ],
            }
        )
    }
