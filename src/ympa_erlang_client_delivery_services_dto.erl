-module(ympa_erlang_client_delivery_services_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_delivery_services_dto/0]).

-type ympa_erlang_client_delivery_services_dto() ::
    #{ 'deliveryService' := list()
     }.

encode(#{ 'deliveryService' := DeliveryService
        }) ->
    #{ 'deliveryService' => DeliveryService
     }.
