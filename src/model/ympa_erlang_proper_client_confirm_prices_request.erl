-module(ympa_erlang_proper_client_confirm_prices_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_confirm_prices_request/0]).

-export([ympa_erlang_proper_client_confirm_prices_request/1]).

-export_type([ympa_erlang_proper_client_confirm_prices_request/0]).

-type ympa_erlang_proper_client_confirm_prices_request() ::
  [ {'offerIds', list(binary()) }
  ].


ympa_erlang_proper_client_confirm_prices_request() ->
    ympa_erlang_proper_client_confirm_prices_request([]).

ympa_erlang_proper_client_confirm_prices_request(Fields) ->
  Default = [ {'offerIds', list(binary(), 1, 200) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

