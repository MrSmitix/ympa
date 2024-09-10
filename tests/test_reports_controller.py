# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_aiohttp_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_aiohttp_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_aiohttp_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest
from ympa_python_aiohttp_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest
from ympa_python_aiohttp_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest
from ympa_python_aiohttp_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest
from ympa_python_aiohttp_server.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_aiohttp_server.models.generate_report_response import GenerateReportResponse
from ympa_python_aiohttp_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_aiohttp_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest
from ympa_python_aiohttp_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_aiohttp_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_aiohttp_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_aiohttp_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_aiohttp_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_aiohttp_server.models.get_report_info_response import GetReportInfoResponse
from ympa_python_aiohttp_server.models.page_format_type import PageFormatType
from ympa_python_aiohttp_server.models.report_format_type import ReportFormatType


pytestmark = pytest.mark.asyncio

async def test_generate_boost_consolidated_report(client):
    """Test case for generate_boost_consolidated_report

    Отчет по бусту продаж
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/boost-consolidated/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_competitors_position_report(client):
    """Test case for generate_competitors_position_report

    Отчет «Конкурентная позиция»
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","categoryId":6}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/competitors-position/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_goods_feedback_report(client):
    """Test case for generate_goods_feedback_report

    Отчет по отзывам о товарах
    """
    body = {"businessId":0}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/goods-feedback/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_goods_movement_report(client):
    """Test case for generate_goods_movement_report

    Отчет по движению товаров
    """
    body = {"shopSku":"shopSku","campaignId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/goods-movement/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_goods_realization_report(client):
    """Test case for generate_goods_realization_report

    Отчет по реализации
    """
    body = {"month":2,"year":6,"campaignId":0}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/goods-realization/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_goods_turnover_report(client):
    """Test case for generate_goods_turnover_report

    Отчет по оборачиваемости
    """
    body = {"date":"2000-01-23","campaignId":0}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/goods-turnover/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_mass_order_labels_report(client):
    """Test case for generate_mass_order_labels_report

    Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    """
    body = {"businessId":0,"orderIds":[6,6,6,6,6]}
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/documents/labels/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_prices_report(client):
    """Test case for generate_prices_report

    Отчет «Цены на рынке»
    """
    body = {"categoryIds":[1,1],"creationDateTo":"2000-01-23","campaignId":6,"businessId":0,"creationDateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/prices/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_shelfs_statistics_report(client):
    """Test case for generate_shelfs_statistics_report

    Отчет по полкам
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","attributionType":"CLICKS"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/shelf-statistics/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_shipment_list_document_report(client):
    """Test case for generate_shipment_list_document_report

    Получение листа сборки
    """
    body = {"campaignId":0,"shipmentId":6,"orderIds":[1,1]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/documents/shipment-list/generate',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_shows_sales_report(client):
    """Test case for generate_shows_sales_report

    Отчет «Аналитика продаж»
    """
    body = {"campaignId":6,"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","grouping":"CATEGORIES"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/shows-sales/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_stocks_on_warehouses_report(client):
    """Test case for generate_stocks_on_warehouses_report

    Отчет по остаткам на складах
    """
    body = {"categoryIds":[1,1],"hasStocks":True,"reportDate":"2000-01-23","campaignId":0,"warehouseIds":[6,6]}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/stocks-on-warehouses/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_marketplace_services_report(client):
    """Test case for generate_united_marketplace_services_report

    Отчет по стоимости услуг
    """
    body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","yearFrom":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","monthFrom":2,"dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[2,2],"dateFrom":"2000-01-23","monthTo":7,"yearTo":5}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-marketplace-services/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_netting_report(client):
    """Test case for generate_united_netting_report

    Отчет по платежам
    """
    body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","bankOrderId":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[1,1],"dateFrom":"2000-01-23","bankOrderDateTime":"2000-01-23T04:56:07.000+00:00"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-netting/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_orders_report(client):
    """Test case for generate_united_orders_report

    Отчет по заказам
    """
    body = {"businessId":0,"dateTo":"2000-01-23","campaignIds":[6,6],"promoId":"promoId","dateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-orders/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_report_info(client):
    """Test case for get_report_info

    Получение заданного отчета
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/reports/info/{report_id}'.format(report_id='report_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

