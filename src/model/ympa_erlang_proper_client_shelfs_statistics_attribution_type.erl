-module(ympa_erlang_proper_client_shelfs_statistics_attribution_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shelfs_statistics_attribution_type/0]).

-export_type([ympa_erlang_proper_client_shelfs_statistics_attribution_type/0]).

-type ympa_erlang_proper_client_shelfs_statistics_attribution_type() ::
  binary().

ympa_erlang_proper_client_shelfs_statistics_attribution_type() ->
  elements([<<"CLICKS">>, <<"SHOWS">>]).

