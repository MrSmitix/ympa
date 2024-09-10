-module(ympa_erlang_client_warehouse_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_offer_dto/0]).

-type ympa_erlang_client_warehouse_offer_dto() ::
    #{ 'offerId' := binary(),
       'turnoverSummary' => ympa_erlang_client_turnover_dto:ympa_erlang_client_turnover_dto(),
       'stocks' := list(),
       'updatedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'offerId' := OfferId,
          'turnoverSummary' := TurnoverSummary,
          'stocks' := Stocks,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'offerId' => OfferId,
       'turnoverSummary' => TurnoverSummary,
       'stocks' => Stocks,
       'updatedAt' => UpdatedAt
     }.
