-module(ympa_erlang_proper_client_feedback_author_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_author_dto/0]).

-export([ympa_erlang_proper_client_feedback_author_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_author_dto/0]).

-type ympa_erlang_proper_client_feedback_author_dto() ::
  [ {'name', binary() }
  | {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  ].


ympa_erlang_proper_client_feedback_author_dto() ->
    ympa_erlang_proper_client_feedback_author_dto([]).

ympa_erlang_proper_client_feedback_author_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

