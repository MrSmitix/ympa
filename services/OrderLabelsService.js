/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Готовый ярлык‑наклейка для коробки в заказе
* Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* shipmentId Long Идентификатор грузоместа.
* boxId Long Идентификатор коробки.
* format PageFormatType Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
* returns File
* */
const generateOrderLabel = ({ campaignId, orderId, shipmentId, boxId, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        shipmentId,
        boxId,
        format,
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
* Готовые ярлыки‑наклейки на все коробки в одном заказе
* Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* format PageFormatType Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
* returns File
* */
const generateOrderLabels = ({ campaignId, orderId, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
        format,
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
* Данные для самостоятельного изготовления ярлыков
* Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* orderId Long Идентификатор заказа.
* returns GetOrderLabelsDataResponse
* */
const getOrderLabelsData = ({ campaignId, orderId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        orderId,
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
  generateOrderLabel,
  generateOrderLabels,
  getOrderLabelsData,
};
