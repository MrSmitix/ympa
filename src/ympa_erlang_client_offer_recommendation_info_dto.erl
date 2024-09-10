-module(ympa_erlang_client_offer_recommendation_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_recommendation_info_dto/0]).

-type ympa_erlang_client_offer_recommendation_info_dto() ::
    #{ 'offerId' => binary(),
       'recommendedCofinancePrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto(),
       'competitivenessThresholds' => ympa_erlang_client_price_competitiveness_thresholds_dto:ympa_erlang_client_price_competitiveness_thresholds_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'recommendedCofinancePrice' := RecommendedCofinancePrice,
          'competitivenessThresholds' := CompetitivenessThresholds
        }) ->
    #{ 'offerId' => OfferId,
       'recommendedCofinancePrice' => RecommendedCofinancePrice,
       'competitivenessThresholds' => CompetitivenessThresholds
     }.
