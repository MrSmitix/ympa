-module(ympa_erlang_proper_client_feedback_list_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_list_dto/0]).

-export([ympa_erlang_proper_client_feedback_list_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_list_dto/0]).

-type ympa_erlang_proper_client_feedback_list_dto() ::
  [ {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
  | {'feedbackList', list(ympa_erlang_proper_client_feedback_dto:ympa_erlang_proper_client_feedback_dto()) }
  ].


ympa_erlang_proper_client_feedback_list_dto() ->
    ympa_erlang_proper_client_feedback_list_dto([]).

ympa_erlang_proper_client_feedback_list_dto(Fields) ->
  Default = [ {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
            , {'feedbackList', list(ympa_erlang_proper_client_feedback_dto:ympa_erlang_proper_client_feedback_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

