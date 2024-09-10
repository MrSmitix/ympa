-module(ympa_erlang_client_order_box_layout_partial_count_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_box_layout_partial_count_dto/0]).

-type ympa_erlang_client_order_box_layout_partial_count_dto() ::
    #{ 'current' := integer(),
       'total' := integer()
     }.

encode(#{ 'current' := Current,
          'total' := Total
        }) ->
    #{ 'current' => Current,
       'total' => Total
     }.
