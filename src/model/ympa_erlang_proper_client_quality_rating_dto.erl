-module(ympa_erlang_proper_client_quality_rating_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quality_rating_dto/0]).

-export([ympa_erlang_proper_client_quality_rating_dto/1]).

-export_type([ympa_erlang_proper_client_quality_rating_dto/0]).

-type ympa_erlang_proper_client_quality_rating_dto() ::
  [ {'rating', integer() }
  | {'calculationDate', date() }
  | {'components', list(ympa_erlang_proper_client_quality_rating_component_dto:ympa_erlang_proper_client_quality_rating_component_dto()) }
  ].


ympa_erlang_proper_client_quality_rating_dto() ->
    ympa_erlang_proper_client_quality_rating_dto([]).

ympa_erlang_proper_client_quality_rating_dto(Fields) ->
  Default = [ {'rating', integer(0, 100) }
            , {'calculationDate', date() }
            , {'components', list(ympa_erlang_proper_client_quality_rating_component_dto:ympa_erlang_proper_client_quality_rating_component_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

