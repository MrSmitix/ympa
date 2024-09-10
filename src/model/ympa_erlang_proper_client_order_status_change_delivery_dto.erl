-module(ympa_erlang_proper_client_order_status_change_delivery_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_status_change_delivery_dto/0]).

-export([ympa_erlang_proper_client_order_status_change_delivery_dto/1]).

-export_type([ympa_erlang_proper_client_order_status_change_delivery_dto/0]).

-type ympa_erlang_proper_client_order_status_change_delivery_dto() ::
  [ {'dates', ympa_erlang_proper_client_order_status_change_delivery_dates_dto:ympa_erlang_proper_client_order_status_change_delivery_dates_dto() }
  ].


ympa_erlang_proper_client_order_status_change_delivery_dto() ->
    ympa_erlang_proper_client_order_status_change_delivery_dto([]).

ympa_erlang_proper_client_order_status_change_delivery_dto(Fields) ->
  Default = [ {'dates', ympa_erlang_proper_client_order_status_change_delivery_dates_dto:ympa_erlang_proper_client_order_status_change_delivery_dates_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

