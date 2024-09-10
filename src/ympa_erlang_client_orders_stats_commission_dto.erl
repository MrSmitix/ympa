-module(ympa_erlang_client_orders_stats_commission_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_commission_dto/0]).

-type ympa_erlang_client_orders_stats_commission_dto() ::
    #{ 'type' => ympa_erlang_client_orders_stats_commission_type:ympa_erlang_client_orders_stats_commission_type(),
       'actual' => integer()
     }.

encode(#{ 'type' := Type,
          'actual' := Actual
        }) ->
    #{ 'type' => Type,
       'actual' => Actual
     }.
