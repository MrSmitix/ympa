-module(ympa_erlang_proper_client_get_offer_recommendations_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_offer_recommendations_request/0]).

-export([ympa_erlang_proper_client_get_offer_recommendations_request/1]).

-export_type([ympa_erlang_proper_client_get_offer_recommendations_request/0]).

-type ympa_erlang_proper_client_get_offer_recommendations_request() ::
  [ {'offerIds', list(binary()) }
  | {'cofinancePriceFilter', ympa_erlang_proper_client_field_state_type:ympa_erlang_proper_client_field_state_type() }
  | {'recommendedCofinancePriceFilter', ympa_erlang_proper_client_field_state_type:ympa_erlang_proper_client_field_state_type() }
  | {'competitivenessFilter', ympa_erlang_proper_client_price_competitiveness_type:ympa_erlang_proper_client_price_competitiveness_type() }
  ].


ympa_erlang_proper_client_get_offer_recommendations_request() ->
    ympa_erlang_proper_client_get_offer_recommendations_request([]).

ympa_erlang_proper_client_get_offer_recommendations_request(Fields) ->
  Default = [ {'offerIds', list(binary()) }
            , {'cofinancePriceFilter', ympa_erlang_proper_client_field_state_type:ympa_erlang_proper_client_field_state_type() }
            , {'recommendedCofinancePriceFilter', ympa_erlang_proper_client_field_state_type:ympa_erlang_proper_client_field_state_type() }
            , {'competitivenessFilter', ympa_erlang_proper_client_price_competitiveness_type:ympa_erlang_proper_client_price_competitiveness_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

