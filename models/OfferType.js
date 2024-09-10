const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %}  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DEFAULT',
                    'MEDICINE',
                    'BOOK',
                    'AUDIOBOOK',
                    'ARTIST_TITLE',
                    'ON_DEMAND',
                ],
            }
        )
    }
