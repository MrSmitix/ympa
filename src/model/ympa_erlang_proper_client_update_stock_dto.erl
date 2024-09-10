-module(ympa_erlang_proper_client_update_stock_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_stock_dto/0]).

-export([ympa_erlang_proper_client_update_stock_dto/1]).

-export_type([ympa_erlang_proper_client_update_stock_dto/0]).

-type ympa_erlang_proper_client_update_stock_dto() ::
  [ {'sku', binary() }
  | {'items', list(ympa_erlang_proper_client_update_stock_item_dto:ympa_erlang_proper_client_update_stock_item_dto()) }
  ].


ympa_erlang_proper_client_update_stock_dto() ->
    ympa_erlang_proper_client_update_stock_dto([]).

ympa_erlang_proper_client_update_stock_dto(Fields) ->
  Default = [ {'sku', binary(1, 255) }
            , {'items', list(ympa_erlang_proper_client_update_stock_item_dto:ympa_erlang_proper_client_update_stock_item_dto(), 1, 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

