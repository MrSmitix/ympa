-module(ympa_erlang_client_set_order_box_layout_response).

-export([encode/1]).

-export_type([ympa_erlang_client_set_order_box_layout_response/0]).

-type ympa_erlang_client_set_order_box_layout_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_order_boxes_layout_dto:ympa_erlang_client_order_boxes_layout_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
