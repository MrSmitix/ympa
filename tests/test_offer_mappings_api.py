# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse  # noqa: F401
from ympa_python_fastapi_server.models.offer_availability_status_type import OfferAvailabilityStatusType  # noqa: F401
from ympa_python_fastapi_server.models.offer_mapping_kind_type import OfferMappingKindType  # noqa: F401
from ympa_python_fastapi_server.models.offer_processing_status_type import OfferProcessingStatusType  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest  # noqa: F401


def test_get_offer_mapping_entries(client: TestClient):
    """Test case for get_offer_mapping_entries

    Список товаров в каталоге
    """
    params = [("offer_id", ['offer_id_example']),     ("shop_sku", ['shop_sku_example']),     ("mapping_kind", ympa_python_fastapi_server.OfferMappingKindType()),     ("status", [ympa_python_fastapi_server.OfferProcessingStatusType()]),     ("availability", [ympa_python_fastapi_server.OfferAvailabilityStatusType()]),     ("category_id", [56]),     ("vendor", ['vendor_example']),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offer-mapping-entries".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_offer_mapping_entries(client: TestClient):
    """Test case for get_suggested_offer_mapping_entries

    Рекомендованные карточки для товаров
    """
    get_suggested_offer_mapping_entries_request = {"offers":[{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-mapping-entries/suggestions".format(campaignId=56),
    #    headers=headers,
    #    json=get_suggested_offer_mapping_entries_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_mapping_entries(client: TestClient):
    """Test case for update_offer_mapping_entries

    Добавление и редактирование товаров в каталоге
    """
    update_offer_mapping_entry_request = {"offer_mapping_entries":[{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-mapping-entries/updates".format(campaignId=56),
    #    headers=headers,
    #    json=update_offer_mapping_entry_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

