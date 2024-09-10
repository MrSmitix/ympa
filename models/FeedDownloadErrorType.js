const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DOWNLOAD_ERROR',
                    'DOWNLOAD_HTTP_ERROR',
                ],
            }
        )
    }
