const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html)  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'HAS_CARD_CAN_NOT_UPDATE',
                    'HAS_CARD_CAN_UPDATE',
                    'HAS_CARD_CAN_UPDATE_ERRORS',
                    'HAS_CARD_CAN_UPDATE_PROCESSING',
                    'NO_CARD_NEED_CONTENT',
                    'NO_CARD_MARKET_WILL_CREATE',
                    'NO_CARD_ERRORS',
                    'NO_CARD_PROCESSING',
                    'NO_CARD_ADD_TO_CAMPAIGN',
                ],
            }
        )
    }
