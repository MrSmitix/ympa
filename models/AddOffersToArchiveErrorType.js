const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OFFER_HAS_STOCKS',
                    'UNKNOWN',
                ],
            }
        )
    }
