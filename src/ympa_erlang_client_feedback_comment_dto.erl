-module(ympa_erlang_client_feedback_comment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_comment_dto/0]).

-type ympa_erlang_client_feedback_comment_dto() ::
    #{ 'id' => integer(),
       'parentId' => integer(),
       'body' => binary(),
       'createdAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'updatedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'author' => ympa_erlang_client_feedback_comment_author_dto:ympa_erlang_client_feedback_comment_author_dto(),
       'children' => list()
     }.

encode(#{ 'id' := Id,
          'parentId' := ParentId,
          'body' := Body,
          'createdAt' := CreatedAt,
          'updatedAt' := UpdatedAt,
          'author' := Author,
          'children' := Children
        }) ->
    #{ 'id' => Id,
       'parentId' => ParentId,
       'body' => Body,
       'createdAt' => CreatedAt,
       'updatedAt' => UpdatedAt,
       'author' => Author,
       'children' => Children
     }.
