-module(ympa_erlang_proper_client_order_courier_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_courier_dto/0]).

-export([ympa_erlang_proper_client_order_courier_dto/1]).

-export_type([ympa_erlang_proper_client_order_courier_dto/0]).

-type ympa_erlang_proper_client_order_courier_dto() ::
  [ {'fullName', binary() }
  | {'phone', binary() }
  | {'phoneExtension', binary() }
  | {'vehicleNumber', binary() }
  | {'vehicleDescription', binary() }
  ].


ympa_erlang_proper_client_order_courier_dto() ->
    ympa_erlang_proper_client_order_courier_dto([]).

ympa_erlang_proper_client_order_courier_dto(Fields) ->
  Default = [ {'fullName', binary() }
            , {'phone', binary() }
            , {'phoneExtension', binary() }
            , {'vehicleNumber', binary() }
            , {'vehicleDescription', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

