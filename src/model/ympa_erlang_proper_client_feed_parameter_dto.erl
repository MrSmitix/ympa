-module(ympa_erlang_proper_client_feed_parameter_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_parameter_dto/0]).

-export([ympa_erlang_proper_client_feed_parameter_dto/1]).

-export_type([ympa_erlang_proper_client_feed_parameter_dto/0]).

-type ympa_erlang_proper_client_feed_parameter_dto() ::
  [ {'deleted', boolean() }
  | {'name', binary() }
  | {'values', list(integer()) }
  ].


ympa_erlang_proper_client_feed_parameter_dto() ->
    ympa_erlang_proper_client_feed_parameter_dto([]).

ympa_erlang_proper_client_feed_parameter_dto(Fields) ->
  Default = [ {'deleted', boolean() }
            , {'name', binary() }
            , {'values', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

