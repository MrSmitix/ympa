-module(ympa_erlang_client_get_order_buyer_info_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_order_buyer_info_response/0]).

-type ympa_erlang_client_get_order_buyer_info_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_order_buyer_info_dto:ympa_erlang_client_order_buyer_info_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
