const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CONFIRM',
                    'DOWNLOAD_ACT',
                    'DOWNLOAD_INBOUND_ACT',
                    'DOWNLOAD_DISCREPANCY_ACT',
                    'CHANGE_PALLETS_COUNT',
                ],
            }
        )
    }
