/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Справочник служб доставки
* Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
*
* returns GetDeliveryServicesResponse
* */
const getDeliveryServices = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  getDeliveryServices,
};
