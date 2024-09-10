-module(ympa_erlang_client_api_not_found_error_response).

-export([encode/1]).

-export_type([ympa_erlang_client_api_not_found_error_response/0]).

-type ympa_erlang_client_api_not_found_error_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'errors' => list()
     }.

encode(#{ 'status' := Status,
          'errors' := Errors
        }) ->
    #{ 'status' => Status,
       'errors' => Errors
     }.
