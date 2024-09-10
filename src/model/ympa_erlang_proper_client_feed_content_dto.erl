-module(ympa_erlang_proper_client_feed_content_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_content_dto/0]).

-export([ympa_erlang_proper_client_feed_content_dto/1]).

-export_type([ympa_erlang_proper_client_feed_content_dto/0]).

-type ympa_erlang_proper_client_feed_content_dto() ::
  [ {'rejectedOffersCount', integer() }
  | {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
  | {'totalOffersCount', integer() }
  | {'error', ympa_erlang_proper_client_feed_content_error_dto:ympa_erlang_proper_client_feed_content_error_dto() }
  ].


ympa_erlang_proper_client_feed_content_dto() ->
    ympa_erlang_proper_client_feed_content_dto([]).

ympa_erlang_proper_client_feed_content_dto(Fields) ->
  Default = [ {'rejectedOffersCount', integer() }
            , {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
            , {'totalOffersCount', integer() }
            , {'error', ympa_erlang_proper_client_feed_content_error_dto:ympa_erlang_proper_client_feed_content_error_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

