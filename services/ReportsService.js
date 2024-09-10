/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Отчет по бусту продаж
* Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateBoostConsolidatedRequest GenerateBoostConsolidatedRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateBoostConsolidatedReport = ({ generateBoostConsolidatedRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateBoostConsolidatedRequest,
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
* Отчет «Конкурентная позиция»
* Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
*
* generateCompetitorsPositionReportRequest GenerateCompetitorsPositionReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateCompetitorsPositionReport = ({ generateCompetitorsPositionReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateCompetitorsPositionReportRequest,
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
* Отчет по отзывам о товарах
* Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateGoodsFeedbackRequest GenerateGoodsFeedbackRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateGoodsFeedbackReport = ({ generateGoodsFeedbackRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateGoodsFeedbackRequest,
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
* Отчет по движению товаров
* Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateGoodsMovementReportRequest GenerateGoodsMovementReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateGoodsMovementReport = ({ generateGoodsMovementReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateGoodsMovementReportRequest,
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
* Отчет по реализации
* Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateGoodsRealizationReportRequest GenerateGoodsRealizationReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateGoodsRealizationReport = ({ generateGoodsRealizationReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateGoodsRealizationReportRequest,
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
* Отчет по оборачиваемости
* Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateGoodsTurnoverRequest GenerateGoodsTurnoverRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateGoodsTurnoverReport = ({ generateGoodsTurnoverRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateGoodsTurnoverRequest,
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
* Готовые ярлыки‑наклейки на все коробки в нескольких заказах
* Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
*
* generateMassOrderLabelsRequest GenerateMassOrderLabelsRequest 
* format PageFormatType Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (optional)
* returns GenerateReportResponse
* */
const generateMassOrderLabelsReport = ({ generateMassOrderLabelsRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateMassOrderLabelsRequest,
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
* Отчет «Цены на рынке»
* Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generatePricesReportRequest GeneratePricesReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generatePricesReport = ({ generatePricesReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generatePricesReportRequest,
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
* Отчет по полкам
* Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateShelfsStatisticsRequest GenerateShelfsStatisticsRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateShelfsStatisticsReport = ({ generateShelfsStatisticsRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateShelfsStatisticsRequest,
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
* Получение листа сборки
* Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateShipmentListDocumentReportRequest GenerateShipmentListDocumentReportRequest 
* returns GenerateReportResponse
* */
const generateShipmentListDocumentReport = ({ generateShipmentListDocumentReportRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateShipmentListDocumentReportRequest,
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
* Отчет «Аналитика продаж»
* Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
*
* generateShowsSalesReportRequest GenerateShowsSalesReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateShowsSalesReport = ({ generateShowsSalesReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateShowsSalesReportRequest,
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
* Отчет по остаткам на складах
* Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateStocksOnWarehousesReportRequest GenerateStocksOnWarehousesReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateStocksOnWarehousesReport = ({ generateStocksOnWarehousesReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateStocksOnWarehousesReportRequest,
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
* Отчет по стоимости услуг
* Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateUnitedMarketplaceServicesReportRequest GenerateUnitedMarketplaceServicesReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateUnitedMarketplaceServicesReport = ({ generateUnitedMarketplaceServicesReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateUnitedMarketplaceServicesReportRequest,
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
* Отчет по платежам
* Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateUnitedNettingReportRequest GenerateUnitedNettingReportRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateUnitedNettingReport = ({ generateUnitedNettingReportRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateUnitedNettingReportRequest,
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
* Отчет по заказам
* Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
*
* generateUnitedOrdersRequest GenerateUnitedOrdersRequest 
* format ReportFormatType Формат отчета. (optional)
* returns GenerateReportResponse
* */
const generateUnitedOrdersReport = ({ generateUnitedOrdersRequest, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        generateUnitedOrdersRequest,
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
* Получение заданного отчета
* Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
*
* reportId String Идентификатор отчета, который вы получили после запуска генерации. 
* returns GetReportInfoResponse
* */
const getReportInfo = ({ reportId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        reportId,
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
  generateBoostConsolidatedReport,
  generateCompetitorsPositionReport,
  generateGoodsFeedbackReport,
  generateGoodsMovementReport,
  generateGoodsRealizationReport,
  generateGoodsTurnoverReport,
  generateMassOrderLabelsReport,
  generatePricesReport,
  generateShelfsStatisticsReport,
  generateShipmentListDocumentReport,
  generateShowsSalesReport,
  generateStocksOnWarehousesReport,
  generateUnitedMarketplaceServicesReport,
  generateUnitedNettingReport,
  generateUnitedOrdersReport,
  getReportInfo,
};
