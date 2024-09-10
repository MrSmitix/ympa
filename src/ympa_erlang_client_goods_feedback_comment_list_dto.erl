-module(ympa_erlang_client_goods_feedback_comment_list_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_comment_list_dto/0]).

-type ympa_erlang_client_goods_feedback_comment_list_dto() ::
    #{ 'comments' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'comments' := Comments,
          'paging' := Paging
        }) ->
    #{ 'comments' => Comments,
       'paging' => Paging
     }.
