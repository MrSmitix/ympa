import unittest

from flask import json

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse  # noqa: E501
from ympa_python_flask_server.models.offer_availability_status_type import OfferAvailabilityStatusType  # noqa: E501
from ympa_python_flask_server.models.offer_mapping_kind_type import OfferMappingKindType  # noqa: E501
from ympa_python_flask_server.models.offer_processing_status_type import OfferProcessingStatusType  # noqa: E501
from ympa_python_flask_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestOfferMappingsController(BaseTestCase):
    """OfferMappingsController integration test stubs"""

    def test_get_offer_mapping_entries(self):
        """Test case for get_offer_mapping_entries

        Список товаров в каталоге
        """
        query_string = [('offer_id', ['offer_id_example']),
                        ('shop_sku', ['shop_sku_example']),
                        ('mapping_kind', ympa_python_flask_server.OfferMappingKindType()),
                        ('status', [ympa_python_flask_server.OfferProcessingStatusType()]),
                        ('availability', [ympa_python_flask_server.OfferAvailabilityStatusType()]),
                        ('category_id', [56]),
                        ('vendor', ['vendor_example']),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_suggested_offer_mapping_entries(self):
        """Test case for get_suggested_offer_mapping_entries

        Рекомендованные карточки для товаров
        """
        get_suggested_offer_mapping_entries_request = {"offers":[{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries/suggestions'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_suggested_offer_mapping_entries_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_offer_mapping_entries(self):
        """Test case for update_offer_mapping_entries

        Добавление и редактирование товаров в каталоге
        """
        update_offer_mapping_entry_request = {"offerMappingEntries":[{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries/updates'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_offer_mapping_entry_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
