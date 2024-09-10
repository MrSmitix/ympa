# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from ympa_python_pydantic_v1_client.models.order_label_dto import OrderLabelDTO  # noqa: E501

class TestOrderLabelDTO(unittest.TestCase):
    """OrderLabelDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrderLabelDTO:
        """Test OrderLabelDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrderLabelDTO`
        """
        model = OrderLabelDTO()  # noqa: E501
        if include_optional:
            return OrderLabelDTO(
                order_id = 56,
                places_number = 56,
                url = '',
                parcel_box_labels = [
                    ympa_python_pydantic_v1_client.models.parcel_box_label_dto.ParcelBoxLabelDTO(
                        url = '', 
                        supplier_name = '', 
                        delivery_service_name = '', 
                        order_id = 56, 
                        order_num = '', 
                        recipient_name = '', 
                        box_id = 56, 
                        fulfilment_id = '', 
                        place = '', 
                        weight = '', 
                        delivery_service_id = '', 
                        delivery_address = '', 
                        shipment_date = '', )
                    ]
            )
        else:
            return OrderLabelDTO(
                order_id = 56,
                places_number = 56,
                url = '',
                parcel_box_labels = [
                    ympa_python_pydantic_v1_client.models.parcel_box_label_dto.ParcelBoxLabelDTO(
                        url = '', 
                        supplier_name = '', 
                        delivery_service_name = '', 
                        order_id = 56, 
                        order_num = '', 
                        recipient_name = '', 
                        box_id = 56, 
                        fulfilment_id = '', 
                        place = '', 
                        weight = '', 
                        delivery_service_id = '', 
                        delivery_address = '', 
                        shipment_date = '', )
                    ],
        )
        """

    def testOrderLabelDTO(self):
        """Test OrderLabelDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
