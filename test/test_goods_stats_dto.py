# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.goods_stats_dto import GoodsStatsDTO

class TestGoodsStatsDTO(unittest.TestCase):
    """GoodsStatsDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GoodsStatsDTO:
        """Test GoodsStatsDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GoodsStatsDTO`
        """
        model = GoodsStatsDTO()
        if include_optional:
            return GoodsStatsDTO(
                shop_skus = [
                    ympa_python_client.models.goods_stats_goods_dto.GoodsStatsGoodsDTO(
                        shop_sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        market_sku = 56, 
                        name = '', 
                        price = 1.337, 
                        category_id = 56, 
                        category_name = '', 
                        weight_dimensions = ympa_python_client.models.goods_stats_weight_dimensions_dto.GoodsStatsWeightDimensionsDTO(
                            length = 1.337, 
                            width = 1.337, 
                            height = 1.337, 
                            weight = 1.337, ), 
                        warehouses = [
                            ympa_python_client.models.goods_stats_warehouse_dto.GoodsStatsWarehouseDTO(
                                id = 56, 
                                name = '', 
                                stocks = [
                                    ympa_python_client.models.warehouse_stock_dto.WarehouseStockDTO(
                                        type = 'FIT', 
                                        count = 56, )
                                    ], )
                            ], 
                        tariffs = [
                            ympa_python_client.models.tariff_dto.TariffDTO(
                                type = 'AGENCY_COMMISSION', 
                                percent = 1.337, 
                                amount = 1.337, 
                                parameters = [
                                    ympa_python_client.models.tariff_parameter_dto.TariffParameterDTO(
                                        name = '', 
                                        value = '', )
                                    ], )
                            ], 
                        pictures = [
                            ''
                            ], )
                    ]
            )
        else:
            return GoodsStatsDTO(
                shop_skus = [
                    ympa_python_client.models.goods_stats_goods_dto.GoodsStatsGoodsDTO(
                        shop_sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                        market_sku = 56, 
                        name = '', 
                        price = 1.337, 
                        category_id = 56, 
                        category_name = '', 
                        weight_dimensions = ympa_python_client.models.goods_stats_weight_dimensions_dto.GoodsStatsWeightDimensionsDTO(
                            length = 1.337, 
                            width = 1.337, 
                            height = 1.337, 
                            weight = 1.337, ), 
                        warehouses = [
                            ympa_python_client.models.goods_stats_warehouse_dto.GoodsStatsWarehouseDTO(
                                id = 56, 
                                name = '', 
                                stocks = [
                                    ympa_python_client.models.warehouse_stock_dto.WarehouseStockDTO(
                                        type = 'FIT', 
                                        count = 56, )
                                    ], )
                            ], 
                        tariffs = [
                            ympa_python_client.models.tariff_dto.TariffDTO(
                                type = 'AGENCY_COMMISSION', 
                                percent = 1.337, 
                                amount = 1.337, 
                                parameters = [
                                    ympa_python_client.models.tariff_parameter_dto.TariffParameterDTO(
                                        name = '', 
                                        value = '', )
                                    ], )
                            ], 
                        pictures = [
                            ''
                            ], )
                    ],
        )
        """

    def testGoodsStatsDTO(self):
        """Test GoodsStatsDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
