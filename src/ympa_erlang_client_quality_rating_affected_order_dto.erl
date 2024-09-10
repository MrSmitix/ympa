-module(ympa_erlang_client_quality_rating_affected_order_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quality_rating_affected_order_dto/0]).

-type ympa_erlang_client_quality_rating_affected_order_dto() ::
    #{ 'orderId' := integer(),
       'description' := binary(),
       'componentType' := ympa_erlang_client_affected_order_quality_rating_component_type:ympa_erlang_client_affected_order_quality_rating_component_type()
     }.

encode(#{ 'orderId' := OrderId,
          'description' := Description,
          'componentType' := ComponentType
        }) ->
    #{ 'orderId' => OrderId,
       'description' => Description,
       'componentType' => ComponentType
     }.
