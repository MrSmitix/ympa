# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.offer_error_dto import OfferErrorDTO

class TestOfferErrorDTO(unittest.TestCase):
    """OfferErrorDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OfferErrorDTO:
        """Test OfferErrorDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OfferErrorDTO`
        """
        model = OfferErrorDTO()
        if include_optional:
            return OfferErrorDTO(
                message = '',
                comment = ''
            )
        else:
            return OfferErrorDTO(
        )
        """

    def testOfferErrorDTO(self):
        """Test OfferErrorDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
