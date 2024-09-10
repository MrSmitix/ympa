-module(ympa_erlang_proper_client_quality_rating_component_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quality_rating_component_dto/0]).

-export([ympa_erlang_proper_client_quality_rating_component_dto/1]).

-export_type([ympa_erlang_proper_client_quality_rating_component_dto/0]).

-type ympa_erlang_proper_client_quality_rating_component_dto() ::
  [ {'value', float() }
  | {'componentType', ympa_erlang_proper_client_quality_rating_component_type:ympa_erlang_proper_client_quality_rating_component_type() }
  ].


ympa_erlang_proper_client_quality_rating_component_dto() ->
    ympa_erlang_proper_client_quality_rating_component_dto([]).

ympa_erlang_proper_client_quality_rating_component_dto(Fields) ->
  Default = [ {'value', float() }
            , {'componentType', ympa_erlang_proper_client_quality_rating_component_type:ympa_erlang_proper_client_quality_rating_component_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

