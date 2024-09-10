-module(ympa_erlang_client_get_offer_recommendations_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_recommendations_request/0]).

-type ympa_erlang_client_get_offer_recommendations_request() ::
    #{ 'offerIds' => list(),
       'cofinancePriceFilter' => ympa_erlang_client_field_state_type:ympa_erlang_client_field_state_type(),
       'recommendedCofinancePriceFilter' => ympa_erlang_client_field_state_type:ympa_erlang_client_field_state_type(),
       'competitivenessFilter' => ympa_erlang_client_price_competitiveness_type:ympa_erlang_client_price_competitiveness_type()
     }.

encode(#{ 'offerIds' := OfferIds,
          'cofinancePriceFilter' := CofinancePriceFilter,
          'recommendedCofinancePriceFilter' := RecommendedCofinancePriceFilter,
          'competitivenessFilter' := CompetitivenessFilter
        }) ->
    #{ 'offerIds' => OfferIds,
       'cofinancePriceFilter' => CofinancePriceFilter,
       'recommendedCofinancePriceFilter' => RecommendedCofinancePriceFilter,
       'competitivenessFilter' => CompetitivenessFilter
     }.
