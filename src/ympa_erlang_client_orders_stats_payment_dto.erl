-module(ympa_erlang_client_orders_stats_payment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_payment_dto/0]).

-type ympa_erlang_client_orders_stats_payment_dto() ::
    #{ 'id' => binary(),
       'date' => calendar:date(),
       'type' => ympa_erlang_client_orders_stats_payment_type:ympa_erlang_client_orders_stats_payment_type(),
       'source' => ympa_erlang_client_orders_stats_payment_source_type:ympa_erlang_client_orders_stats_payment_source_type(),
       'total' => integer(),
       'paymentOrder' => ympa_erlang_client_orders_stats_payment_order_dto:ympa_erlang_client_orders_stats_payment_order_dto()
     }.

encode(#{ 'id' := Id,
          'date' := Date,
          'type' := Type,
          'source' := Source,
          'total' := Total,
          'paymentOrder' := PaymentOrder
        }) ->
    #{ 'id' => Id,
       'date' => Date,
       'type' => Type,
       'source' => Source,
       'total' => Total,
       'paymentOrder' => PaymentOrder
     }.
