-module(ympa_erlang_proper_client_order_parcel_box_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_parcel_box_dto/0]).

-export([ympa_erlang_proper_client_order_parcel_box_dto/1]).

-export_type([ympa_erlang_proper_client_order_parcel_box_dto/0]).

-type ympa_erlang_proper_client_order_parcel_box_dto() ::
  [ {'id', integer() }
  | {'fulfilmentId', binary() }
  ].


ympa_erlang_proper_client_order_parcel_box_dto() ->
    ympa_erlang_proper_client_order_parcel_box_dto([]).

ympa_erlang_proper_client_order_parcel_box_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'fulfilmentId', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

