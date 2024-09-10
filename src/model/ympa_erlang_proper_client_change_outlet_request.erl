-module(ympa_erlang_proper_client_change_outlet_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_change_outlet_request/0]).

-export([ympa_erlang_proper_client_change_outlet_request/1]).

-export_type([ympa_erlang_proper_client_change_outlet_request/0]).

-type ympa_erlang_proper_client_change_outlet_request() ::
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
  ].


ympa_erlang_proper_client_change_outlet_request() ->
    ympa_erlang_proper_client_change_outlet_request([]).

ympa_erlang_proper_client_change_outlet_request(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

