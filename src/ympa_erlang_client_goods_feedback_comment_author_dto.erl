-module(ympa_erlang_client_goods_feedback_comment_author_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_comment_author_dto/0]).

-type ympa_erlang_client_goods_feedback_comment_author_dto() ::
    #{ 'type' => ympa_erlang_client_goods_feedback_comment_author_type:ympa_erlang_client_goods_feedback_comment_author_type(),
       'name' => binary()
     }.

encode(#{ 'type' := Type,
          'name' := Name
        }) ->
    #{ 'type' => Type,
       'name' => Name
     }.
