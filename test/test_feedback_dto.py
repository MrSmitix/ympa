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

from ympa_python_pydantic_v1_client.models.feedback_dto import FeedbackDTO  # noqa: E501

class TestFeedbackDTO(unittest.TestCase):
    """FeedbackDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FeedbackDTO:
        """Test FeedbackDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FeedbackDTO`
        """
        model = FeedbackDTO()  # noqa: E501
        if include_optional:
            return FeedbackDTO(
                id = 56,
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                text = '',
                state = 'LAST',
                author = ympa_python_pydantic_v1_client.models.feedback_author_dto.FeedbackAuthorDTO(
                    name = '', 
                    region = ympa_python_pydantic_v1_client.models.region_dto.RegionDTO(
                        id = 56, 
                        name = '', 
                        type = 'OTHER', 
                        parent = ympa_python_pydantic_v1_client.models.region_dto.RegionDTO(
                            id = 56, 
                            name = '', 
                            type = 'OTHER', 
                            children = [
                                
                                ], ), 
                        children = [
                            
                            ], ), ),
                pro = '',
                contra = '',
                comments = [
                    ympa_python_pydantic_v1_client.models.feedback_comment_dto.FeedbackCommentDTO(
                        id = 56, 
                        parent_id = 56, 
                        body = '', 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        author = ympa_python_pydantic_v1_client.models.feedback_comment_author_dto.FeedbackCommentAuthorDTO(
                            type = 'USER', 
                            name = '', ), 
                        children = [
                            ympa_python_pydantic_v1_client.models.feedback_comment_dto.FeedbackCommentDTO(
                                id = 56, 
                                parent_id = 56, 
                                body = '', 
                                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                            ], )
                    ],
                shop = ympa_python_pydantic_v1_client.models.feedback_shop_dto.FeedbackShopDTO(
                    name = '', ),
                resolved = True,
                verified = True,
                recommend = True,
                grades = ympa_python_pydantic_v1_client.models.feedback_grades_dto.FeedbackGradesDTO(
                    average = 1.337, 
                    agree_count = 56, 
                    reject_count = 56, 
                    factors = [
                        ympa_python_pydantic_v1_client.models.feedback_factor_dto.FeedbackFactorDTO(
                            id = 56, 
                            title = '', 
                            description = '', 
                            value = 56, )
                        ], ),
                order = ympa_python_pydantic_v1_client.models.feedback_order_dto.FeedbackOrderDTO(
                    shop_order_id = '', 
                    delivery = 'DELIVERY', )
            )
        else:
            return FeedbackDTO(
                comments = [
                    ympa_python_pydantic_v1_client.models.feedback_comment_dto.FeedbackCommentDTO(
                        id = 56, 
                        parent_id = 56, 
                        body = '', 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        author = ympa_python_pydantic_v1_client.models.feedback_comment_author_dto.FeedbackCommentAuthorDTO(
                            type = 'USER', 
                            name = '', ), 
                        children = [
                            ympa_python_pydantic_v1_client.models.feedback_comment_dto.FeedbackCommentDTO(
                                id = 56, 
                                parent_id = 56, 
                                body = '', 
                                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                            ], )
                    ],
        )
        """

    def testFeedbackDTO(self):
        """Test FeedbackDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
