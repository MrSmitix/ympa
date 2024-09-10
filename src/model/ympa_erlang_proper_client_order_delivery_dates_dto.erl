-module(ympa_erlang_proper_client_order_delivery_dates_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_dates_dto/0]).

-export([ympa_erlang_proper_client_order_delivery_dates_dto/1]).

-export_type([ympa_erlang_proper_client_order_delivery_dates_dto/0]).

-type ympa_erlang_proper_client_order_delivery_dates_dto() ::
  [ {'fromDate', binary() }
  | {'toDate', binary() }
  | {'fromTime', binary() }
  | {'toTime', binary() }
  | {'realDeliveryDate', binary() }
  ].


ympa_erlang_proper_client_order_delivery_dates_dto() ->
    ympa_erlang_proper_client_order_delivery_dates_dto([]).

ympa_erlang_proper_client_order_delivery_dates_dto(Fields) ->
  Default = [ {'fromDate', binary() }
            , {'toDate', binary() }
            , {'fromTime', binary() }
            , {'toTime', binary() }
            , {'realDeliveryDate', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

