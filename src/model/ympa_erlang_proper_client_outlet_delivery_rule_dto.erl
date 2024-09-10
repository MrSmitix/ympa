-module(ympa_erlang_proper_client_outlet_delivery_rule_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_delivery_rule_dto/0]).

-export([ympa_erlang_proper_client_outlet_delivery_rule_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_delivery_rule_dto/0]).

-type ympa_erlang_proper_client_outlet_delivery_rule_dto() ::
  [ {'minDeliveryDays', integer() }
  | {'maxDeliveryDays', integer() }
  | {'deliveryServiceId', integer() }
  | {'orderBefore', integer() }
  | {'priceFreePickup', integer() }
  | {'unspecifiedDeliveryInterval', boolean() }
  ].


ympa_erlang_proper_client_outlet_delivery_rule_dto() ->
    ympa_erlang_proper_client_outlet_delivery_rule_dto([]).

ympa_erlang_proper_client_outlet_delivery_rule_dto(Fields) ->
  Default = [ {'minDeliveryDays', integer() }
            , {'maxDeliveryDays', integer() }
            , {'deliveryServiceId', integer() }
            , {'orderBefore', integer(0, 24) }
            , {'priceFreePickup', integer() }
            , {'unspecifiedDeliveryInterval', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

