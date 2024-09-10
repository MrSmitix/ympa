-module(ympa_erlang_client_get_delivery_services_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_delivery_services_response/0]).

-type ympa_erlang_client_get_delivery_services_response() ::
    #{ 'result' => ympa_erlang_client_delivery_services_dto:ympa_erlang_client_delivery_services_dto()
     }.

encode(#{ 'result' := Result
        }) ->
    #{ 'result' => Result
     }.
