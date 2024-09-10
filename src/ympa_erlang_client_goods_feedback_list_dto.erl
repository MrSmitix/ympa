-module(ympa_erlang_client_goods_feedback_list_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_list_dto/0]).

-type ympa_erlang_client_goods_feedback_list_dto() ::
    #{ 'feedbacks' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'feedbacks' := Feedbacks,
          'paging' := Paging
        }) ->
    #{ 'feedbacks' => Feedbacks,
       'paging' => Paging
     }.
