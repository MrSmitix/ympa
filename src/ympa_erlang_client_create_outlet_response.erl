-module(ympa_erlang_client_create_outlet_response).

-export([encode/1]).

-export_type([ympa_erlang_client_create_outlet_response/0]).

-type ympa_erlang_client_create_outlet_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_outlet_response_dto:ympa_erlang_client_outlet_response_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
