-module(ympa_erlang_proper_client_get_warehouse_stocks_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_warehouse_stocks_dto/0]).

-export([ympa_erlang_proper_client_get_warehouse_stocks_dto/1]).

-export_type([ympa_erlang_proper_client_get_warehouse_stocks_dto/0]).

-type ympa_erlang_proper_client_get_warehouse_stocks_dto() ::
  [ {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
  | {'warehouses', list(ympa_erlang_proper_client_warehouse_offers_dto:ympa_erlang_proper_client_warehouse_offers_dto()) }
  ].


ympa_erlang_proper_client_get_warehouse_stocks_dto() ->
    ympa_erlang_proper_client_get_warehouse_stocks_dto([]).

ympa_erlang_proper_client_get_warehouse_stocks_dto(Fields) ->
  Default = [ {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
            , {'warehouses', list(ympa_erlang_proper_client_warehouse_offers_dto:ympa_erlang_proper_client_warehouse_offers_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

