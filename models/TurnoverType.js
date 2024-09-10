const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.|  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'LOW',
                    'ALMOST_LOW',
                    'HIGH',
                    'VERY_HIGH',
                    'NO_SALES',
                    'FREE_STORE',
                ],
            }
        )
    }
