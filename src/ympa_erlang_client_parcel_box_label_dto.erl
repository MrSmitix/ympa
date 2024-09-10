-module(ympa_erlang_client_parcel_box_label_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_parcel_box_label_dto/0]).

-type ympa_erlang_client_parcel_box_label_dto() ::
    #{ 'url' := binary(),
       'supplierName' := binary(),
       'deliveryServiceName' := binary(),
       'orderId' := integer(),
       'orderNum' := binary(),
       'recipientName' := binary(),
       'boxId' := integer(),
       'fulfilmentId' := binary(),
       'place' := binary(),
       'weight' := binary(),
       'deliveryServiceId' := binary(),
       'deliveryAddress' => binary(),
       'shipmentDate' => binary()
     }.

encode(#{ 'url' := Url,
          'supplierName' := SupplierName,
          'deliveryServiceName' := DeliveryServiceName,
          'orderId' := OrderId,
          'orderNum' := OrderNum,
          'recipientName' := RecipientName,
          'boxId' := BoxId,
          'fulfilmentId' := FulfilmentId,
          'place' := Place,
          'weight' := Weight,
          'deliveryServiceId' := DeliveryServiceId,
          'deliveryAddress' := DeliveryAddress,
          'shipmentDate' := ShipmentDate
        }) ->
    #{ 'url' => Url,
       'supplierName' => SupplierName,
       'deliveryServiceName' => DeliveryServiceName,
       'orderId' => OrderId,
       'orderNum' => OrderNum,
       'recipientName' => RecipientName,
       'boxId' => BoxId,
       'fulfilmentId' => FulfilmentId,
       'place' => Place,
       'weight' => Weight,
       'deliveryServiceId' => DeliveryServiceId,
       'deliveryAddress' => DeliveryAddress,
       'shipmentDate' => ShipmentDate
     }.
