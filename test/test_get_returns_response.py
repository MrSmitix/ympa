# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_returns_response import GetReturnsResponse

class TestGetReturnsResponse(unittest.TestCase):
    """GetReturnsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetReturnsResponse:
        """Test GetReturnsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetReturnsResponse`
        """
        model = GetReturnsResponse()
        if include_optional:
            return GetReturnsResponse(
                status = 'OK',
                result = ympa_python_client.models.paged_returns_dto.PagedReturnsDTO(
                    paging = ympa_python_client.models.forward_scrolling_pager_dto.ForwardScrollingPagerDTO(
                        next_page_token = '', ), 
                    returns = [
                        ympa_python_client.models.return_dto.ReturnDTO(
                            id = 56, 
                            order_id = 56, 
                            creation_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            update_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            refund_status = 'STARTED_BY_USER', 
                            logistic_pickup_point = ympa_python_client.models.logistic_pickup_point_dto.LogisticPickupPointDTO(
                                id = 56, 
                                name = '', 
                                address = ympa_python_client.models.pickup_address_dto.PickupAddressDTO(
                                    country = 'Россия', 
                                    city = 'Москва', 
                                    street = 'Стрелецкая улица', 
                                    house = '9к2', 
                                    postcode = '123518', ), 
                                instruction = '', 
                                type = 'WAREHOUSE', 
                                logistic_partner_id = 56, ), 
                            shipment_recipient_type = 'SHOP', 
                            shipment_status = 'CREATED', 
                            refund_amount = 56, 
                            items = [
                                ympa_python_client.models.return_item_dto.ReturnItemDTO(
                                    market_sku = 56, 
                                    shop_sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                                    count = 56, 
                                    decisions = [
                                        ympa_python_client.models.return_decision_dto.ReturnDecisionDTO(
                                            return_item_id = 56, 
                                            count = 56, 
                                            comment = '', 
                                            reason_type = 'BAD_QUALITY', 
                                            subreason_type = 'USER_DID_NOT_LIKE', 
                                            decision_type = 'REFUND_MONEY', 
                                            refund_amount = 56, 
                                            partner_compensation = 56, 
                                            images = [
                                                ''
                                                ], )
                                        ], 
                                    instances = [
                                        ympa_python_client.models.return_instance_dto.ReturnInstanceDTO(
                                            stock_type = 'FIT', 
                                            status = 'CREATED', 
                                            cis = '', 
                                            imei = '', )
                                        ], 
                                    tracks = [
                                        ympa_python_client.models.track_dto.TrackDTO(
                                            track_code = '', )
                                        ], )
                                ], 
                            return_type = 'UNREDEEMED', 
                            fast_return = True, )
                        ], )
            )
        else:
            return GetReturnsResponse(
        )
        """

    def testGetReturnsResponse(self):
        """Test GetReturnsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
