-module(ympa_erlang_client_feedback_list_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_list_dto/0]).

-type ympa_erlang_client_feedback_list_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'feedbackList' := list()
     }.

encode(#{ 'paging' := Paging,
          'feedbackList' := FeedbackList
        }) ->
    #{ 'paging' => Paging,
       'feedbackList' => FeedbackList
     }.
