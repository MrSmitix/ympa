-module(ympa_erlang_proper_client_warehouse_offers_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_offers_dto/0]).

-export([ympa_erlang_proper_client_warehouse_offers_dto/1]).

-export_type([ympa_erlang_proper_client_warehouse_offers_dto/0]).

-type ympa_erlang_proper_client_warehouse_offers_dto() ::
  [ {'warehouseId', integer() }
  | {'offers', list(ympa_erlang_proper_client_warehouse_offer_dto:ympa_erlang_proper_client_warehouse_offer_dto()) }
  ].


ympa_erlang_proper_client_warehouse_offers_dto() ->
    ympa_erlang_proper_client_warehouse_offers_dto([]).

ympa_erlang_proper_client_warehouse_offers_dto(Fields) ->
  Default = [ {'warehouseId', integer() }
            , {'offers', list(ympa_erlang_proper_client_warehouse_offer_dto:ympa_erlang_proper_client_warehouse_offer_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

