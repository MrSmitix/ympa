# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_prices_report_request import GeneratePricesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_report_response import GenerateReportResponse  # noqa: F401
from ympa_python_fastapi_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_report_info_response import GetReportInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.page_format_type import PageFormatType  # noqa: F401
from ympa_python_fastapi_server.models.report_format_type import ReportFormatType  # noqa: F401


def test_generate_boost_consolidated_report(client: TestClient):
    """Test case for generate_boost_consolidated_report

    Отчет по бусту продаж
    """
    generate_boost_consolidated_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/boost-consolidated/generate",
    #    headers=headers,
    #    json=generate_boost_consolidated_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_competitors_position_report(client: TestClient):
    """Test case for generate_competitors_position_report

    Отчет «Конкурентная позиция»
    """
    generate_competitors_position_report_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","category_id":6}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/competitors-position/generate",
    #    headers=headers,
    #    json=generate_competitors_position_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_feedback_report(client: TestClient):
    """Test case for generate_goods_feedback_report

    Отчет по отзывам о товарах
    """
    generate_goods_feedback_request = {"business_id":0}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-feedback/generate",
    #    headers=headers,
    #    json=generate_goods_feedback_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_movement_report(client: TestClient):
    """Test case for generate_goods_movement_report

    Отчет по движению товаров
    """
    generate_goods_movement_report_request = {"shop_sku":"shopSku","campaign_id":0,"date_to":"2000-01-23","date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-movement/generate",
    #    headers=headers,
    #    json=generate_goods_movement_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_realization_report(client: TestClient):
    """Test case for generate_goods_realization_report

    Отчет по реализации
    """
    generate_goods_realization_report_request = {"month":2,"year":6,"campaign_id":0}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-realization/generate",
    #    headers=headers,
    #    json=generate_goods_realization_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_turnover_report(client: TestClient):
    """Test case for generate_goods_turnover_report

    Отчет по оборачиваемости
    """
    generate_goods_turnover_request = {"date":"2000-01-23","campaign_id":0}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-turnover/generate",
    #    headers=headers,
    #    json=generate_goods_turnover_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_mass_order_labels_report(client: TestClient):
    """Test case for generate_mass_order_labels_report

    Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    """
    generate_mass_order_labels_request = {"business_id":0,"order_ids":[6,6,6,6,6]}
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/documents/labels/generate",
    #    headers=headers,
    #    json=generate_mass_order_labels_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_prices_report(client: TestClient):
    """Test case for generate_prices_report

    Отчет «Цены на рынке»
    """
    generate_prices_report_request = {"category_ids":[1,1],"creation_date_to":"2000-01-23","campaign_id":6,"business_id":0,"creation_date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/prices/generate",
    #    headers=headers,
    #    json=generate_prices_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shelfs_statistics_report(client: TestClient):
    """Test case for generate_shelfs_statistics_report

    Отчет по полкам
    """
    generate_shelfs_statistics_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","attribution_type":"CLICKS"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/shelf-statistics/generate",
    #    headers=headers,
    #    json=generate_shelfs_statistics_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shipment_list_document_report(client: TestClient):
    """Test case for generate_shipment_list_document_report

    Получение листа сборки
    """
    generate_shipment_list_document_report_request = {"campaign_id":0,"shipment_id":6,"order_ids":[1,1]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/documents/shipment-list/generate",
    #    headers=headers,
    #    json=generate_shipment_list_document_report_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shows_sales_report(client: TestClient):
    """Test case for generate_shows_sales_report

    Отчет «Аналитика продаж»
    """
    generate_shows_sales_report_request = {"campaign_id":6,"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","grouping":"CATEGORIES"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/shows-sales/generate",
    #    headers=headers,
    #    json=generate_shows_sales_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_stocks_on_warehouses_report(client: TestClient):
    """Test case for generate_stocks_on_warehouses_report

    Отчет по остаткам на складах
    """
    generate_stocks_on_warehouses_report_request = {"category_ids":[1,1],"has_stocks":1,"report_date":"2000-01-23","campaign_id":0,"warehouse_ids":[6,6]}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/stocks-on-warehouses/generate",
    #    headers=headers,
    #    json=generate_stocks_on_warehouses_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_marketplace_services_report(client: TestClient):
    """Test case for generate_united_marketplace_services_report

    Отчет по стоимости услуг
    """
    generate_united_marketplace_services_report_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","year_from":6,"placement_programs":["FBS","FBS"],"business_id":0,"date_to":"2000-01-23","month_from":2,"date_time_to":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaign_ids":[2,2],"date_from":"2000-01-23","month_to":7,"year_to":5}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-marketplace-services/generate",
    #    headers=headers,
    #    json=generate_united_marketplace_services_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_netting_report(client: TestClient):
    """Test case for generate_united_netting_report

    Отчет по платежам
    """
    generate_united_netting_report_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","bank_order_id":6,"placement_programs":["FBS","FBS"],"business_id":0,"date_to":"2000-01-23","date_time_to":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaign_ids":[1,1],"date_from":"2000-01-23","bank_order_date_time":"2000-01-23T04:56:07.000+00:00"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-netting/generate",
    #    headers=headers,
    #    json=generate_united_netting_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_orders_report(client: TestClient):
    """Test case for generate_united_orders_report

    Отчет по заказам
    """
    generate_united_orders_request = {"business_id":0,"date_to":"2000-01-23","campaign_ids":[6,6],"promo_id":"promoId","date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-orders/generate",
    #    headers=headers,
    #    json=generate_united_orders_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_report_info(client: TestClient):
    """Test case for get_report_info

    Получение заданного отчета
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/reports/info/{reportId}".format(reportId='report_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

