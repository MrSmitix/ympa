# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO

class TestForwardScrollingPagerDTO(unittest.TestCase):
    """ForwardScrollingPagerDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ForwardScrollingPagerDTO:
        """Test ForwardScrollingPagerDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ForwardScrollingPagerDTO`
        """
        model = ForwardScrollingPagerDTO()
        if include_optional:
            return ForwardScrollingPagerDTO(
                next_page_token = ''
            )
        else:
            return ForwardScrollingPagerDTO(
        )
        """

    def testForwardScrollingPagerDTO(self):
        """Test ForwardScrollingPagerDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
