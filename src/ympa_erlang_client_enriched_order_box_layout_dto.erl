-module(ympa_erlang_client_enriched_order_box_layout_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_enriched_order_box_layout_dto/0]).

-type ympa_erlang_client_enriched_order_box_layout_dto() ::
    #{ 'items' := list(),
       'boxId' => integer()
     }.

encode(#{ 'items' := Items,
          'boxId' := BoxId
        }) ->
    #{ 'items' => Items,
       'boxId' => BoxId
     }.
