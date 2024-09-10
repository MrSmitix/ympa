-module(ympa_erlang_client_api_response).

-export([encode/1]).

-export_type([ympa_erlang_client_api_response/0]).

-type ympa_erlang_client_api_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type()
     }.

encode(#{ 'status' := Status
        }) ->
    #{ 'status' => Status
     }.
