-module(ympa_erlang_client_order_box_layout_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_box_layout_item_dto/0]).

-type ympa_erlang_client_order_box_layout_item_dto() ::
    #{ 'id' := integer(),
       'fullCount' => integer(),
       'partialCount' => ympa_erlang_client_order_box_layout_partial_count_dto:ympa_erlang_client_order_box_layout_partial_count_dto(),
       'instances' => list()
     }.

encode(#{ 'id' := Id,
          'fullCount' := FullCount,
          'partialCount' := PartialCount,
          'instances' := Instances
        }) ->
    #{ 'id' => Id,
       'fullCount' => FullCount,
       'partialCount' => PartialCount,
       'instances' => Instances
     }.
