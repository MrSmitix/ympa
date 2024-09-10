# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

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
from ympa_python_blueplanet_server.test import BaseTestCase


class TestReportsController(BaseTestCase):
    """ReportsController integration test stubs"""

    def test_generate_boost_consolidated_report(self):
        """Test case for generate_boost_consolidated_report

        Отчет по бусту продаж
        """
        body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/boost-consolidated/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_competitors_position_report(self):
        """Test case for generate_competitors_position_report

        Отчет «Конкурентная позиция»
        """
        body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","categoryId":6}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/competitors-position/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_feedback_report(self):
        """Test case for generate_goods_feedback_report

        Отчет по отзывам о товарах
        """
        body = {"businessId":0}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/goods-feedback/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_movement_report(self):
        """Test case for generate_goods_movement_report

        Отчет по движению товаров
        """
        body = {"shopSku":"shopSku","campaignId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/goods-movement/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_realization_report(self):
        """Test case for generate_goods_realization_report

        Отчет по реализации
        """
        body = {"month":2,"year":6,"campaignId":0}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/goods-realization/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_turnover_report(self):
        """Test case for generate_goods_turnover_report

        Отчет по оборачиваемости
        """
        body = {"date":"2000-01-23","campaignId":0}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/goods-turnover/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_mass_order_labels_report(self):
        """Test case for generate_mass_order_labels_report

        Готовые ярлыки‑наклейки на все коробки в нескольких заказах
        """
        body = {"businessId":0,"orderIds":[6,6,6,6,6]}
        query_string = [('format', ympa_python_blueplanet_server.PageFormatType())]
        response = self.client.open(
            '/reports/documents/labels/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_prices_report(self):
        """Test case for generate_prices_report

        Отчет «Цены на рынке»
        """
        body = {"categoryIds":[1,1],"creationDateTo":"2000-01-23","campaignId":6,"businessId":0,"creationDateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/prices/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_shelfs_statistics_report(self):
        """Test case for generate_shelfs_statistics_report

        Отчет по полкам
        """
        body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","attributionType":"CLICKS"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/shelf-statistics/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_shipment_list_document_report(self):
        """Test case for generate_shipment_list_document_report

        Получение листа сборки
        """
        body = {"campaignId":0,"shipmentId":6,"orderIds":[1,1]}
        response = self.client.open(
            '/reports/documents/shipment-list/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_shows_sales_report(self):
        """Test case for generate_shows_sales_report

        Отчет «Аналитика продаж»
        """
        body = {"campaignId":6,"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","grouping":"CATEGORIES"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/shows-sales/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_stocks_on_warehouses_report(self):
        """Test case for generate_stocks_on_warehouses_report

        Отчет по остаткам на складах
        """
        body = {"categoryIds":[1,1],"hasStocks":True,"reportDate":"2000-01-23","campaignId":0,"warehouseIds":[6,6]}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/stocks-on-warehouses/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_marketplace_services_report(self):
        """Test case for generate_united_marketplace_services_report

        Отчет по стоимости услуг
        """
        body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","yearFrom":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","monthFrom":2,"dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[2,2],"dateFrom":"2000-01-23","monthTo":7,"yearTo":5}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/united-marketplace-services/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_netting_report(self):
        """Test case for generate_united_netting_report

        Отчет по платежам
        """
        body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","bankOrderId":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[1,1],"dateFrom":"2000-01-23","bankOrderDateTime":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/united-netting/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_orders_report(self):
        """Test case for generate_united_orders_report

        Отчет по заказам
        """
        body = {"businessId":0,"dateTo":"2000-01-23","campaignIds":[6,6],"promoId":"promoId","dateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_blueplanet_server.ReportFormatType())]
        response = self.client.open(
            '/reports/united-orders/generate',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_report_info(self):
        """Test case for get_report_info

        Получение заданного отчета
        """
        response = self.client.open(
            '/reports/info/{report_id}'.format(report_id='report_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
