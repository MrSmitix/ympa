-module(ympa_erlang_client_get_warehouse_stocks_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_warehouse_stocks_request/0]).

-type ympa_erlang_client_get_warehouse_stocks_request() ::
    #{ 'withTurnover' => boolean(),
       'archived' => boolean(),
       'offerIds' => ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'withTurnover' := WithTurnover,
          'archived' := Archived,
          'offerIds' := OfferIds
        }) ->
    #{ 'withTurnover' => WithTurnover,
       'archived' => Archived,
       'offerIds' => OfferIds
     }.
