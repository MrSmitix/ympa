-module(ympa_erlang_client_get_hidden_offers_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_hidden_offers_response/0]).

-type ympa_erlang_client_get_hidden_offers_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_get_hidden_offers_result_dto:ympa_erlang_client_get_hidden_offers_result_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
