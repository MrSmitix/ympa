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

from ympa_python_pydantic_v1_client.models.feed_dto import FeedDTO  # noqa: E501

class TestFeedDTO(unittest.TestCase):
    """FeedDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FeedDTO:
        """Test FeedDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FeedDTO`
        """
        model = FeedDTO()  # noqa: E501
        if include_optional:
            return FeedDTO(
                id = 56,
                login = '',
                name = '',
                password = '',
                upload_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = '',
                content = ympa_python_pydantic_v1_client.models.feed_content_dto.FeedContentDTO(
                    rejected_offers_count = 56, 
                    status = 'ERROR', 
                    total_offers_count = 56, 
                    error = ympa_python_pydantic_v1_client.models.feed_content_error_dto.FeedContentErrorDTO(
                        type = 'PARSE_ERROR', ), ),
                download = ympa_python_pydantic_v1_client.models.feed_download_dto.FeedDownloadDTO(
                    status = 'ERROR', 
                    error = ympa_python_pydantic_v1_client.models.feed_download_error_dto.FeedDownloadErrorDTO(
                        http_status_code = 56, 
                        type = 'DOWNLOAD_ERROR', 
                        description = '', ), ),
                placement = ympa_python_pydantic_v1_client.models.feed_placement_dto.FeedPlacementDTO(
                    status = 'ERROR', 
                    total_offers_count = 56, ),
                publication = ympa_python_pydantic_v1_client.models.feed_publication_dto.FeedPublicationDTO(
                    status = 'ERROR', 
                    full = ympa_python_pydantic_v1_client.models.feed_publication_full_dto.FeedPublicationFullDTO(
                        file_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        published_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                    price_and_stock_update = ympa_python_pydantic_v1_client.models.feed_publication_price_and_stock_update_dto.FeedPublicationPriceAndStockUpdateDTO(
                        file_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        published_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), )
            )
        else:
            return FeedDTO(
        )
        """

    def testFeedDTO(self):
        """Test FeedDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
