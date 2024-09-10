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

from ympa_python_pydantic_v1_client.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: E501

class TestUpdateOrderStatusResponse(unittest.TestCase):
    """UpdateOrderStatusResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateOrderStatusResponse:
        """Test UpdateOrderStatusResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateOrderStatusResponse`
        """
        model = UpdateOrderStatusResponse()  # noqa: E501
        if include_optional:
            return UpdateOrderStatusResponse(
                order = ympa_python_pydantic_v1_client.models.order_dto.OrderDTO(
                    id = 56, 
                    status = 'PLACING', 
                    substatus = 'RESERVATION_EXPIRED', 
                    creation_date = '23-09-2022 09:12:41', 
                    updated_at = '23-09-2022 09:12:41', 
                    currency = 'RUR', 
                    items_total = 1.337, 
                    delivery_total = 1.337, 
                    buyer_items_total = 1.337, 
                    buyer_total = 1.337, 
                    buyer_items_total_before_discount = 1.337, 
                    buyer_total_before_discount = 1.337, 
                    payment_type = 'PREPAID', 
                    payment_method = 'CASH_ON_DELIVERY', 
                    fake = True, 
                    items = [
                        ympa_python_pydantic_v1_client.models.order_item_dto.OrderItemDTO(
                            id = 56, 
                            offer_id = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                            offer_name = '', 
                            price = 1.337, 
                            buyer_price = 1.337, 
                            buyer_price_before_discount = 1.337, 
                            price_before_discount = 1.337, 
                            count = 56, 
                            vat = 'NO_VAT', 
                            shop_sku = 'jUR,rZ#UM/?R,Fp^l6$ARjbhJk C>i H'qT\\{<?'es#)#iK.YM{Rag2/!KB!k@5oXh.:Ts\";mGL,i&z5[P@M\"lzfB+Y,Twzfu~N^z\"mfqecVU{SmA{QA<Y8XX0<}J;Krm9W'g~?)DvDDLE7-'(u+-7Tfp&\\`F+7-?{%@=iEPLVY*a@A[b_6cfy~~0GcD_@b4Y=U?otJ(e#=I@b(lK%|5-Ido0', 
                            subsidy = 1.337, 
                            partner_warehouse_id = '', 
                            promos = [
                                ympa_python_pydantic_v1_client.models.order_item_promo_dto.OrderItemPromoDTO(
                                    type = 'DIRECT_DISCOUNT', 
                                    discount = 1.337, 
                                    subsidy = 1.337, 
                                    shop_promo_id = '', 
                                    market_promo_id = '', )
                                ], 
                            instances = [
                                ympa_python_pydantic_v1_client.models.order_item_instance_dto.OrderItemInstanceDTO(
                                    cis = '', 
                                    cis_full = '', 
                                    uin = '', 
                                    rnpt = '', 
                                    gtd = '', )
                                ], 
                            details = [
                                ympa_python_pydantic_v1_client.models.order_item_detail_dto.OrderItemDetailDTO(
                                    item_count = 56, 
                                    item_status = 'REJECTED', 
                                    update_date = '23-09-2022', )
                                ], 
                            subsidies = [
                                ympa_python_pydantic_v1_client.models.order_item_subsidy_dto.OrderItemSubsidyDTO(
                                    amount = 1.337, )
                                ], 
                            required_instance_types = [
                                'CIS'
                                ], )
                        ], 
                    subsidies = [
                        ympa_python_pydantic_v1_client.models.order_subsidy_dto.OrderSubsidyDTO(
                            amount = 1.337, )
                        ], 
                    delivery = ympa_python_pydantic_v1_client.models.order_delivery_dto.OrderDeliveryDTO(
                        id = '', 
                        service_name = '', 
                        price = 1.337, 
                        delivery_partner_type = 'SHOP', 
                        courier = ympa_python_pydantic_v1_client.models.order_courier_dto.OrderCourierDTO(
                            full_name = '', 
                            phone = '', 
                            phone_extension = '', 
                            vehicle_number = '', 
                            vehicle_description = '', ), 
                        dates = ympa_python_pydantic_v1_client.models.order_delivery_dates_dto.OrderDeliveryDatesDTO(
                            from_date = '23-09-2022', 
                            to_date = '23-09-2022', 
                            from_time = '', 
                            to_time = '', 
                            real_delivery_date = '23-09-2022', ), 
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
                                
                                ], ), 
                        address = ympa_python_pydantic_v1_client.models.order_delivery_address_dto.OrderDeliveryAddressDTO(
                            country = '', 
                            postcode = '', 
                            city = '', 
                            district = '', 
                            subway = '', 
                            street = '', 
                            house = '', 
                            block = '', 
                            entrance = '', 
                            entryphone = '', 
                            floor = '', 
                            apartment = '', 
                            phone = '', 
                            recipient = '', 
                            gps = ympa_python_pydantic_v1_client.models.gps_dto.GpsDTO(
                                latitude = 1.337, 
                                longitude = 1.337, ), ), 
                        delivery_service_id = 56, 
                        lift_type = 'NOT_NEEDED', 
                        lift_price = 1.337, 
                        outlet_code = '', 
                        outlet_storage_limit_date = '23-09-2022', 
                        dispatch_type = 'UNKNOWN', 
                        tracks = [
                            ympa_python_pydantic_v1_client.models.order_track_dto.OrderTrackDTO(
                                track_code = '', 
                                delivery_service_id = 56, )
                            ], 
                        shipments = [
                            ympa_python_pydantic_v1_client.models.order_shipment_dto.OrderShipmentDTO(
                                id = 56, 
                                shipment_date = '23-09-2022', 
                                shipment_time = '', 
                                boxes = [
                                    ympa_python_pydantic_v1_client.models.order_parcel_box_dto.OrderParcelBoxDTO(
                                        id = 56, 
                                        fulfilment_id = '', )
                                    ], )
                            ], 
                        estimated = True, 
                        eac_type = 'MERCHANT_TO_COURIER', 
                        eac_code = '', ), 
                    buyer = ympa_python_pydantic_v1_client.models.order_buyer_dto.OrderBuyerDTO(), 
                    notes = '', 
                    tax_system = 'OSN', 
                    cancel_requested = True, 
                    expiry_date = '23-09-2022 09:12:41', )
            )
        else:
            return UpdateOrderStatusResponse(
        )
        """

    def testUpdateOrderStatusResponse(self):
        """Test UpdateOrderStatusResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
