/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Создание нового чата с покупателем
* Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* createChatRequest CreateChatRequest description
* returns CreateChatResponse
* */
const createChat = ({ businessId, createChatRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        createChatRequest,
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
* Получение истории сообщений в чате
* Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* chatId Long Идентификатор чата.
* getChatHistoryRequest GetChatHistoryRequest description
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* limit Integer Количество значений на одной странице.  (optional)
* returns GetChatHistoryResponse
* */
const getChatHistory = ({ businessId, chatId, getChatHistoryRequest, pageUnderscoretoken, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        chatId,
        getChatHistoryRequest,
        pageUnderscoretoken,
        limit,
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
* Получение доступных чатов
* Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* getChatsRequest GetChatsRequest description
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* limit Integer Количество значений на одной странице.  (optional)
* returns GetChatsResponse
* */
const getChats = ({ businessId, getChatsRequest, pageUnderscoretoken, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        getChatsRequest,
        pageUnderscoretoken,
        limit,
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
* Отправка файла в чат
* Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* chatId Long Идентификатор чата.
* file File Содержимое файла. Максимальный размер файла — 5 Мбайт.
* returns EmptyApiResponse
* */
const sendFileToChat = ({ businessId, chatId, file }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        chatId,
        file,
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
* Отправка сообщения в чат
* Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* chatId Long Идентификатор чата.
* sendMessageToChatRequest SendMessageToChatRequest description
* returns EmptyApiResponse
* */
const sendMessageToChat = ({ businessId, chatId, sendMessageToChatRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        chatId,
        sendMessageToChatRequest,
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
  createChat,
  getChatHistory,
  getChats,
  sendFileToChat,
  sendMessageToChat,
};
