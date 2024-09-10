# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_chats_info_dto import GetChatsInfoDTO

class TestGetChatsInfoDTO(unittest.TestCase):
    """GetChatsInfoDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetChatsInfoDTO:
        """Test GetChatsInfoDTO
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetChatsInfoDTO`
        """
        model = GetChatsInfoDTO()
        if include_optional:
            return GetChatsInfoDTO(
                chats = [
                    ympa_python_client.models.get_chat_info_dto.GetChatInfoDTO(
                        chat_id = 56, 
                        order_id = 56, 
                        type = 'CHAT', 
                        status = 'NEW', 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                    ],
                paging = ympa_python_client.models.forward_scrolling_pager_dto.ForwardScrollingPagerDTO(
                    next_page_token = '', )
            )
        else:
            return GetChatsInfoDTO(
                chats = [
                    ympa_python_client.models.get_chat_info_dto.GetChatInfoDTO(
                        chat_id = 56, 
                        order_id = 56, 
                        type = 'CHAT', 
                        status = 'NEW', 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                    ],
        )
        """

    def testGetChatsInfoDTO(self):
        """Test GetChatsInfoDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
