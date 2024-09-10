# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_fastapi_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_fastapi_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_fastapi_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest
from ympa_python_fastapi_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest
from ympa_python_fastapi_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest
from ympa_python_fastapi_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest
from ympa_python_fastapi_server.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_fastapi_server.models.generate_report_response import GenerateReportResponse
from ympa_python_fastapi_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_fastapi_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest
from ympa_python_fastapi_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_fastapi_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_fastapi_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_fastapi_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_fastapi_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_fastapi_server.models.get_report_info_response import GetReportInfoResponse
from ympa_python_fastapi_server.models.page_format_type import PageFormatType
from ympa_python_fastapi_server.models.report_format_type import ReportFormatType
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseReportsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseReportsApi.subclasses = BaseReportsApi.subclasses + (cls,)
    async def generate_boost_consolidated_report(
        self,
        generate_boost_consolidated_request: GenerateBoostConsolidatedRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_competitors_position_report(
        self,
        generate_competitors_position_report_request: GenerateCompetitorsPositionReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| """
        ...


    async def generate_goods_feedback_report(
        self,
        generate_goods_feedback_request: GenerateGoodsFeedbackRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_movement_report(
        self,
        generate_goods_movement_report_request: GenerateGoodsMovementReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_realization_report(
        self,
        generate_goods_realization_report_request: GenerateGoodsRealizationReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_turnover_report(
        self,
        generate_goods_turnover_request: GenerateGoodsTurnoverRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_mass_order_labels_report(
        self,
        generate_mass_order_labels_request: GenerateMassOrderLabelsRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def generate_prices_report(
        self,
        generate_prices_report_request: GeneratePricesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_shelfs_statistics_report(
        self,
        generate_shelfs_statistics_request: GenerateShelfsStatisticsRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_shipment_list_document_report(
        self,
        generate_shipment_list_document_report_request: GenerateShipmentListDocumentReportRequest,
    ) -> GenerateReportResponse:
        """Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_shows_sales_report(
        self,
        generate_shows_sales_report_request: GenerateShowsSalesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| """
        ...


    async def generate_stocks_on_warehouses_report(
        self,
        generate_stocks_on_warehouses_report_request: GenerateStocksOnWarehousesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_marketplace_services_report(
        self,
        generate_united_marketplace_services_report_request: GenerateUnitedMarketplaceServicesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_netting_report(
        self,
        generate_united_netting_report_request: GenerateUnitedNettingReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_orders_report(
        self,
        generate_united_orders_request: GenerateUnitedOrdersRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def get_report_info(
        self,
        reportId: str,
    ) -> GetReportInfoResponse:
        """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...
