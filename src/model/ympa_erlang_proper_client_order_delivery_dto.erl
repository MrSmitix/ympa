-module(ympa_erlang_proper_client_order_delivery_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_dto/0]).

-export([ympa_erlang_proper_client_order_delivery_dto/1]).

-export_type([ympa_erlang_proper_client_order_delivery_dto/0]).

-type ympa_erlang_proper_client_order_delivery_dto() ::
  [ {'id', binary() }
  | {'type', ympa_erlang_proper_client_order_delivery_type:ympa_erlang_proper_client_order_delivery_type() }
  | {'serviceName', binary() }
  | {'price', integer() }
  | {'deliveryPartnerType', ympa_erlang_proper_client_order_delivery_partner_type:ympa_erlang_proper_client_order_delivery_partner_type() }
  | {'courier', ympa_erlang_proper_client_order_courier_dto:ympa_erlang_proper_client_order_courier_dto() }
  | {'dates', ympa_erlang_proper_client_order_delivery_dates_dto:ympa_erlang_proper_client_order_delivery_dates_dto() }
  | {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  | {'address', ympa_erlang_proper_client_order_delivery_address_dto:ympa_erlang_proper_client_order_delivery_address_dto() }
  | {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
  | {'deliveryServiceId', integer() }
  | {'liftType', ympa_erlang_proper_client_order_lift_type:ympa_erlang_proper_client_order_lift_type() }
  | {'liftPrice', integer() }
  | {'outletCode', binary() }
  | {'outletStorageLimitDate', binary() }
  | {'dispatchType', ympa_erlang_proper_client_order_delivery_dispatch_type:ympa_erlang_proper_client_order_delivery_dispatch_type() }
  | {'tracks', list(ympa_erlang_proper_client_order_track_dto:ympa_erlang_proper_client_order_track_dto()) }
  | {'shipments', list(ympa_erlang_proper_client_order_shipment_dto:ympa_erlang_proper_client_order_shipment_dto()) }
  | {'estimated', boolean() }
  | {'eacType', ympa_erlang_proper_client_order_delivery_eac_type:ympa_erlang_proper_client_order_delivery_eac_type() }
  | {'eacCode', binary() }
  ].


ympa_erlang_proper_client_order_delivery_dto() ->
    ympa_erlang_proper_client_order_delivery_dto([]).

ympa_erlang_proper_client_order_delivery_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'type', ympa_erlang_proper_client_order_delivery_type:ympa_erlang_proper_client_order_delivery_type() }
            , {'serviceName', binary() }
            , {'price', integer() }
            , {'deliveryPartnerType', ympa_erlang_proper_client_order_delivery_partner_type:ympa_erlang_proper_client_order_delivery_partner_type() }
            , {'courier', ympa_erlang_proper_client_order_courier_dto:ympa_erlang_proper_client_order_courier_dto() }
            , {'dates', ympa_erlang_proper_client_order_delivery_dates_dto:ympa_erlang_proper_client_order_delivery_dates_dto() }
            , {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            , {'address', ympa_erlang_proper_client_order_delivery_address_dto:ympa_erlang_proper_client_order_delivery_address_dto() }
            , {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
            , {'deliveryServiceId', integer() }
            , {'liftType', ympa_erlang_proper_client_order_lift_type:ympa_erlang_proper_client_order_lift_type() }
            , {'liftPrice', integer() }
            , {'outletCode', binary() }
            , {'outletStorageLimitDate', binary() }
            , {'dispatchType', ympa_erlang_proper_client_order_delivery_dispatch_type:ympa_erlang_proper_client_order_delivery_dispatch_type() }
            , {'tracks', list(ympa_erlang_proper_client_order_track_dto:ympa_erlang_proper_client_order_track_dto()) }
            , {'shipments', list(ympa_erlang_proper_client_order_shipment_dto:ympa_erlang_proper_client_order_shipment_dto()) }
            , {'estimated', boolean() }
            , {'eacType', ympa_erlang_proper_client_order_delivery_eac_type:ympa_erlang_proper_client_order_delivery_eac_type() }
            , {'eacCode', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

