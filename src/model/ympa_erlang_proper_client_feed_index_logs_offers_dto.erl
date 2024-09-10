-module(ympa_erlang_proper_client_feed_index_logs_offers_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_offers_dto/0]).

-export([ympa_erlang_proper_client_feed_index_logs_offers_dto/1]).

-export_type([ympa_erlang_proper_client_feed_index_logs_offers_dto/0]).

-type ympa_erlang_proper_client_feed_index_logs_offers_dto() ::
  [ {'rejectedCount', integer() }
  | {'totalCount', integer() }
  ].


ympa_erlang_proper_client_feed_index_logs_offers_dto() ->
    ympa_erlang_proper_client_feed_index_logs_offers_dto([]).

ympa_erlang_proper_client_feed_index_logs_offers_dto(Fields) ->
  Default = [ {'rejectedCount', integer() }
            , {'totalCount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

