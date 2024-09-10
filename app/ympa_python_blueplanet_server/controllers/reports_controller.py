import connexion

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_prices_report_request import GeneratePricesReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_report_response import GenerateReportResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_report_info_response import GetReportInfoResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.page_format_type import PageFormatType  # noqa: E501
from app.ympa_python_blueplanet_server.models.report_format_type import ReportFormatType  # noqa: E501
from ympa_python_blueplanet_server import util


def generate_boost_consolidated_report(body, format=None):  # noqa: E501
    """Отчет по бусту продаж

    Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateBoostConsolidatedRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_competitors_position_report(body, format=None):  # noqa: E501
    """Отчет «Конкурентная позиция»

    Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateCompetitorsPositionReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_feedback_report(body, format=None):  # noqa: E501
    """Отчет по отзывам о товарах

    Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateGoodsFeedbackRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_movement_report(body, format=None):  # noqa: E501
    """Отчет по движению товаров

    Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateGoodsMovementReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_realization_report(body, format=None):  # noqa: E501
    """Отчет по реализации

    Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateGoodsRealizationReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_turnover_report(body, format=None):  # noqa: E501
    """Отчет по оборачиваемости

    Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateGoodsTurnoverRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_mass_order_labels_report(body, format=None):  # noqa: E501
    """Готовые ярлыки‑наклейки на все коробки в нескольких заказах

    Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateMassOrderLabelsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_prices_report(body, format=None):  # noqa: E501
    """Отчет «Цены на рынке»

    Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GeneratePricesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_shelfs_statistics_report(body, format=None):  # noqa: E501
    """Отчет по полкам

    Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateShelfsStatisticsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_shipment_list_document_report(body):  # noqa: E501
    """Получение листа сборки

    Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateShipmentListDocumentReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_shows_sales_report(body, format=None):  # noqa: E501
    """Отчет «Аналитика продаж»

    Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateShowsSalesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_stocks_on_warehouses_report(body, format=None):  # noqa: E501
    """Отчет по остаткам на складах

    Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateStocksOnWarehousesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_marketplace_services_report(body, format=None):  # noqa: E501
    """Отчет по стоимости услуг

    Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateUnitedMarketplaceServicesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_netting_report(body, format=None):  # noqa: E501
    """Отчет по платежам

    Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateUnitedNettingReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_orders_report(body, format=None):  # noqa: E501
    """Отчет по заказам

    Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: GenerateReportResponse
    """
    if connexion.request.is_json:
        body = GenerateUnitedOrdersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_report_info(report_id):  # noqa: E501
    """Получение заданного отчета

    Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param report_id: Идентификатор отчета, который вы получили после запуска генерации. 
    :type report_id: str

    :rtype: GetReportInfoResponse
    """
    return 'do some magic!'