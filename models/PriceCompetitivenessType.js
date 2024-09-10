const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OPTIMAL',
                    'AVERAGE',
                    'LOW',
                ],
            }
        )
    }
