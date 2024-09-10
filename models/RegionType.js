const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OTHER',
                    'CONTINENT',
                    'REGION',
                    'COUNTRY',
                    'COUNTRY_DISTRICT',
                    'REPUBLIC',
                    'CITY',
                    'VILLAGE',
                    'CITY_DISTRICT',
                    'SUBWAY_STATION',
                    'REPUBLIC_AREA',
                ],
            }
        )
    }
