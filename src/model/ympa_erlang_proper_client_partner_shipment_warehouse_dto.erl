-module(ympa_erlang_proper_client_partner_shipment_warehouse_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_partner_shipment_warehouse_dto/0]).

-export([ympa_erlang_proper_client_partner_shipment_warehouse_dto/1]).

-export_type([ympa_erlang_proper_client_partner_shipment_warehouse_dto/0]).

-type ympa_erlang_proper_client_partner_shipment_warehouse_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'address', binary() }
  ].


ympa_erlang_proper_client_partner_shipment_warehouse_dto() ->
    ympa_erlang_proper_client_partner_shipment_warehouse_dto([]).

ympa_erlang_proper_client_partner_shipment_warehouse_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'address', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

