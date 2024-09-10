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

from ympa_python_pydantic_v1_client.models.category_parameter_dto import CategoryParameterDTO  # noqa: E501

class TestCategoryParameterDTO(unittest.TestCase):
    """CategoryParameterDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CategoryParameterDTO:
        """Test CategoryParameterDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CategoryParameterDTO`
        """
        model = CategoryParameterDTO()  # noqa: E501
        if include_optional:
            return CategoryParameterDTO(
                id = 56,
                name = '',
                type = 'TEXT',
                unit = ympa_python_pydantic_v1_client.models.category_parameter_unit_dto.CategoryParameterUnitDTO(
                    default_unit_id = 56, 
                    units = [
                        ympa_python_pydantic_v1_client.models.unit_dto.UnitDTO(
                            id = 56, 
                            name = 'кг', 
                            full_name = 'килограмм', )
                        ], ),
                description = '',
                recommendation_types = [
                    'HAS_VIDEO'
                    ],
                required = True,
                filtering = True,
                distinctive = True,
                multivalue = True,
                allow_custom_values = True,
                values = [
                    ympa_python_pydantic_v1_client.models.parameter_value_option_dto.ParameterValueOptionDTO(
                        id = 56, 
                        value = '', 
                        description = '', )
                    ],
                constraints = ympa_python_pydantic_v1_client.models.parameter_value_constraints_dto.ParameterValueConstraintsDTO(
                    min_value = 1.337, 
                    max_value = 1.337, 
                    max_length = 56, ),
                value_restrictions = [
                    ympa_python_pydantic_v1_client.models.value_restriction_dto.ValueRestrictionDTO(
                        limiting_parameter_id = 56, 
                        limited_values = [
                            ympa_python_pydantic_v1_client.models.option_values_limited_dto.OptionValuesLimitedDTO(
                                limiting_option_value_id = 56, 
                                option_value_ids = [
                                    56
                                    ], )
                            ], )
                    ]
            )
        else:
            return CategoryParameterDTO(
                id = 56,
                type = 'TEXT',
                required = True,
                filtering = True,
                distinctive = True,
                multivalue = True,
                allow_custom_values = True,
        )
        """

    def testCategoryParameterDTO(self):
        """Test CategoryParameterDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
