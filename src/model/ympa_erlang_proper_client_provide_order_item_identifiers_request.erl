-module(ympa_erlang_proper_client_provide_order_item_identifiers_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_provide_order_item_identifiers_request/0]).

-export([ympa_erlang_proper_client_provide_order_item_identifiers_request/1]).

-export_type([ympa_erlang_proper_client_provide_order_item_identifiers_request/0]).

-type ympa_erlang_proper_client_provide_order_item_identifiers_request() ::
  [ {'items', list(ympa_erlang_proper_client_order_item_instance_modification_dto:ympa_erlang_proper_client_order_item_instance_modification_dto()) }
  ].


ympa_erlang_proper_client_provide_order_item_identifiers_request() ->
    ympa_erlang_proper_client_provide_order_item_identifiers_request([]).

ympa_erlang_proper_client_provide_order_item_identifiers_request(Fields) ->
  Default = [ {'items', list(ympa_erlang_proper_client_order_item_instance_modification_dto:ympa_erlang_proper_client_order_item_instance_modification_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

