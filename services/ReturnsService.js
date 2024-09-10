/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Информация о невыкупе или возврате
* Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returnId Long Идентификатор возврата.
* returns GetReturnResponse
* */
const getReturn = ({ campaignId, orderId, returnId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        returnId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Получение заявления на возврат
* Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returnId Long Идентификатор возврата.
* returns File
* */
const getReturnApplication = ({ campaignId, orderId, returnId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        returnId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Получение фотографии возврата
* Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returnId Long Идентификатор возврата.
* itemId Long Идентификатор товара в возврате.
* imageHash String Хеш ссылки изображения для загрузки.
* returns File
* */
const getReturnPhoto = ({ campaignId, orderId, returnId, itemId, imageHash }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        returnId,
        itemId,
        imageHash,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Список невыкупов и возвратов
* Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* limit Integer Количество значений на одной странице.  (optional)
* orderIds List Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  (optional)
* statuses List Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  (optional)
* type ReturnType Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  (optional)
* fromDate date Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`.  (optional)
* toDate date Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`.  (optional)
* fromUnderscoredate date {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional)
* toUnderscoredate date {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional)
* returns GetReturnsResponse
* */
const getReturns = ({ campaignId, pageUnderscoretoken, limit, orderIds, statuses, type, fromDate, toDate, fromUnderscoredate, toUnderscoredate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        pageUnderscoretoken,
        limit,
        orderIds,
        statuses,
        type,
        fromDate,
        toDate,
        fromUnderscoredate,
        toUnderscoredate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Принятие или изменение решения по возврату
* Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returnId Long Идентификатор возврата.
* setReturnDecisionRequest SetReturnDecisionRequest 
* returns EmptyApiResponse
* */
const setReturnDecision = ({ campaignId, orderId, returnId, setReturnDecisionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        returnId,
        setReturnDecisionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Подтверждение решения по возврату
* Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returnId Long Идентификатор возврата.
* returns EmptyApiResponse
* */
const submitReturnDecision = ({ campaignId, orderId, returnId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        returnId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getReturn,
  getReturnApplication,
  getReturnPhoto,
  getReturns,
  setReturnDecision,
  submitReturnDecision,
};
