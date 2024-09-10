-module(ympa_erlang_client_offer_for_recommendation_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_for_recommendation_dto/0]).

-type ympa_erlang_client_offer_for_recommendation_dto() ::
    #{ 'offerId' => binary(),
       'price' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto(),
       'cofinancePrice' => ympa_erlang_client_get_price_dto:ympa_erlang_client_get_price_dto(),
       'competitiveness' => ympa_erlang_client_price_competitiveness_type:ympa_erlang_client_price_competitiveness_type(),
       'shows' => integer()
     }.

encode(#{ 'offerId' := OfferId,
          'price' := Price,
          'cofinancePrice' := CofinancePrice,
          'competitiveness' := Competitiveness,
          'shows' := Shows
        }) ->
    #{ 'offerId' => OfferId,
       'price' => Price,
       'cofinancePrice' => CofinancePrice,
       'competitiveness' => Competitiveness,
       'shows' => Shows
     }.
