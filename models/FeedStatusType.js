const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ERROR',
                    'NA',
                    'OK',
                ],
            }
        )
    }
