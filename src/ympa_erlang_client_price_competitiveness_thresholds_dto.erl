-module(ympa_erlang_client_price_competitiveness_thresholds_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_competitiveness_thresholds_dto/0]).

-type ympa_erlang_client_price_competitiveness_thresholds_dto() ::
    #{ 'optimalPrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto(),
       'averagePrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto()
     }.

encode(#{ 'optimalPrice' := OptimalPrice,
          'averagePrice' := AveragePrice
        }) ->
    #{ 'optimalPrice' => OptimalPrice,
       'averagePrice' => AveragePrice
     }.
