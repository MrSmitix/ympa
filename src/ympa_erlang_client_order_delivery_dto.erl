-module(ympa_erlang_client_order_delivery_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_delivery_dto/0]).

-type ympa_erlang_client_order_delivery_dto() ::
    #{ 'id' => binary(),
       'type' => ympa_erlang_client_order_delivery_type:ympa_erlang_client_order_delivery_type(),
       'serviceName' => binary(),
       'price' => integer(),
       'deliveryPartnerType' => ympa_erlang_client_order_delivery_partner_type:ympa_erlang_client_order_delivery_partner_type(),
       'courier' => ympa_erlang_client_order_courier_dto:ympa_erlang_client_order_courier_dto(),
       'dates' => ympa_erlang_client_order_delivery_dates_dto:ympa_erlang_client_order_delivery_dates_dto(),
       'region' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto(),
       'address' => ympa_erlang_client_order_delivery_address_dto:ympa_erlang_client_order_delivery_address_dto(),
       'vat' => ympa_erlang_client_order_vat_type:ympa_erlang_client_order_vat_type(),
       'deliveryServiceId' => integer(),
       'liftType' => ympa_erlang_client_order_lift_type:ympa_erlang_client_order_lift_type(),
       'liftPrice' => integer(),
       'outletCode' => binary(),
       'outletStorageLimitDate' => binary(),
       'dispatchType' => ympa_erlang_client_order_delivery_dispatch_type:ympa_erlang_client_order_delivery_dispatch_type(),
       'tracks' => list(),
       'shipments' => list(),
       'estimated' => boolean(),
       'eacType' => ympa_erlang_client_order_delivery_eac_type:ympa_erlang_client_order_delivery_eac_type(),
       'eacCode' => binary()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'serviceName' := ServiceName,
          'price' := Price,
          'deliveryPartnerType' := DeliveryPartnerType,
          'courier' := Courier,
          'dates' := Dates,
          'region' := Region,
          'address' := Address,
          'vat' := Vat,
          'deliveryServiceId' := DeliveryServiceId,
          'liftType' := LiftType,
          'liftPrice' := LiftPrice,
          'outletCode' := OutletCode,
          'outletStorageLimitDate' := OutletStorageLimitDate,
          'dispatchType' := DispatchType,
          'tracks' := Tracks,
          'shipments' := Shipments,
          'estimated' := Estimated,
          'eacType' := EacType,
          'eacCode' := EacCode
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'serviceName' => ServiceName,
       'price' => Price,
       'deliveryPartnerType' => DeliveryPartnerType,
       'courier' => Courier,
       'dates' => Dates,
       'region' => Region,
       'address' => Address,
       'vat' => Vat,
       'deliveryServiceId' => DeliveryServiceId,
       'liftType' => LiftType,
       'liftPrice' => LiftPrice,
       'outletCode' => OutletCode,
       'outletStorageLimitDate' => OutletStorageLimitDate,
       'dispatchType' => DispatchType,
       'tracks' => Tracks,
       'shipments' => Shipments,
       'estimated' => Estimated,
       'eacType' => EacType,
       'eacCode' => EacCode
     }.
