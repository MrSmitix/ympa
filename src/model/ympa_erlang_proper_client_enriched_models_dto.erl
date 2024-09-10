-module(ympa_erlang_proper_client_enriched_models_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_enriched_models_dto/0]).

-export([ympa_erlang_proper_client_enriched_models_dto/1]).

-export_type([ympa_erlang_proper_client_enriched_models_dto/0]).

-type ympa_erlang_proper_client_enriched_models_dto() ::
  [ {'models', list(ympa_erlang_proper_client_enriched_model_dto:ympa_erlang_proper_client_enriched_model_dto()) }
  ].


ympa_erlang_proper_client_enriched_models_dto() ->
    ympa_erlang_proper_client_enriched_models_dto([]).

ympa_erlang_proper_client_enriched_models_dto(Fields) ->
  Default = [ {'models', list(ympa_erlang_proper_client_enriched_model_dto:ympa_erlang_proper_client_enriched_model_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

