-module(ympa_erlang_client_update_goods_feedback_comment_response).

-export([encode/1]).

-export_type([ympa_erlang_client_update_goods_feedback_comment_response/0]).

-type ympa_erlang_client_update_goods_feedback_comment_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_goods_feedback_comment_dto:ympa_erlang_client_goods_feedback_comment_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
