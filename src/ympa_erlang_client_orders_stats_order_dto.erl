-module(ympa_erlang_client_orders_stats_order_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_order_dto/0]).

-type ympa_erlang_client_orders_stats_order_dto() ::
    #{ 'id' => integer(),
       'creationDate' => calendar:date(),
       'statusUpdateDate' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'status' => ympa_erlang_client_order_stats_status_type:ympa_erlang_client_order_stats_status_type(),
       'partnerOrderId' => binary(),
       'paymentType' => ympa_erlang_client_orders_stats_order_payment_type:ympa_erlang_client_orders_stats_order_payment_type(),
       'fake' => boolean(),
       'deliveryRegion' => ympa_erlang_client_orders_stats_delivery_region_dto:ympa_erlang_client_orders_stats_delivery_region_dto(),
       'items' := list(),
       'initialItems' => list(),
       'payments' := list(),
       'commissions' := list()
     }.

encode(#{ 'id' := Id,
          'creationDate' := CreationDate,
          'statusUpdateDate' := StatusUpdateDate,
          'status' := Status,
          'partnerOrderId' := PartnerOrderId,
          'paymentType' := PaymentType,
          'fake' := Fake,
          'deliveryRegion' := DeliveryRegion,
          'items' := Items,
          'initialItems' := InitialItems,
          'payments' := Payments,
          'commissions' := Commissions
        }) ->
    #{ 'id' => Id,
       'creationDate' => CreationDate,
       'statusUpdateDate' => StatusUpdateDate,
       'status' => Status,
       'partnerOrderId' => PartnerOrderId,
       'paymentType' => PaymentType,
       'fake' => Fake,
       'deliveryRegion' => DeliveryRegion,
       'items' => Items,
       'initialItems' => InitialItems,
       'payments' => Payments,
       'commissions' => Commissions
     }.
