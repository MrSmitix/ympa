-module(ympa_erlang_client_goods_feedback_comment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_comment_dto/0]).

-type ympa_erlang_client_goods_feedback_comment_dto() ::
    #{ 'id' := integer(),
       'text' := binary(),
       'canModify' => boolean(),
       'parentId' => integer(),
       'author' := ympa_erlang_client_goods_feedback_comment_author_dto:ympa_erlang_client_goods_feedback_comment_author_dto(),
       'status' := ympa_erlang_client_goods_feedback_comment_status_type:ympa_erlang_client_goods_feedback_comment_status_type()
     }.

encode(#{ 'id' := Id,
          'text' := Text,
          'canModify' := CanModify,
          'parentId' := ParentId,
          'author' := Author,
          'status' := Status
        }) ->
    #{ 'id' => Id,
       'text' => Text,
       'canModify' => CanModify,
       'parentId' => ParentId,
       'author' => Author,
       'status' => Status
     }.
