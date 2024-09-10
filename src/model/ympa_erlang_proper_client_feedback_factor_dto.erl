-module(ympa_erlang_proper_client_feedback_factor_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_factor_dto/0]).

-export([ympa_erlang_proper_client_feedback_factor_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_factor_dto/0]).

-type ympa_erlang_proper_client_feedback_factor_dto() ::
  [ {'id', integer() }
  | {'title', binary() }
  | {'description', binary() }
  | {'value', integer() }
  ].


ympa_erlang_proper_client_feedback_factor_dto() ->
    ympa_erlang_proper_client_feedback_factor_dto([]).

ympa_erlang_proper_client_feedback_factor_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'title', binary() }
            , {'description', binary() }
            , {'value', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

