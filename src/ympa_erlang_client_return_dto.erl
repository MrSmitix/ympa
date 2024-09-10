-module(ympa_erlang_client_return_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_return_dto/0]).

-type ympa_erlang_client_return_dto() ::
    #{ 'id' => integer(),
       'orderId' => integer(),
       'creationDate' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'updateDate' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'refundStatus' => ympa_erlang_client_refund_status_type:ympa_erlang_client_refund_status_type(),
       'logisticPickupPoint' => ympa_erlang_client_logistic_pickup_point_dto:ympa_erlang_client_logistic_pickup_point_dto(),
       'shipmentRecipientType' => ympa_erlang_client_recipient_type:ympa_erlang_client_recipient_type(),
       'shipmentStatus' => ympa_erlang_client_return_shipment_status_type:ympa_erlang_client_return_shipment_status_type(),
       'refundAmount' => integer(),
       'items' := list(),
       'returnType' => ympa_erlang_client_return_type:ympa_erlang_client_return_type(),
       'fastReturn' => boolean()
     }.

encode(#{ 'id' := Id,
          'orderId' := OrderId,
          'creationDate' := CreationDate,
          'updateDate' := UpdateDate,
          'refundStatus' := RefundStatus,
          'logisticPickupPoint' := LogisticPickupPoint,
          'shipmentRecipientType' := ShipmentRecipientType,
          'shipmentStatus' := ShipmentStatus,
          'refundAmount' := RefundAmount,
          'items' := Items,
          'returnType' := ReturnType,
          'fastReturn' := FastReturn
        }) ->
    #{ 'id' => Id,
       'orderId' => OrderId,
       'creationDate' => CreationDate,
       'updateDate' => UpdateDate,
       'refundStatus' => RefundStatus,
       'logisticPickupPoint' => LogisticPickupPoint,
       'shipmentRecipientType' => ShipmentRecipientType,
       'shipmentStatus' => ShipmentStatus,
       'refundAmount' => RefundAmount,
       'items' => Items,
       'returnType' => ReturnType,
       'fastReturn' => FastReturn
     }.
