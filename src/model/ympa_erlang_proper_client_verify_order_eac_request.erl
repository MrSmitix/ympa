-module(ympa_erlang_proper_client_verify_order_eac_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_verify_order_eac_request/0]).

-export([ympa_erlang_proper_client_verify_order_eac_request/1]).

-export_type([ympa_erlang_proper_client_verify_order_eac_request/0]).

-type ympa_erlang_proper_client_verify_order_eac_request() ::
  [ {'code', binary() }
  ].


ympa_erlang_proper_client_verify_order_eac_request() ->
    ympa_erlang_proper_client_verify_order_eac_request([]).

ympa_erlang_proper_client_verify_order_eac_request(Fields) ->
  Default = [ {'code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

