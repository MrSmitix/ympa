-module(ympa_erlang_client_set_order_box_layout_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_order_box_layout_request/0]).

-type ympa_erlang_client_set_order_box_layout_request() ::
    #{ 'boxes' := list(),
       'allowRemove' => boolean()
     }.

encode(#{ 'boxes' := Boxes,
          'allowRemove' := AllowRemove
        }) ->
    #{ 'boxes' => Boxes,
       'allowRemove' => AllowRemove
     }.
