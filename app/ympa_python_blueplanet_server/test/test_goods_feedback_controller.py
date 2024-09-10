# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.ympa_python_blueplanet_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse  # noqa: E501
from app.ympa_python_blueplanet_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest  # noqa: E501
from app.ympa_python_blueplanet_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse  # noqa: E501
from ympa_python_blueplanet_server.test import BaseTestCase


class TestGoodsFeedbackController(BaseTestCase):
    """GoodsFeedbackController integration test stubs"""

    def test_delete_goods_feedback_comment(self):
        """Test case for delete_goods_feedback_comment

        Удаление комментария к отзыву
        """
        body = {"id":0}
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments/delete'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goods_feedback_comments(self):
        """Test case for get_goods_feedback_comments

        Получение комментариев к отзыву
        """
        body = {"feedbackId":0}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goods_feedbacks(self):
        """Test case for get_goods_feedbacks

        Получение отзывов о товарах продавца
        """
        body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","ratingValues":[0,0,0,0,0],"modelIds":[6,6,6,6,6],"paid":True,"reactionStatus":"ALL","dateTimeTo":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_skip_goods_feedbacks_reaction(self):
        """Test case for skip_goods_feedbacks_reaction

        Отказ от ответа на отзывы
        """
        body = {"feedbackIds":[null,null,null,null,null]}
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/skip-reaction'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_goods_feedback_comment(self):
        """Test case for update_goods_feedback_comment

        Добавление нового или изменение созданного комментария
        """
        body = {"feedbackId":0,"comment":{"id":6,"text":"text","parentId":1}}
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments/update'.format(business_id=56),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
