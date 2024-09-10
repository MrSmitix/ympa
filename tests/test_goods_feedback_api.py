# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse  # noqa: F401
from ympa_python_fastapi_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse  # noqa: F401


def test_delete_goods_feedback_comment(client: TestClient):
    """Test case for delete_goods_feedback_comment

    Удаление комментария к отзыву
    """
    delete_goods_feedback_comment_request = {"id":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_goods_feedback_comment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_goods_feedback_comments(client: TestClient):
    """Test case for get_goods_feedback_comments

    Получение комментариев к отзыву
    """
    get_goods_feedback_comments_request = {"feedback_id":0}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments".format(businessId=56),
    #    headers=headers,
    #    json=get_goods_feedback_comments_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_goods_feedbacks(client: TestClient):
    """Test case for get_goods_feedbacks

    Получение отзывов о товарах продавца
    """
    get_goods_feedback_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","rating_values":[0,0,0,0,0],"model_ids":[6,6,6,6,6],"paid":1,"reaction_status":"ALL","date_time_to":"2000-01-23T04:56:07.000+00:00"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback".format(businessId=56),
    #    headers=headers,
    #    json=get_goods_feedback_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_skip_goods_feedbacks_reaction(client: TestClient):
    """Test case for skip_goods_feedbacks_reaction

    Отказ от ответа на отзывы
    """
    skip_goods_feedback_reaction_request = {"feedback_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/skip-reaction".format(businessId=56),
    #    headers=headers,
    #    json=skip_goods_feedback_reaction_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_goods_feedback_comment(client: TestClient):
    """Test case for update_goods_feedback_comment

    Добавление нового или изменение созданного комментария
    """
    update_goods_feedback_comment_request = {"feedback_id":0,"comment":{"id":6,"text":"text","parent_id":1}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments/update".format(businessId=56),
    #    headers=headers,
    #    json=update_goods_feedback_comment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

