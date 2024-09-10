-module(ympa_erlang_client_order_item_instance_modification_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_instance_modification_dto/0]).

-type ympa_erlang_client_order_item_instance_modification_dto() ::
    #{ 'id' := integer(),
       'instances' := list()
     }.

encode(#{ 'id' := Id,
          'instances' := Instances
        }) ->
    #{ 'id' => Id,
       'instances' => Instances
     }.
