-module(ympa_erlang_client_delete_goods_feedback_comment_request).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_goods_feedback_comment_request/0]).

-type ympa_erlang_client_delete_goods_feedback_comment_request() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
