-module(ympa_erlang_proper_client_feed_placement_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_placement_dto/0]).

-export([ympa_erlang_proper_client_feed_placement_dto/1]).

-export_type([ympa_erlang_proper_client_feed_placement_dto/0]).

-type ympa_erlang_proper_client_feed_placement_dto() ::
  [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
  | {'totalOffersCount', integer() }
  ].


ympa_erlang_proper_client_feed_placement_dto() ->
    ympa_erlang_proper_client_feed_placement_dto([]).

ympa_erlang_proper_client_feed_placement_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
            , {'totalOffersCount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

