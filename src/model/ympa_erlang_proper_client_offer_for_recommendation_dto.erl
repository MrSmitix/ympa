-module(ympa_erlang_proper_client_offer_for_recommendation_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_for_recommendation_dto/0]).

-export([ympa_erlang_proper_client_offer_for_recommendation_dto/1]).

-export_type([ympa_erlang_proper_client_offer_for_recommendation_dto/0]).

-type ympa_erlang_proper_client_offer_for_recommendation_dto() ::
  [ {'offerId', binary() }
  | {'price', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'cofinancePrice', ympa_erlang_proper_client_get_price_dto:ympa_erlang_proper_client_get_price_dto() }
  | {'competitiveness', ympa_erlang_proper_client_price_competitiveness_type:ympa_erlang_proper_client_price_competitiveness_type() }
  | {'shows', integer() }
  ].


ympa_erlang_proper_client_offer_for_recommendation_dto() ->
    ympa_erlang_proper_client_offer_for_recommendation_dto([]).

ympa_erlang_proper_client_offer_for_recommendation_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'price', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'cofinancePrice', ympa_erlang_proper_client_get_price_dto:ympa_erlang_proper_client_get_price_dto() }
            , {'competitiveness', ympa_erlang_proper_client_price_competitiveness_type:ympa_erlang_proper_client_price_competitiveness_type() }
            , {'shows', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

