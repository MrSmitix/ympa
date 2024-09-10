-module(ympa_erlang_proper_client_parcel_box_label_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_parcel_box_label_dto/0]).

-export([ympa_erlang_proper_client_parcel_box_label_dto/1]).

-export_type([ympa_erlang_proper_client_parcel_box_label_dto/0]).

-type ympa_erlang_proper_client_parcel_box_label_dto() ::
  [ {'url', binary() }
  | {'supplierName', binary() }
  | {'deliveryServiceName', binary() }
  | {'orderId', integer() }
  | {'orderNum', binary() }
  | {'recipientName', binary() }
  | {'boxId', integer() }
  | {'fulfilmentId', binary() }
  | {'place', binary() }
  | {'weight', binary() }
  | {'deliveryServiceId', binary() }
  | {'deliveryAddress', binary() }
  | {'shipmentDate', binary() }
  ].


ympa_erlang_proper_client_parcel_box_label_dto() ->
    ympa_erlang_proper_client_parcel_box_label_dto([]).

ympa_erlang_proper_client_parcel_box_label_dto(Fields) ->
  Default = [ {'url', binary() }
            , {'supplierName', binary() }
            , {'deliveryServiceName', binary() }
            , {'orderId', integer() }
            , {'orderNum', binary() }
            , {'recipientName', binary() }
            , {'boxId', integer() }
            , {'fulfilmentId', binary() }
            , {'place', binary() }
            , {'weight', binary() }
            , {'deliveryServiceId', binary() }
            , {'deliveryAddress', binary() }
            , {'shipmentDate', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

