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

from ympa_python_pydantic_v1_client.models.update_offer_dto import UpdateOfferDTO  # noqa: E501

class TestUpdateOfferDTO(unittest.TestCase):
    """UpdateOfferDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateOfferDTO:
        """Test UpdateOfferDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateOfferDTO`
        """
        model = UpdateOfferDTO()  # noqa: E501
        if include_optional:
            return UpdateOfferDTO(
                offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0',
                name = 'Ударная дрель Makita HP1630, 710 Вт',
                market_category_id = 56,
                category = '',
                pictures = [
                    ''
                    ],
                videos = [
                    ''
                    ],
                manuals = [
                    ympa_python_pydantic_v1_client.models.offer_manual_dto.OfferManualDTO(
                        url = '', 
                        title = '', )
                    ],
                vendor = 'LEVENHUK',
                barcodes = [
                    '46012300000000'
                    ],
                description = '',
                manufacturer_countries = [
                    'Россия'
                    ],
                weight_dimensions = ympa_python_pydantic_v1_client.models.offer_weight_dimensions_dto.OfferWeightDimensionsDTO(
                    length = 65.55, 
                    width = 50.7, 
                    height = 20, 
                    weight = 1.001, ),
                vendor_code = 'VNDR-0005A',
                tags = [
                    'до 500 рублей'
                    ],
                shelf_life = ympa_python_pydantic_v1_client.models.time_period_dto.TimePeriodDTO(
                    time_period = 56, 
                    time_unit = 'HOUR', 
                    comment = '', ),
                life_time = ympa_python_pydantic_v1_client.models.time_period_dto.TimePeriodDTO(
                    time_period = 56, 
                    time_unit = 'HOUR', 
                    comment = '', ),
                guarantee_period = ympa_python_pydantic_v1_client.models.time_period_dto.TimePeriodDTO(
                    time_period = 56, 
                    time_unit = 'HOUR', 
                    comment = '', ),
                customs_commodity_code = '8517610008',
                certificates = [
                    ''
                    ],
                box_count = 56,
                condition = ympa_python_pydantic_v1_client.models.offer_condition_dto.OfferConditionDTO(
                    type = 'PREOWNED', 
                    quality = 'PERFECT', 
                    reason = '', ),
                type = 'DEFAULT',
                downloadable = True,
                adult = True,
                age = ympa_python_pydantic_v1_client.models.age_dto.AgeDTO(
                    value = 0, 
                    age_unit = 'YEAR', ),
                params = [
                    ympa_python_pydantic_v1_client.models.offer_param_dto.OfferParamDTO(
                        name = 'Wi-Fi', 
                        value = 'есть', )
                    ],
                parameter_values = [
                    ympa_python_pydantic_v1_client.models.parameter_value_dto.ParameterValueDTO(
                        parameter_id = 56, 
                        unit_id = 56, 
                        value_id = 56, 
                        value = '', )
                    ],
                basic_price = ympa_python_pydantic_v1_client.models.update_price_with_discount_dto.UpdatePriceWithDiscountDTO(),
                purchase_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', ),
                additional_expenses = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', ),
                cofinance_price = ympa_python_pydantic_v1_client.models.base_price_dto.BasePriceDTO(
                    value = 0, 
                    currency_id = 'RUR', )
            )
        else:
            return UpdateOfferDTO(
                offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0',
        )
        """

    def testUpdateOfferDTO(self):
        """Test UpdateOfferDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
