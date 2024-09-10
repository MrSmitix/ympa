# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_promos_result_dto import GetPromosResultDTO

class TestGetPromosResultDTO(unittest.TestCase):
    """GetPromosResultDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetPromosResultDTO:
        """Test GetPromosResultDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetPromosResultDTO`
        """
        model = GetPromosResultDTO()
        if include_optional:
            return GetPromosResultDTO(
                promos = [
                    ympa_python_client.models.get_promo_dto.GetPromoDTO(
                        id = '', 
                        name = '', 
                        period = ympa_python_client.models.promo_period_dto.PromoPeriodDTO(
                            date_time_from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            date_time_to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        participating = True, 
                        assortment_info = ympa_python_client.models.get_promo_assortment_info_dto.GetPromoAssortmentInfoDTO(
                            active_offers = 56, 
                            potential_offers = 56, 
                            processing = True, ), 
                        mechanics_info = ympa_python_client.models.get_promo_mechanics_info_dto.GetPromoMechanicsInfoDTO(
                            type = 'DIRECT_DISCOUNT', 
                            promocode_info = ympa_python_client.models.get_promo_promocode_info_dto.GetPromoPromocodeInfoDTO(
                                promocode = '', 
                                discount = 56, ), ), 
                        bestseller_info = ympa_python_client.models.get_promo_bestseller_info_dto.GetPromoBestsellerInfoDTO(
                            bestseller = True, 
                            entry_deadline = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        channels = [
                            PUSH
                            ], 
                        constraints = ympa_python_client.models.get_promo_constraints_dto.GetPromoConstraintsDTO(
                            warehouse_ids = [
                                56
                                ], ), )
                    ]
            )
        else:
            return GetPromosResultDTO(
                promos = [
                    ympa_python_client.models.get_promo_dto.GetPromoDTO(
                        id = '', 
                        name = '', 
                        period = ympa_python_client.models.promo_period_dto.PromoPeriodDTO(
                            date_time_from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            date_time_to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        participating = True, 
                        assortment_info = ympa_python_client.models.get_promo_assortment_info_dto.GetPromoAssortmentInfoDTO(
                            active_offers = 56, 
                            potential_offers = 56, 
                            processing = True, ), 
                        mechanics_info = ympa_python_client.models.get_promo_mechanics_info_dto.GetPromoMechanicsInfoDTO(
                            type = 'DIRECT_DISCOUNT', 
                            promocode_info = ympa_python_client.models.get_promo_promocode_info_dto.GetPromoPromocodeInfoDTO(
                                promocode = '', 
                                discount = 56, ), ), 
                        bestseller_info = ympa_python_client.models.get_promo_bestseller_info_dto.GetPromoBestsellerInfoDTO(
                            bestseller = True, 
                            entry_deadline = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        channels = [
                            PUSH
                            ], 
                        constraints = ympa_python_client.models.get_promo_constraints_dto.GetPromoConstraintsDTO(
                            warehouse_ids = [
                                56
                                ], ), )
                    ],
        )
        """

    def testGetPromosResultDTO(self):
        """Test GetPromosResultDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
