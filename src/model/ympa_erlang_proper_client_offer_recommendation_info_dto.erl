-module(ympa_erlang_proper_client_offer_recommendation_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_recommendation_info_dto/0]).

-export([ympa_erlang_proper_client_offer_recommendation_info_dto/1]).

-export_type([ympa_erlang_proper_client_offer_recommendation_info_dto/0]).

-type ympa_erlang_proper_client_offer_recommendation_info_dto() ::
  [ {'offerId', binary() }
  | {'recommendedCofinancePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'competitivenessThresholds', ympa_erlang_proper_client_price_competitiveness_thresholds_dto:ympa_erlang_proper_client_price_competitiveness_thresholds_dto() }
  ].


ympa_erlang_proper_client_offer_recommendation_info_dto() ->
    ympa_erlang_proper_client_offer_recommendation_info_dto([]).

ympa_erlang_proper_client_offer_recommendation_info_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'recommendedCofinancePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'competitivenessThresholds', ympa_erlang_proper_client_price_competitiveness_thresholds_dto:ympa_erlang_proper_client_price_competitiveness_thresholds_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

