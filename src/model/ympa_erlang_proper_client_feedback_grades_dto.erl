-module(ympa_erlang_proper_client_feedback_grades_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_grades_dto/0]).

-export([ympa_erlang_proper_client_feedback_grades_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_grades_dto/0]).

-type ympa_erlang_proper_client_feedback_grades_dto() ::
  [ {'average', integer() }
  | {'agreeCount', integer() }
  | {'rejectCount', integer() }
  | {'factors', list(ympa_erlang_proper_client_feedback_factor_dto:ympa_erlang_proper_client_feedback_factor_dto()) }
  ].


ympa_erlang_proper_client_feedback_grades_dto() ->
    ympa_erlang_proper_client_feedback_grades_dto([]).

ympa_erlang_proper_client_feedback_grades_dto(Fields) ->
  Default = [ {'average', integer() }
            , {'agreeCount', integer() }
            , {'rejectCount', integer() }
            , {'factors', list(ympa_erlang_proper_client_feedback_factor_dto:ympa_erlang_proper_client_feedback_factor_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

