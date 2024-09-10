/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Создание точки продаж
* Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* changeOutletRequest ChangeOutletRequest 
* returns CreateOutletResponse
* */
const createOutlet = ({ campaignId, changeOutletRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        changeOutletRequest,
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
* Удаление точки продаж
* Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* outletId Long Идентификатор точки продаж.
* returns EmptyApiResponse
* */
const deleteOutlet = ({ campaignId, outletId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        outletId,
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
* Информация об одной точке продаж
* Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* outletId Long Идентификатор точки продаж.
* returns GetOutletResponse
* */
const getOutlet = ({ campaignId, outletId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        outletId,
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
* Информация о нескольких точках продаж
* Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* pageUnderscoretoken String Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
* regionUnderscoreid Long Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  (optional)
* shopUnderscoreoutletUnderscorecode String Идентификатор точки продаж, присвоенный магазином. (optional)
* regionId Long {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %}  (optional)
* returns GetOutletsResponse
* */
const getOutlets = ({ campaignId, pageUnderscoretoken, regionUnderscoreid, shopUnderscoreoutletUnderscorecode, regionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        pageUnderscoretoken,
        regionUnderscoreid,
        shopUnderscoreoutletUnderscorecode,
        regionId,
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
* Изменение информации о точке продаж
* Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
*
* campaignId Long Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
* outletId Long Идентификатор точки продаж.
* changeOutletRequest ChangeOutletRequest 
* returns EmptyApiResponse
* */
const updateOutlet = ({ campaignId, outletId, changeOutletRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        campaignId,
        outletId,
        changeOutletRequest,
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
  createOutlet,
  deleteOutlet,
  getOutlet,
  getOutlets,
  updateOutlet,
};
