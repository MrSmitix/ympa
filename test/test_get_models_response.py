# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_models_response import GetModelsResponse

class TestGetModelsResponse(unittest.TestCase):
    """GetModelsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetModelsResponse:
        """Test GetModelsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetModelsResponse`
        """
        model = GetModelsResponse()
        if include_optional:
            return GetModelsResponse(
                models = [
                    ympa_python_client.models.model_dto.ModelDTO(
                        id = 56, 
                        name = '', 
                        prices = ympa_python_client.models.model_price_dto.ModelPriceDTO(
                            avg = 1.337, 
                            max = 1.337, 
                            min = 1.337, ), )
                    ],
                currency = 'RUR',
                region_id = 56
            )
        else:
            return GetModelsResponse(
                models = [
                    ympa_python_client.models.model_dto.ModelDTO(
                        id = 56, 
                        name = '', 
                        prices = ympa_python_client.models.model_price_dto.ModelPriceDTO(
                            avg = 1.337, 
                            max = 1.337, 
                            min = 1.337, ), )
                    ],
        )
        """

    def testGetModelsResponse(self):
        """Test GetModelsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
