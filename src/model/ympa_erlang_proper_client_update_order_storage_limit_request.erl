-module(ympa_erlang_proper_client_update_order_storage_limit_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_storage_limit_request/0]).

-export([ympa_erlang_proper_client_update_order_storage_limit_request/1]).

-export_type([ympa_erlang_proper_client_update_order_storage_limit_request/0]).

-type ympa_erlang_proper_client_update_order_storage_limit_request() ::
  [ {'newDate', date() }
  ].


ympa_erlang_proper_client_update_order_storage_limit_request() ->
    ympa_erlang_proper_client_update_order_storage_limit_request([]).

ympa_erlang_proper_client_update_order_storage_limit_request(Fields) ->
  Default = [ {'newDate', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

