-module(ympa_erlang_proper_client_order_items_modification_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_items_modification_result_dto/0]).

-export([ympa_erlang_proper_client_order_items_modification_result_dto/1]).

-export_type([ympa_erlang_proper_client_order_items_modification_result_dto/0]).

-type ympa_erlang_proper_client_order_items_modification_result_dto() ::
  [ {'items', list(ympa_erlang_proper_client_brief_order_item_dto:ympa_erlang_proper_client_brief_order_item_dto()) }
  ].


ympa_erlang_proper_client_order_items_modification_result_dto() ->
    ympa_erlang_proper_client_order_items_modification_result_dto([]).

ympa_erlang_proper_client_order_items_modification_result_dto(Fields) ->
  Default = [ {'items', list(ympa_erlang_proper_client_brief_order_item_dto:ympa_erlang_proper_client_brief_order_item_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

