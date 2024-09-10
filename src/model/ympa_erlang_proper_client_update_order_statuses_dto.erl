-module(ympa_erlang_proper_client_update_order_statuses_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_statuses_dto/0]).

-export([ympa_erlang_proper_client_update_order_statuses_dto/1]).

-export_type([ympa_erlang_proper_client_update_order_statuses_dto/0]).

-type ympa_erlang_proper_client_update_order_statuses_dto() ::
  [ {'orders', list(ympa_erlang_proper_client_update_order_status_dto:ympa_erlang_proper_client_update_order_status_dto()) }
  ].


ympa_erlang_proper_client_update_order_statuses_dto() ->
    ympa_erlang_proper_client_update_order_statuses_dto([]).

ympa_erlang_proper_client_update_order_statuses_dto(Fields) ->
  Default = [ {'orders', list(ympa_erlang_proper_client_update_order_status_dto:ympa_erlang_proper_client_update_order_status_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

