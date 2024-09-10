-module(ympa_erlang_client_orders_stats_payment_order_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_payment_order_dto/0]).

-type ympa_erlang_client_orders_stats_payment_order_dto() ::
    #{ 'id' => binary(),
       'date' => calendar:date()
     }.

encode(#{ 'id' := Id,
          'date' := Date
        }) ->
    #{ 'id' => Id,
       'date' => Date
     }.
