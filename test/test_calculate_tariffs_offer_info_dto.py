# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.calculate_tariffs_offer_info_dto import CalculateTariffsOfferInfoDTO

class TestCalculateTariffsOfferInfoDTO(unittest.TestCase):
    """CalculateTariffsOfferInfoDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CalculateTariffsOfferInfoDTO:
        """Test CalculateTariffsOfferInfoDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CalculateTariffsOfferInfoDTO`
        """
        model = CalculateTariffsOfferInfoDTO()
        if include_optional:
            return CalculateTariffsOfferInfoDTO(
                offer = ympa_python_client.models.calculate_tariffs_offer_dto.CalculateTariffsOfferDTO(
                    category_id = 0, 
                    price = 0, 
                    length = 0, 
                    width = 0, 
                    height = 0, 
                    weight = 0, 
                    quantity = 1, ),
                tariffs = [
                    ympa_python_client.models.calculated_tariff_dto.CalculatedTariffDTO(
                        type = 'AGENCY_COMMISSION', 
                        amount = 1.337, 
                        parameters = [
                            ympa_python_client.models.tariff_parameter_dto.TariffParameterDTO(
                                name = '', 
                                value = '', )
                            ], )
                    ]
            )
        else:
            return CalculateTariffsOfferInfoDTO(
                offer = ympa_python_client.models.calculate_tariffs_offer_dto.CalculateTariffsOfferDTO(
                    category_id = 0, 
                    price = 0, 
                    length = 0, 
                    width = 0, 
                    height = 0, 
                    weight = 0, 
                    quantity = 1, ),
                tariffs = [
                    ympa_python_client.models.calculated_tariff_dto.CalculatedTariffDTO(
                        type = 'AGENCY_COMMISSION', 
                        amount = 1.337, 
                        parameters = [
                            ympa_python_client.models.tariff_parameter_dto.TariffParameterDTO(
                                name = '', 
                                value = '', )
                            ], )
                    ],
        )
        """

    def testCalculateTariffsOfferInfoDTO(self):
        """Test CalculateTariffsOfferInfoDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
