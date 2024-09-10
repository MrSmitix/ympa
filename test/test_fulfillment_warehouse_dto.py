# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.fulfillment_warehouse_dto import FulfillmentWarehouseDTO

class TestFulfillmentWarehouseDTO(unittest.TestCase):
    """FulfillmentWarehouseDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FulfillmentWarehouseDTO:
        """Test FulfillmentWarehouseDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FulfillmentWarehouseDTO`
        """
        model = FulfillmentWarehouseDTO()
        if include_optional:
            return FulfillmentWarehouseDTO(
                id = 56,
                name = '',
                address = ympa_python_client.models.warehouse_address_dto.WarehouseAddressDTO(
                    city = '', 
                    street = '', 
                    number = '', 
                    building = '', 
                    block = '', 
                    gps = ympa_python_client.models.gps_dto.GpsDTO(
                        latitude = 1.337, 
                        longitude = 1.337, ), )
            )
        else:
            return FulfillmentWarehouseDTO(
                id = 56,
                name = '',
        )
        """

    def testFulfillmentWarehouseDTO(self):
        """Test FulfillmentWarehouseDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
