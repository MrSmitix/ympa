-module(ympa_erlang_proper_client_feed_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_dto/0]).

-export([ympa_erlang_proper_client_feed_dto/1]).

-export_type([ympa_erlang_proper_client_feed_dto/0]).

-type ympa_erlang_proper_client_feed_dto() ::
  [ {'id', integer() }
  | {'login', binary() }
  | {'name', binary() }
  | {'password', binary() }
  | {'uploadDate', datetime() }
  | {'url', binary() }
  | {'content', ympa_erlang_proper_client_feed_content_dto:ympa_erlang_proper_client_feed_content_dto() }
  | {'download', ympa_erlang_proper_client_feed_download_dto:ympa_erlang_proper_client_feed_download_dto() }
  | {'placement', ympa_erlang_proper_client_feed_placement_dto:ympa_erlang_proper_client_feed_placement_dto() }
  | {'publication', ympa_erlang_proper_client_feed_publication_dto:ympa_erlang_proper_client_feed_publication_dto() }
  ].


ympa_erlang_proper_client_feed_dto() ->
    ympa_erlang_proper_client_feed_dto([]).

ympa_erlang_proper_client_feed_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'login', binary() }
            , {'name', binary() }
            , {'password', binary() }
            , {'uploadDate', datetime() }
            , {'url', binary() }
            , {'content', ympa_erlang_proper_client_feed_content_dto:ympa_erlang_proper_client_feed_content_dto() }
            , {'download', ympa_erlang_proper_client_feed_download_dto:ympa_erlang_proper_client_feed_download_dto() }
            , {'placement', ympa_erlang_proper_client_feed_placement_dto:ympa_erlang_proper_client_feed_placement_dto() }
            , {'publication', ympa_erlang_proper_client_feed_publication_dto:ympa_erlang_proper_client_feed_publication_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

