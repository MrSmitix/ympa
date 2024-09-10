const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ASC',
                    'DESC',
                ],
            }
        )
    }
