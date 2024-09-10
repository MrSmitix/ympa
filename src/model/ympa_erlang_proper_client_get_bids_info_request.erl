-module(ympa_erlang_proper_client_get_bids_info_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_bids_info_request/0]).

-export([ympa_erlang_proper_client_get_bids_info_request/1]).

-export_type([ympa_erlang_proper_client_get_bids_info_request/0]).

-type ympa_erlang_proper_client_get_bids_info_request() ::
  [ {'skus', list(binary()) }
  ].


ympa_erlang_proper_client_get_bids_info_request() ->
    ympa_erlang_proper_client_get_bids_info_request([]).

ympa_erlang_proper_client_get_bids_info_request(Fields) ->
  Default = [ {'skus', list(binary(), 1, 1500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

