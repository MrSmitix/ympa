-module(ympa_erlang_proper_client_warehouse_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_offer_dto/0]).

-export([ympa_erlang_proper_client_warehouse_offer_dto/1]).

-export_type([ympa_erlang_proper_client_warehouse_offer_dto/0]).

-type ympa_erlang_proper_client_warehouse_offer_dto() ::
  [ {'offerId', binary() }
  | {'turnoverSummary', ympa_erlang_proper_client_turnover_dto:ympa_erlang_proper_client_turnover_dto() }
  | {'stocks', list(ympa_erlang_proper_client_warehouse_stock_dto:ympa_erlang_proper_client_warehouse_stock_dto()) }
  | {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_warehouse_offer_dto() ->
    ympa_erlang_proper_client_warehouse_offer_dto([]).

ympa_erlang_proper_client_warehouse_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'turnoverSummary', ympa_erlang_proper_client_turnover_dto:ympa_erlang_proper_client_turnover_dto() }
            , {'stocks', list(ympa_erlang_proper_client_warehouse_stock_dto:ympa_erlang_proper_client_warehouse_stock_dto()) }
            , {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

