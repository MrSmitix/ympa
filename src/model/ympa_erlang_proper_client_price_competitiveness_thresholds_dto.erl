-module(ympa_erlang_proper_client_price_competitiveness_thresholds_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_competitiveness_thresholds_dto/0]).

-export([ympa_erlang_proper_client_price_competitiveness_thresholds_dto/1]).

-export_type([ympa_erlang_proper_client_price_competitiveness_thresholds_dto/0]).

-type ympa_erlang_proper_client_price_competitiveness_thresholds_dto() ::
  [ {'optimalPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'averagePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  ].


ympa_erlang_proper_client_price_competitiveness_thresholds_dto() ->
    ympa_erlang_proper_client_price_competitiveness_thresholds_dto([]).

ympa_erlang_proper_client_price_competitiveness_thresholds_dto(Fields) ->
  Default = [ {'optimalPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'averagePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

