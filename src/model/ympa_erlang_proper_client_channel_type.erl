-module(ympa_erlang_proper_client_channel_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_channel_type/0]).

-export([ympa_erlang_proper_client_channel_type/1]).

-export_type([ympa_erlang_proper_client_channel_type/0]).

-type ympa_erlang_proper_client_channel_type() ::
  [ 
  ].


ympa_erlang_proper_client_channel_type() ->
    ympa_erlang_proper_client_channel_type([]).

ympa_erlang_proper_client_channel_type(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

