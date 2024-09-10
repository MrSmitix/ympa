-module(ympa_erlang_proper_client_set_order_delivery_date_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_order_delivery_date_request/0]).

-export([ympa_erlang_proper_client_set_order_delivery_date_request/1]).

-export_type([ympa_erlang_proper_client_set_order_delivery_date_request/0]).

-type ympa_erlang_proper_client_set_order_delivery_date_request() ::
  [ {'dates', ympa_erlang_proper_client_order_delivery_date_dto:ympa_erlang_proper_client_order_delivery_date_dto() }
  | {'reason', ympa_erlang_proper_client_order_delivery_date_reason_type:ympa_erlang_proper_client_order_delivery_date_reason_type() }
  ].


ympa_erlang_proper_client_set_order_delivery_date_request() ->
    ympa_erlang_proper_client_set_order_delivery_date_request([]).

ympa_erlang_proper_client_set_order_delivery_date_request(Fields) ->
  Default = [ {'dates', ympa_erlang_proper_client_order_delivery_date_dto:ympa_erlang_proper_client_order_delivery_date_dto() }
            , {'reason', ympa_erlang_proper_client_order_delivery_date_reason_type:ympa_erlang_proper_client_order_delivery_date_reason_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

