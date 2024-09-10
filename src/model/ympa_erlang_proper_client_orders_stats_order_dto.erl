-module(ympa_erlang_proper_client_orders_stats_order_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_order_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_order_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_order_dto/0]).

-type ympa_erlang_proper_client_orders_stats_order_dto() ::
  [ {'id', integer() }
  | {'creationDate', date() }
  | {'statusUpdateDate', datetime() }
  | {'status', ympa_erlang_proper_client_order_stats_status_type:ympa_erlang_proper_client_order_stats_status_type() }
  | {'partnerOrderId', binary() }
  | {'paymentType', ympa_erlang_proper_client_orders_stats_order_payment_type:ympa_erlang_proper_client_orders_stats_order_payment_type() }
  | {'fake', boolean() }
  | {'deliveryRegion', ympa_erlang_proper_client_orders_stats_delivery_region_dto:ympa_erlang_proper_client_orders_stats_delivery_region_dto() }
  | {'items', list(ympa_erlang_proper_client_orders_stats_item_dto:ympa_erlang_proper_client_orders_stats_item_dto()) }
  | {'initialItems', list(ympa_erlang_proper_client_orders_stats_item_dto:ympa_erlang_proper_client_orders_stats_item_dto()) }
  | {'payments', list(ympa_erlang_proper_client_orders_stats_payment_dto:ympa_erlang_proper_client_orders_stats_payment_dto()) }
  | {'commissions', list(ympa_erlang_proper_client_orders_stats_commission_dto:ympa_erlang_proper_client_orders_stats_commission_dto()) }
  ].


ympa_erlang_proper_client_orders_stats_order_dto() ->
    ympa_erlang_proper_client_orders_stats_order_dto([]).

ympa_erlang_proper_client_orders_stats_order_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'creationDate', date() }
            , {'statusUpdateDate', datetime() }
            , {'status', ympa_erlang_proper_client_order_stats_status_type:ympa_erlang_proper_client_order_stats_status_type() }
            , {'partnerOrderId', binary() }
            , {'paymentType', ympa_erlang_proper_client_orders_stats_order_payment_type:ympa_erlang_proper_client_orders_stats_order_payment_type() }
            , {'fake', boolean() }
            , {'deliveryRegion', ympa_erlang_proper_client_orders_stats_delivery_region_dto:ympa_erlang_proper_client_orders_stats_delivery_region_dto() }
            , {'items', list(ympa_erlang_proper_client_orders_stats_item_dto:ympa_erlang_proper_client_orders_stats_item_dto()) }
            , {'initialItems', list(ympa_erlang_proper_client_orders_stats_item_dto:ympa_erlang_proper_client_orders_stats_item_dto()) }
            , {'payments', list(ympa_erlang_proper_client_orders_stats_payment_dto:ympa_erlang_proper_client_orders_stats_payment_dto()) }
            , {'commissions', list(ympa_erlang_proper_client_orders_stats_commission_dto:ympa_erlang_proper_client_orders_stats_commission_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

