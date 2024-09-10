-module(ympa_erlang_proper_client_order_status_change_delivery_dates_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_status_change_delivery_dates_dto/0]).

-export([ympa_erlang_proper_client_order_status_change_delivery_dates_dto/1]).

-export_type([ympa_erlang_proper_client_order_status_change_delivery_dates_dto/0]).

-type ympa_erlang_proper_client_order_status_change_delivery_dates_dto() ::
  [ {'realDeliveryDate', date() }
  ].


ympa_erlang_proper_client_order_status_change_delivery_dates_dto() ->
    ympa_erlang_proper_client_order_status_change_delivery_dates_dto([]).

ympa_erlang_proper_client_order_status_change_delivery_dates_dto(Fields) ->
  Default = [ {'realDeliveryDate', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

