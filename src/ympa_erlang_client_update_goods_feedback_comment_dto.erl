-module(ympa_erlang_client_update_goods_feedback_comment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_goods_feedback_comment_dto/0]).

-type ympa_erlang_client_update_goods_feedback_comment_dto() ::
    #{ 'id' => integer(),
       'parentId' => integer(),
       'text' := binary()
     }.

encode(#{ 'id' := Id,
          'parentId' := ParentId,
          'text' := Text
        }) ->
    #{ 'id' => Id,
       'parentId' => ParentId,
       'text' => Text
     }.
