-module(ympa_erlang_proper_client_update_order_item_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_item_request/0]).

-export([ympa_erlang_proper_client_update_order_item_request/1]).

-export_type([ympa_erlang_proper_client_update_order_item_request/0]).

-type ympa_erlang_proper_client_update_order_item_request() ::
  [ {'items', list(ympa_erlang_proper_client_order_item_modification_dto:ympa_erlang_proper_client_order_item_modification_dto()) }
  | {'reason', ympa_erlang_proper_client_order_items_modification_request_reason_type:ympa_erlang_proper_client_order_items_modification_request_reason_type() }
  ].


ympa_erlang_proper_client_update_order_item_request() ->
    ympa_erlang_proper_client_update_order_item_request([]).

ympa_erlang_proper_client_update_order_item_request(Fields) ->
  Default = [ {'items', list(ympa_erlang_proper_client_order_item_modification_dto:ympa_erlang_proper_client_order_item_modification_dto(), 1) }
            , {'reason', ympa_erlang_proper_client_order_items_modification_request_reason_type:ympa_erlang_proper_client_order_items_modification_request_reason_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

