-module(ympa_erlang_proper_client_order_label_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_label_dto/0]).

-export([ympa_erlang_proper_client_order_label_dto/1]).

-export_type([ympa_erlang_proper_client_order_label_dto/0]).

-type ympa_erlang_proper_client_order_label_dto() ::
  [ {'orderId', integer() }
  | {'placesNumber', integer() }
  | {'url', binary() }
  | {'parcelBoxLabels', list(ympa_erlang_proper_client_parcel_box_label_dto:ympa_erlang_proper_client_parcel_box_label_dto()) }
  ].


ympa_erlang_proper_client_order_label_dto() ->
    ympa_erlang_proper_client_order_label_dto([]).

ympa_erlang_proper_client_order_label_dto(Fields) ->
  Default = [ {'orderId', integer() }
            , {'placesNumber', integer() }
            , {'url', binary() }
            , {'parcelBoxLabels', list(ympa_erlang_proper_client_parcel_box_label_dto:ympa_erlang_proper_client_parcel_box_label_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

