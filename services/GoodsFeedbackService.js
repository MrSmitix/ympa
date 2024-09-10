/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Удаление комментария к отзыву
* Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* deleteGoodsFeedbackCommentRequest DeleteGoodsFeedbackCommentRequest 
* returns EmptyApiResponse
* */
const deleteGoodsFeedbackComment = ({ businessId, deleteGoodsFeedbackCommentRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        deleteGoodsFeedbackCommentRequest,
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
* Получение комментариев к отзыву
* Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* getGoodsFeedbackCommentsRequest GetGoodsFeedbackCommentsRequest 
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* limit Integer Количество значений на одной странице.  (optional)
* returns GetGoodsFeedbackCommentsResponse
* */
const getGoodsFeedbackComments = ({ businessId, getGoodsFeedbackCommentsRequest, pageUnderscoretoken, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        getGoodsFeedbackCommentsRequest,
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
* Получение отзывов о товарах продавца
* Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* limit Integer Количество значений на одной странице.  (optional)
* getGoodsFeedbackRequest GetGoodsFeedbackRequest  (optional)
* returns GetGoodsFeedbackResponse
* */
const getGoodsFeedbacks = ({ businessId, pageUnderscoretoken, limit, getGoodsFeedbackRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        pageUnderscoretoken,
        limit,
        getGoodsFeedbackRequest,
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
* Отказ от ответа на отзывы
* Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* skipGoodsFeedbackReactionRequest SkipGoodsFeedbackReactionRequest 
* returns EmptyApiResponse
* */
const skipGoodsFeedbacksReaction = ({ businessId, skipGoodsFeedbackReactionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        skipGoodsFeedbackReactionRequest,
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
* Добавление нового или изменение созданного комментария
* Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* businessId Long Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* updateGoodsFeedbackCommentRequest UpdateGoodsFeedbackCommentRequest 
* returns UpdateGoodsFeedbackCommentResponse
* */
const updateGoodsFeedbackComment = ({ businessId, updateGoodsFeedbackCommentRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessId,
        updateGoodsFeedbackCommentRequest,
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
  deleteGoodsFeedbackComment,
  getGoodsFeedbackComments,
  getGoodsFeedbacks,
  skipGoodsFeedbacksReaction,
  updateGoodsFeedbackComment,
};
