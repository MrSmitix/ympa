# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse

class TestGetShipmentOrdersInfoResponse(unittest.TestCase):
    """GetShipmentOrdersInfoResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetShipmentOrdersInfoResponse:
        """Test GetShipmentOrdersInfoResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetShipmentOrdersInfoResponse`
        """
        model = GetShipmentOrdersInfoResponse()
        if include_optional:
            return GetShipmentOrdersInfoResponse(
                status = 'OK',
                result = ympa_python_client.models.orders_shipment_info_dto.OrdersShipmentInfoDTO(
                    order_ids_with_labels = [
                        56
                        ], 
                    order_ids_without_labels = [
                        56
                        ], )
            )
        else:
            return GetShipmentOrdersInfoResponse(
        )
        """

    def testGetShipmentOrdersInfoResponse(self):
        """Test GetShipmentOrdersInfoResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
