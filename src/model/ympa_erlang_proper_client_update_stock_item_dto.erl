-module(ympa_erlang_proper_client_update_stock_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_stock_item_dto/0]).

-export([ympa_erlang_proper_client_update_stock_item_dto/1]).

-export_type([ympa_erlang_proper_client_update_stock_item_dto/0]).

-type ympa_erlang_proper_client_update_stock_item_dto() ::
  [ {'count', integer() }
  | {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_update_stock_item_dto() ->
    ympa_erlang_proper_client_update_stock_item_dto([]).

ympa_erlang_proper_client_update_stock_item_dto(Fields) ->
  Default = [ {'count', integer(0, 2000000000) }
            , {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

