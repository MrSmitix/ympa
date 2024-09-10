-module(ympa_erlang_proper_client_feed_download_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_download_dto/0]).

-export([ympa_erlang_proper_client_feed_download_dto/1]).

-export_type([ympa_erlang_proper_client_feed_download_dto/0]).

-type ympa_erlang_proper_client_feed_download_dto() ::
  [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
  | {'error', ympa_erlang_proper_client_feed_download_error_dto:ympa_erlang_proper_client_feed_download_error_dto() }
  ].


ympa_erlang_proper_client_feed_download_dto() ->
    ympa_erlang_proper_client_feed_download_dto([]).

ympa_erlang_proper_client_feed_download_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
            , {'error', ympa_erlang_proper_client_feed_download_error_dto:ympa_erlang_proper_client_feed_download_error_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

