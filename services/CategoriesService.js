/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Лимит на установку кванта продажи и минимального количества товаров в заказе
* Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* getCategoriesMaxSaleQuantumRequest GetCategoriesMaxSaleQuantumRequest 
* returns GetCategoriesMaxSaleQuantumResponse
* */
const getCategoriesMaxSaleQuantum = ({ getCategoriesMaxSaleQuantumRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        getCategoriesMaxSaleQuantumRequest,
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
* Дерево категорий
* Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
*
* getCategoriesRequest GetCategoriesRequest  (optional)
* returns GetCategoriesResponse
* */
const getCategoriesTree = ({ getCategoriesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        getCategoriesRequest,
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
  getCategoriesMaxSaleQuantum,
  getCategoriesTree,
};
