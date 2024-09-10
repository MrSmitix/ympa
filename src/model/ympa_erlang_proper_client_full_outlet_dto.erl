-module(ympa_erlang_proper_client_full_outlet_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_full_outlet_dto/0]).

-export([ympa_erlang_proper_client_full_outlet_dto/1]).

-export_type([ympa_erlang_proper_client_full_outlet_dto/0]).

-type ympa_erlang_proper_client_full_outlet_dto() ::
  [ {'name', binary() }
  | {'type', ympa_erlang_proper_client_outlet_type:ympa_erlang_proper_client_outlet_type() }
  | {'coords', binary() }
  | {'isMain', boolean() }
  | {'shopOutletCode', binary() }
  | {'visibility', ympa_erlang_proper_client_outlet_visibility_type:ympa_erlang_proper_client_outlet_visibility_type() }
  | {'address', ympa_erlang_proper_client_outlet_address_dto:ympa_erlang_proper_client_outlet_address_dto() }
  | {'phones', list(binary(1)) }
  | {'workingSchedule', ympa_erlang_proper_client_outlet_working_schedule_dto:ympa_erlang_proper_client_outlet_working_schedule_dto() }
  | {'deliveryRules', list(ympa_erlang_proper_client_outlet_delivery_rule_dto:ympa_erlang_proper_client_outlet_delivery_rule_dto()) }
  | {'storagePeriod', integer() }
  | {'id', integer() }
  | {'status', ympa_erlang_proper_client_outlet_status_type:ympa_erlang_proper_client_outlet_status_type() }
  | {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  | {'shopOutletId', binary() }
  | {'workingTime', binary() }
  | {'moderationReason', binary() }
  ].


ympa_erlang_proper_client_full_outlet_dto() ->
    ympa_erlang_proper_client_full_outlet_dto([]).

ympa_erlang_proper_client_full_outlet_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'type', ympa_erlang_proper_client_outlet_type:ympa_erlang_proper_client_outlet_type() }
            , {'coords', binary() }
            , {'isMain', boolean() }
            , {'shopOutletCode', binary() }
            , {'visibility', ympa_erlang_proper_client_outlet_visibility_type:ympa_erlang_proper_client_outlet_visibility_type() }
            , {'address', ympa_erlang_proper_client_outlet_address_dto:ympa_erlang_proper_client_outlet_address_dto() }
            , {'phones', list(binary(1), 1) }
            , {'workingSchedule', ympa_erlang_proper_client_outlet_working_schedule_dto:ympa_erlang_proper_client_outlet_working_schedule_dto() }
            , {'deliveryRules', list(ympa_erlang_proper_client_outlet_delivery_rule_dto:ympa_erlang_proper_client_outlet_delivery_rule_dto()) }
            , {'storagePeriod', integer() }
            , {'id', integer() }
            , {'status', ympa_erlang_proper_client_outlet_status_type:ympa_erlang_proper_client_outlet_status_type() }
            , {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            , {'shopOutletId', binary() }
            , {'workingTime', binary() }
            , {'moderationReason', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

