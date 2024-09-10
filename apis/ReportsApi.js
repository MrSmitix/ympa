const samples = require('../samples/ReportsApi');
const ApiClientDataErrorResponse = require('../models/ApiClientDataErrorResponse');
const ApiForbiddenErrorResponse = require('../models/ApiForbiddenErrorResponse');
const ApiLimitErrorResponse = require('../models/ApiLimitErrorResponse');
const ApiNotFoundErrorResponse = require('../models/ApiNotFoundErrorResponse');
const ApiServerErrorResponse = require('../models/ApiServerErrorResponse');
const ApiUnauthorizedErrorResponse = require('../models/ApiUnauthorizedErrorResponse');
const GenerateBoostConsolidatedRequest = require('../models/GenerateBoostConsolidatedRequest');
const GenerateCompetitorsPositionReportRequest = require('../models/GenerateCompetitorsPositionReportRequest');
const GenerateGoodsFeedbackRequest = require('../models/GenerateGoodsFeedbackRequest');
const GenerateGoodsMovementReportRequest = require('../models/GenerateGoodsMovementReportRequest');
const GenerateGoodsRealizationReportRequest = require('../models/GenerateGoodsRealizationReportRequest');
const GenerateGoodsTurnoverRequest = require('../models/GenerateGoodsTurnoverRequest');
const GenerateMassOrderLabelsRequest = require('../models/GenerateMassOrderLabelsRequest');
const GeneratePricesReportRequest = require('../models/GeneratePricesReportRequest');
const GenerateReportResponse = require('../models/GenerateReportResponse');
const GenerateShelfsStatisticsRequest = require('../models/GenerateShelfsStatisticsRequest');
const GenerateShipmentListDocumentReportRequest = require('../models/GenerateShipmentListDocumentReportRequest');
const GenerateShowsSalesReportRequest = require('../models/GenerateShowsSalesReportRequest');
const GenerateStocksOnWarehousesReportRequest = require('../models/GenerateStocksOnWarehousesReportRequest');
const GenerateUnitedMarketplaceServicesReportRequest = require('../models/GenerateUnitedMarketplaceServicesReportRequest');
const GenerateUnitedNettingReportRequest = require('../models/GenerateUnitedNettingReportRequest');
const GenerateUnitedOrdersRequest = require('../models/GenerateUnitedOrdersRequest');
const GetReportInfoResponse = require('../models/GetReportInfoResponse');
const PageFormatType = require('../models/PageFormatType');
const ReportFormatType = require('../models/ReportFormatType');
const utils = require('../utils/utils');

module.exports = {
    generateBoostConsolidatedReport: {
        key: 'generateBoostConsolidatedReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет по бусту продаж',
            description: 'Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateBoostConsolidatedRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/boost-consolidated/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateBoostConsolidatedRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateCompetitorsPositionReport: {
        key: 'generateCompetitorsPositionReport',
        noun: 'reportsfbydbsfbsexpress',
        display: {
            label: 'Отчет «Конкурентная позиция»',
            description: 'Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateCompetitorsPositionReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/competitors-position/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateCompetitorsPositionReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateGoodsFeedbackReport: {
        key: 'generateGoodsFeedbackReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет по отзывам о товарах',
            description: 'Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateGoodsFeedbackRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/goods-feedback/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateGoodsFeedbackRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateGoodsMovementReport: {
        key: 'generateGoodsMovementReport',
        noun: 'reportsfby',
        display: {
            label: 'Отчет по движению товаров',
            description: 'Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateGoodsMovementReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/goods-movement/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateGoodsMovementReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateGoodsRealizationReport: {
        key: 'generateGoodsRealizationReport',
        noun: 'reportsfbyfbsexpress',
        display: {
            label: 'Отчет по реализации',
            description: 'Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateGoodsRealizationReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/goods-realization/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateGoodsRealizationReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateGoodsTurnoverReport: {
        key: 'generateGoodsTurnoverReport',
        noun: 'reportsfby',
        display: {
            label: 'Отчет по оборачиваемости',
            description: 'Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateGoodsTurnoverRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/goods-turnover/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateGoodsTurnoverRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateMassOrderLabelsReport: {
        key: 'generateMassOrderLabelsReport',
        noun: 'reportsfbsdbsexpress',
        display: {
            label: 'Готовые ярлыки‑наклейки на все коробки в нескольких заказах',
            description: 'Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateMassOrderLabelsRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/documents/labels/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateMassOrderLabelsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generatePricesReport: {
        key: 'generatePricesReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет «Цены на рынке»',
            description: 'Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GeneratePricesReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/prices/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GeneratePricesReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateShelfsStatisticsReport: {
        key: 'generateShelfsStatisticsReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет по полкам',
            description: 'Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateShelfsStatisticsRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/shelf-statistics/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateShelfsStatisticsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateShipmentListDocumentReport: {
        key: 'generateShipmentListDocumentReport',
        noun: 'reportsfbs',
        display: {
            label: 'Получение листа сборки',
            description: 'Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateShipmentListDocumentReportRequest.fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/documents/shipment-list/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...GenerateShipmentListDocumentReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateShowsSalesReport: {
        key: 'generateShowsSalesReport',
        noun: 'reportsfbydbsfbsexpress',
        display: {
            label: 'Отчет «Аналитика продаж»',
            description: 'Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateShowsSalesReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/shows-sales/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateShowsSalesReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateStocksOnWarehousesReport: {
        key: 'generateStocksOnWarehousesReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет по остаткам на складах',
            description: 'Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateStocksOnWarehousesReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/stocks-on-warehouses/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateStocksOnWarehousesReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateUnitedMarketplaceServicesReport: {
        key: 'generateUnitedMarketplaceServicesReport',
        noun: 'reportsfbydbsfbsexpress',
        display: {
            label: 'Отчет по стоимости услуг',
            description: 'Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateUnitedMarketplaceServicesReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/united-marketplace-services/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateUnitedMarketplaceServicesReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateUnitedNettingReport: {
        key: 'generateUnitedNettingReport',
        noun: 'reportsfbydbsfbsexpress',
        display: {
            label: 'Отчет по платежам',
            description: 'Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateUnitedNettingReportRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/united-netting/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateUnitedNettingReportRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    generateUnitedOrdersReport: {
        key: 'generateUnitedOrdersReport',
        noun: 'reportsfbyfbsdbsexpress',
        display: {
            label: 'Отчет по заказам',
            description: 'Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...GenerateUnitedOrdersRequest.fields(),
                ....fields(),
            ],
            outputFields: [
                ...GenerateReportResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/united-orders/generate'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                    },
                    body: {
                        ...GenerateUnitedOrdersRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GenerateReportResponseSample']
        }
    },
    getReportInfo: {
        key: 'getReportInfo',
        noun: 'reportsfbydbsfbsexpress',
        display: {
            label: 'Получение заданного отчета',
            description: 'Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'reportId',
                    label: 'Идентификатор отчета, который вы получили после запуска генерации. ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...GetReportInfoResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.partner.market.yandex.ru/reports/info/{reportId}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['GetReportInfoResponseSample']
        }
    },
}
