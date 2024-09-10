-module(ympa_erlang_client_outlet_delivery_rule_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_delivery_rule_dto/0]).

-type ympa_erlang_client_outlet_delivery_rule_dto() ::
    #{ 'minDeliveryDays' => integer(),
       'maxDeliveryDays' => integer(),
       'deliveryServiceId' => integer(),
       'orderBefore' => integer(),
       'priceFreePickup' => integer(),
       'unspecifiedDeliveryInterval' => boolean()
     }.

encode(#{ 'minDeliveryDays' := MinDeliveryDays,
          'maxDeliveryDays' := MaxDeliveryDays,
          'deliveryServiceId' := DeliveryServiceId,
          'orderBefore' := OrderBefore,
          'priceFreePickup' := PriceFreePickup,
          'unspecifiedDeliveryInterval' := UnspecifiedDeliveryInterval
        }) ->
    #{ 'minDeliveryDays' => MinDeliveryDays,
       'maxDeliveryDays' => MaxDeliveryDays,
       'deliveryServiceId' => DeliveryServiceId,
       'orderBefore' => OrderBefore,
       'priceFreePickup' => PriceFreePickup,
       'unspecifiedDeliveryInterval' => UnspecifiedDeliveryInterval
     }.
