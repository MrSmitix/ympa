# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.models.get_feed_index_logs_response import GetFeedIndexLogsResponse

class TestGetFeedIndexLogsResponse(unittest.TestCase):
    """GetFeedIndexLogsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetFeedIndexLogsResponse:
        """Test GetFeedIndexLogsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetFeedIndexLogsResponse`
        """
        model = GetFeedIndexLogsResponse()
        if include_optional:
            return GetFeedIndexLogsResponse(
                status = 'OK',
                result = ympa_python_client.models.feed_index_logs_result_dto.FeedIndexLogsResultDTO(
                    feed = ympa_python_client.models.feed_index_logs_feed_dto.FeedIndexLogsFeedDTO(
                        id = 56, ), 
                    index_log_records = [
                        ympa_python_client.models.feed_index_logs_record_dto.FeedIndexLogsRecordDTO(
                            download_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            file_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            generation_id = 56, 
                            index_type = 'DIFF', 
                            published_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            status = 'ERROR', 
                            error = ympa_python_client.models.feed_index_logs_error_dto.FeedIndexLogsErrorDTO(
                                http_status_code = 56, 
                                type = 'DOWNLOAD_ERROR', 
                                description = '', ), 
                            offers = ympa_python_client.models.feed_index_logs_offers_dto.FeedIndexLogsOffersDTO(
                                rejected_count = 56, 
                                total_count = 56, ), )
                        ], 
                    total = 56, )
            )
        else:
            return GetFeedIndexLogsResponse(
        )
        """

    def testGetFeedIndexLogsResponse(self):
        """Test GetFeedIndexLogsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
