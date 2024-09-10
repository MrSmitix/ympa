-module(ympa_erlang_proper_client_return_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_dto/0]).

-export([ympa_erlang_proper_client_return_dto/1]).

-export_type([ympa_erlang_proper_client_return_dto/0]).

-type ympa_erlang_proper_client_return_dto() ::
  [ {'id', integer() }
  | {'orderId', integer() }
  | {'creationDate', datetime() }
  | {'updateDate', datetime() }
  | {'refundStatus', ympa_erlang_proper_client_refund_status_type:ympa_erlang_proper_client_refund_status_type() }
  | {'logisticPickupPoint', ympa_erlang_proper_client_logistic_pickup_point_dto:ympa_erlang_proper_client_logistic_pickup_point_dto() }
  | {'shipmentRecipientType', ympa_erlang_proper_client_recipient_type:ympa_erlang_proper_client_recipient_type() }
  | {'shipmentStatus', ympa_erlang_proper_client_return_shipment_status_type:ympa_erlang_proper_client_return_shipment_status_type() }
  | {'refundAmount', integer() }
  | {'items', list(ympa_erlang_proper_client_return_item_dto:ympa_erlang_proper_client_return_item_dto()) }
  | {'returnType', ympa_erlang_proper_client_return_type:ympa_erlang_proper_client_return_type() }
  | {'fastReturn', boolean() }
  ].


ympa_erlang_proper_client_return_dto() ->
    ympa_erlang_proper_client_return_dto([]).

ympa_erlang_proper_client_return_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'orderId', integer() }
            , {'creationDate', datetime() }
            , {'updateDate', datetime() }
            , {'refundStatus', ympa_erlang_proper_client_refund_status_type:ympa_erlang_proper_client_refund_status_type() }
            , {'logisticPickupPoint', ympa_erlang_proper_client_logistic_pickup_point_dto:ympa_erlang_proper_client_logistic_pickup_point_dto() }
            , {'shipmentRecipientType', ympa_erlang_proper_client_recipient_type:ympa_erlang_proper_client_recipient_type() }
            , {'shipmentStatus', ympa_erlang_proper_client_return_shipment_status_type:ympa_erlang_proper_client_return_shipment_status_type() }
            , {'refundAmount', integer() }
            , {'items', list(ympa_erlang_proper_client_return_item_dto:ympa_erlang_proper_client_return_item_dto()) }
            , {'returnType', ympa_erlang_proper_client_return_type:ympa_erlang_proper_client_return_type() }
            , {'fastReturn', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

