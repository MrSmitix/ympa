# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest  # noqa: F401
from ympa_python_fastapi_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_request import DeleteOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_response import DeleteOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mappings_request import GetOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mappings_response import GetOfferMappingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse  # noqa: F401


def test_add_offers_to_archive(client: TestClient):
    """Test case for add_offers_to_archive

    Добавление товаров в архив
    """
    add_offers_to_archive_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/archive".format(businessId=56),
    #    headers=headers,
    #    json=add_offers_to_archive_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_offers(client: TestClient):
    """Test case for delete_offers

    Удаление товаров из каталога
    """
    delete_offers_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_offers_from_archive(client: TestClient):
    """Test case for delete_offers_from_archive

    Удаление товаров из архива
    """
    delete_offers_from_archive_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/unarchive".format(businessId=56),
    #    headers=headers,
    #    json=delete_offers_from_archive_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_mappings(client: TestClient):
    """Test case for get_offer_mappings

    Информация о товарах в каталоге
    """
    get_offer_mappings_request = {"archived":1,"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_mappings_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_offer_mappings(client: TestClient):
    """Test case for get_suggested_offer_mappings

    Просмотр карточек на Маркете, которые подходят вашим товарам
    """
    get_suggested_offer_mappings_request = {"offers":[{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/suggestions".format(businessId=56),
    #    headers=headers,
    #    json=get_suggested_offer_mappings_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_mappings(client: TestClient):
    """Test case for update_offer_mappings

    Добавление товаров в каталог и изменение информации о них
    """
    update_offer_mappings_request = {"offer_mappings":[{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}}],"only_partner_media_content":1}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/update".format(businessId=56),
    #    headers=headers,
    #    json=update_offer_mappings_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

