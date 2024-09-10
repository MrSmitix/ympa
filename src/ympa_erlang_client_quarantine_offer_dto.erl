-module(ympa_erlang_client_quarantine_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quarantine_offer_dto/0]).

-type ympa_erlang_client_quarantine_offer_dto() ::
    #{ 'offerId' => binary(),
       'currentPrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto(),
       'lastValidPrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto(),
       'verdicts' => list()
     }.

encode(#{ 'offerId' := OfferId,
          'currentPrice' := CurrentPrice,
          'lastValidPrice' := LastValidPrice,
          'verdicts' := Verdicts
        }) ->
    #{ 'offerId' => OfferId,
       'currentPrice' => CurrentPrice,
       'lastValidPrice' => LastValidPrice,
       'verdicts' => Verdicts
     }.
