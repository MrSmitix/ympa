-module(ympa_erlang_client_order_item_modification_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_modification_dto/0]).

-type ympa_erlang_client_order_item_modification_dto() ::
    #{ 'id' := integer(),
       'count' := integer(),
       'instances' => list()
     }.

encode(#{ 'id' := Id,
          'count' := Count,
          'instances' := Instances
        }) ->
    #{ 'id' => Id,
       'count' => Count,
       'instances' => Instances
     }.
