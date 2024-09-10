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

from ympa_python_pydantic_v1_client.models.goods_feedback_comment_dto import GoodsFeedbackCommentDTO  # noqa: E501

class TestGoodsFeedbackCommentDTO(unittest.TestCase):
    """GoodsFeedbackCommentDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GoodsFeedbackCommentDTO:
        """Test GoodsFeedbackCommentDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GoodsFeedbackCommentDTO`
        """
        model = GoodsFeedbackCommentDTO()  # noqa: E501
        if include_optional:
            return GoodsFeedbackCommentDTO(
                id = 56,
                text = '0',
                can_modify = True,
                parent_id = 56,
                author = ympa_python_pydantic_v1_client.models.goods_feedback_comment_author_dto.GoodsFeedbackCommentAuthorDTO(
                    type = 'USER', 
                    name = '', ),
                status = 'PUBLISHED'
            )
        else:
            return GoodsFeedbackCommentDTO(
                id = 56,
                text = '0',
                author = ympa_python_pydantic_v1_client.models.goods_feedback_comment_author_dto.GoodsFeedbackCommentAuthorDTO(
                    type = 'USER', 
                    name = '', ),
                status = 'PUBLISHED',
        )
        """

    def testGoodsFeedbackCommentDTO(self):
        """Test GoodsFeedbackCommentDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
