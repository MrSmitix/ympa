# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.calculate_tariffs_request import CalculateTariffsRequest  # noqa: F401
from ympa_python_fastapi_server.models.calculate_tariffs_response import CalculateTariffsResponse  # noqa: F401


def test_calculate_tariffs(client: TestClient):
    """Test case for calculate_tariffs

    Калькулятор стоимости услуг
    """
    calculate_tariffs_request = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328}],"parameters":{"campaign_id":0,"selling_program":"FBY","frequency":"DAILY"}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/tariffs/calculate",
    #    headers=headers,
    #    json=calculate_tariffs_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

