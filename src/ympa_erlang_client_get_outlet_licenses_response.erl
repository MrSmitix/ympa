-module(ympa_erlang_client_get_outlet_licenses_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_outlet_licenses_response/0]).

-type ympa_erlang_client_get_outlet_licenses_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_outlet_licenses_response_dto:ympa_erlang_client_outlet_licenses_response_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
